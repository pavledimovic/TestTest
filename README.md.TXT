Instructions:

You can run tests simply by running feature file, tests are grouped as a suite and they will run one after another in Chrome browser, 
They are written in Page Object pattern using Java code and gherkin syntax, compiled in maven with all dependencies stored in POM.xml file.

Tests will take screenshots if scenario fails to execute, and place where they can be stored can be set simply by adding a path in after hook, new .png file will be created.

Also, you should set your path to chromedriver in Test Utils package/class if you wanna run these tests localy on your machine.

NOTE: I have commented out step where we suppose to open new browser tab, did not work for me, I wrote ussual methods that I use for that, but unfortunatelly I didn have time to debug on this ocasion.

TASK2:
Regarding API test, I had big problems with authentification, api key didnt work, I tried to add it as a query string*even that is not recomended security wise, also to pass it as a parameter in header,
btw, when i type this request in terminal: "curl -H "X-CMC_PRO_API_KEY: MY API KEY NUMBER" -H "Accept: application/json" -d "start=1&limit=5000&convert=USD" -G https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest
" I can get valid response but nothing seems to work when I try to do it via RestAssured, I get error :API key missing: , as it is in mentioned that Java Script is forbiden, and I have more experience with POSTMAN then RestAssured, I didnt finish this task in time, so I only sent frontent test finished. Thank you for understanding. Cheers.

Example of small part of API test:

package APITest.APITestProject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class APITest {

private static String apiKey = "";
private static String URL = "https://pro-api.coinmarketcap.com/v1/{queryString}";    

@Test
public void test1() {

String query = "cryptocurrency/info";

given().pathParam("queryString", query).
when().get(URL).
then().assertThat()
                .statusCode(200).and()
                .contentType(ContentType.JSON).and()

                .header("date_added", "2015-08-07T00:00:00.000Z").and()

                .body("MRData.example.example.name", hasItems("ETH"))
                .body("MRData.example.example.technical_doc.URl", hasItems("https://github.com/ethereum/wiki/wiki/White-Paper")).and()
                .body("MRData.example.example.logo", hasItems("https://s2.coinmarketcap.com/static/img/coins/64x64/1027.png")).and()
                .body("MRData.example.example.example.url", hasItems("https://github.com/ethereum/wiki/wiki/White-Paper"));


    }
}


 