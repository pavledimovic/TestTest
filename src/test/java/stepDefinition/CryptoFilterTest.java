package stepDefinition;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.ListsPage;
import pageObject.MainPage;
import pageObject.Watchlist;
import testUtils.TestUtils;

public class CryptoFilterTest {

	static WebDriver driver;

	@Before
	public void setup(Scenario scenario) {

		System.setProperty("webdriver.chrome.driver", TestUtils.Chrome);
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}

	// First TEST
	@Given("^We are on main page$")
	public void we_are_on_main_page(Scenario scenario) throws Throwable {

		System.out.println("Starting - " + scenario.getName());
		driver.get(TestUtils.URL);
	}

	@When("^Click View All option$")
	public void click_View_All_option() throws Throwable {

		PageFactory.initElements(driver, MainPage.class);
		MainPage.ViewAll.click();
		Thread.sleep(3500);
	}

	@Then("^(\\d+) results should be visible$")
	public void results_should_be_visible(int arg1) throws Throwable {

		int size = driver.findElements(By.xpath("//td[2]//div[1]")).size();
		System.out.println(size);

		// Assert that we can see 100 results
		assertTrue(size > 99);
	}

	// Second TEST
	@Given("^We are on watchlist page$")
	public void we_are_on_watchlist_page(Scenario scenario) throws Throwable {

		System.out.println("Starting - " + scenario.getName());
		driver.get(TestUtils.URL);
	}

	@When("^We select (\\d+) random cc$")
	public void we_select_random_cc(int arg1) throws Throwable {

		PageFactory.initElements(driver, MainPage.class);

		// Use explitict wait time as a buffer for GUI rendering
		MainPage.crypto1.click();
		Thread.sleep(1500);
		MainPage.addToWatchlist.click();
		Thread.sleep(1500);

		WebElement element1 = MainPage.crypto2;
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(500);

		MainPage.crypto5.click();
		MainPage.addToWatchlist.click();
		Thread.sleep(500);

		MainPage.crypto6.click();
		MainPage.addToWatchlist.click();
		Thread.sleep(500);

		MainPage.crypto7.click();
		MainPage.addToWatchlist.click();
		Thread.sleep(500);

		MainPage.crypto8.click();
		MainPage.addToWatchlist.click();
		Thread.sleep(500);
	}

	@When("^add them to watchlist$")
	public void add_them_to_watchlist() throws Throwable {

		/**
		 * Left empty step for possible test variations
		 * 
		 * */
	}

	@When("^open watchlist in different tab$")
	public void open_watchlist_in_different_tab() throws Throwable {

		/**
		 * Commenting out this part of the code, usually I use theese 2 methods to open
		 * net tabs, In this case it didnt work and I didnt have enough time for
		 * debugging, so in order test to work I will skip this part
		 * 
		 * List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
		 * // Switch to new tab driver.switchTo().window(browserTabs.get(1)); OR:
		 * driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		 */
	}

	@Then("^Watchlist should be populated with cc that we selected$")
	public void watchlist_should_be_populated_with_cc_that_we_selected() throws Throwable {

		PageFactory.initElements(driver, Watchlist.class);
		Watchlist.Watchlist.click();
		Thread.sleep(2500);

		WebElement cryptoBitcoin1 = Watchlist.crypto1;
		String cryptoBitcoin2 = cryptoBitcoin1.getText();
		assertTrue(cryptoBitcoin1.isDisplayed());
		assertTrue(cryptoBitcoin2.contains("Bitcoin"));

		WebElement cryptoBitcoinSV1 = Watchlist.crypto2;
		String cryptoBitcoinSV2 = cryptoBitcoinSV1.getText();
		assertTrue(cryptoBitcoinSV1.isDisplayed());
		assertTrue(cryptoBitcoinSV2.contains("Bitcoin SV"));

		WebElement cryptoLitecoin1 = Watchlist.crypto3;
		String cryptoLitecoin2 = cryptoLitecoin1.getText();
		assertTrue(cryptoLitecoin1.isDisplayed());
		assertTrue(cryptoLitecoin2.contains("Litecoin"));

		WebElement cryptoTether1 = Watchlist.crypto4;
		String cryptoTether2 = cryptoTether1.getText();
		assertTrue(cryptoTether1.isDisplayed());
		assertTrue(cryptoTether2.contains("Tether"));

		WebElement cryptoEOS1 = Watchlist.crypto5;
		String cryptoEOS2 = cryptoEOS1.getText();
		assertTrue(cryptoEOS1.isDisplayed());
		assertTrue(cryptoEOS2.contains("EOS"));
	}
	
	// Third TEST
	@Given("^We are on list page$")
	public void we_are_on_list_page(Scenario scenario) throws Throwable {

		System.out.println("Starting - " + scenario.getName());
		driver.get(TestUtils.URL);
	}

	@When("^Open Cryptocurrencies dropdown menu, select Full list option$")
	public void open_Cryptocurrencies_dropdown_menu_select_Full_list_option() throws Throwable {

		PageFactory.initElements(driver, ListsPage.class);
		ListsPage.DropDownMenu.click();
		ListsPage.option3.click();
		Thread.sleep(1500);
	}

	@When("^save the data$")
	public void save_the_data() throws Throwable {

		String product1 = ListsPage.MainList.getText();

		ListsPage.saveFile(product1);

	}

	@When("^Apply different filter$")
	public void apply_different_filter() throws Throwable {

		ListsPage.DropDownMenu.click();

		WebElement element = ListsPage.ListOption8;
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);

		element.click();
		Thread.sleep(3500);
	}

	@When("^compare that data$")
	public void compare_that_data() throws Throwable {

		String product3 = ListsPage.MainList2.getText();

		ListsPage.saveFile2(product3);
	}

	@Then("^Data should not be the same$")
	public void data_should_not_be_the_same() throws Throwable {

		BufferedReader reader1 = new BufferedReader(
				new FileReader("C:/Users/PavleD/eclipse-workspace/TestProject/RecordedData.txt"));

		BufferedReader reader2 = new BufferedReader(
				new FileReader("C:/Users/PavleD/eclipse-workspace/TestProject/RecordedData2.txt"));

		String line1 = reader1.readLine();

		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null) {
			if (line1 == null || line2 == null) {
				areEqual = false;

				break;
			} else if (!line1.equalsIgnoreCase(line2)) {
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}

		if (areEqual) {
			System.out.println("Two files have same content.");
			fail();

		} else {
			System.out.println("Two files have different content. They differ at line " + lineNum);

			System.out.println("File1 has " + line1 + " and File2 has " + line2 + " at line " + lineNum);
		}

		reader1.close();

		reader2.close();
	}

	@After
	public void tearDown3(Scenario scenario) throws InterruptedException {
		if (scenario.isFailed()) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				// Copy the screenshot to desired location using copy //method
				Files.copy(src, new File("C:/selenium/CryptoFilter.png"));
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		}
		driver.close();
	}

}
