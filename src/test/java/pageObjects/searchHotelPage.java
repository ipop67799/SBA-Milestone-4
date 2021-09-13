package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchHotelPage {
	public WebDriver driver;
	By hotel = By.xpath("//div[contains(text(),'25 Cherry Street Burlington, Vermont 05401')]");
	
	public searchHotelPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement Hotel() {
		return driver.findElement(hotel);
	}
}
