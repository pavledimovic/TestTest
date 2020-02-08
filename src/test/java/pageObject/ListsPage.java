package pageObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ListsPage {

	WebDriver driver;

	public ListsPage(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
	}

	// Button ID's
	
	@FindBy(how = How.XPATH, using = "//div[@class='cmc-view-all-coins sc-1cmdcze-0 iyrcHR']")
	public static WebElement MainList;
	
	@FindBy(how = How.XPATH, using = "//div[@class='cmc-view-all-coins sc-1cmdcze-0 iyrcHR']")
	public static WebElement ListOption3;
	
	@FindBy(how = How.XPATH, using = "//div[@class='cmc-table-listing cmc-table-listing--is-tab-selected vmm4qx-0 hYnOSV']")
	public static WebElement MainList2;
	
	
	@FindBy(how = How.CSS, using = ".cmc-tab__trigger--selected span") 
	public static WebElement DropDownMenu;
	
	@FindBy(how = How.CSS, using = ".cmc-menu-item:nth-child(3) > .cmc-link") 
	public static WebElement option3;	
	
	@FindBy(how = How.CSS, using = ".cmc-menu-item:nth-child(8) > .cmc-link") 
	public static WebElement ListOption8;
		

	
	public static void saveFile(String product1) {
		
		String info = "Collected Informations";
		File file = new File("RecordedData" + ".txt");

		// Write result in .txt file
		try {
			FileWriter fw = new FileWriter(file, true);
			String lineSeparator = System.getProperty("line.separator");
			String[] ouput = info.split("\n");

			for (int i = 0; i <= ouput.length - 1; i++) {
				fw.write(ouput[i]);
				fw.write(lineSeparator);
			}
			fw.write(product1);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void saveFile2(String product3) {
		
		String info2 = "Collected Informations";
		File file2 = new File("RecordedData2" + ".txt");

		// Write result in .txt file
		try {
			FileWriter fw = new FileWriter(file2, true);
			String lineSeparator = System.getProperty("line.separator");
			String[] ouput = info2.split("\n");

			for (int i = 0; i <= ouput.length - 1; i++) {
				fw.write(ouput[i]);
				fw.write(lineSeparator);
			}
			fw.write(product3);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	


}