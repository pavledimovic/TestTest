Instructions:

You can run tests simply by running feature file, tests are grouped as a suite and they will run one after another in Chrome browser, 
They are written in Page Object pattern using Java code and gherkin syntax, compiled in maven with all dependencies stored in POM.xml file.

Tests will take screenshots if scenario fails to execute, and place where they can be stored can be set simply by adding a path in after hook, new .png file will be created.

Also, you should set your path to chromedriver in Test Utils package/class if you wanna run these tests localy on your machine.

NOTE: I have commented out step where we suppose to open new browser tab, did not work for me, I wrote ussual methods that I use for that, but unfortunatelly I didn have time to debug on this ocasion.

