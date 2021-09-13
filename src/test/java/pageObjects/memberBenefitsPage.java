package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class memberBenefitsPage {
	public WebDriver driver;
	By mobilecheckin = By.xpath("//h3[contains(text(),'Mobile Check-In and Mobile Key')]");
	public memberBenefitsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement mobileCheckIn() {
		return driver.findElement(mobilecheckin);
	}
}
