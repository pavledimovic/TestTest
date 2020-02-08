package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	WebDriver driver;

	public MainPage(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
	}

	// Button ID's

	@FindBy(how = How.XPATH, using = "//td[2]//div[1]")
	public static WebElement List;
	
	@FindBy(how = How.CSS, using = ".cmc-button-group:nth-child(2) > .wn9odt-0:nth-child(2)") 
	public static WebElement ViewAll;
	
	@FindBy(how = How.CSS, using = ".cmc-table-row:nth-child(1) .svg-inline--fa") 
	public static WebElement crypto1;
	
	@FindBy(how = How.CSS, using = ".cmc-table-row:nth-child(2) .svg-inline--fa") 
	public static WebElement crypto2;
	
	@FindBy(how = How.CSS, using = ".cmc-table-row:nth-child(5) .svg-inline--fa") 
	public static WebElement crypto5;
	
	@FindBy(how = How.CSS, using = ".cmc-table-row:nth-child(6) .svg-inline--fa") 
	public static WebElement crypto6;
	
	@FindBy(how = How.CSS, using = ".cmc-table-row:nth-child(7) .svg-inline--fa") 
	public static WebElement crypto7;
	
	@FindBy(how = How.CSS, using = ".cmc-table-row:nth-child(8) .svg-inline--fa") 
	public static WebElement crypto8;
	
	@FindBy(how = How.CSS, using = ".cmc-menu-item:nth-child(1) > .cmc-link") 
	public static WebElement addToWatchlist;

	
	
	


}