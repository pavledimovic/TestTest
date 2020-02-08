package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Watchlist {

	WebDriver driver;

	public Watchlist(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
	}

	// Button ID's

	@FindBy(how = How.CSS, using = ".cmc-tab__trigger > .cmc-link")
	public static WebElement Watchlist;

	@FindBy(how = How.CSS, using = ".cmc-table-row:nth-child(1) .cmc-table__column-name")
	public static WebElement crypto1;

	@FindBy(how = How.CSS, using = ".cmc-table-row:nth-child(2) .cmc-table__column-name")
	public static WebElement crypto2;

	@FindBy(how = How.CSS, using = ".cmc-table-row:nth-child(3) .cmc-table__column-name")
	public static WebElement crypto3;

	@FindBy(how = How.CSS, using = ".cmc-table-row:nth-child(4) .cmc-table__column-name")
	public static WebElement crypto4;

	@FindBy(how = How.CSS, using = ".cmc-table-row:nth-child(5) .cmc-table__column-name")
	public static WebElement crypto5;

}