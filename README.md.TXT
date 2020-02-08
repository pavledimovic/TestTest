Instructions:

You can run tests simply by running feature file, tests are grouped as a suite and they will run one after another in Chrome browser, 
They are written in Page Object pattern using Java code and gherkin syntax, compiled in maven with all dependencies stored in POM.xml file.

Tests will take screenshots if scenario fails to execute, and place where they can be stored can be set simply by adding a path in after hook, new .png file will be created.

Also, you should set your path to chromedriver in Test Utils package/class if you wanna run these tests localy on your machine.

NOTE: I have commented out step where we suppose to open new browser tab, did not work for me, I wrote ussual methods that I use for that, but unfortunatelly I didn have time to debug on this ocasion.

TASK2:
Regarding API test, I had big problems with authentification, api key didnt work, I tried to add it as a query string*even that is not recomended security wise, also to pass it as a parameter in header, oauth2... but nothing seemd to work, as test mentioned that Java Script was forbiden, and I have more experience with POSTMAN then RestAssured, I didnt finish this task in time, so I only sent frontent task. Thank you for understanding. Cheers.

