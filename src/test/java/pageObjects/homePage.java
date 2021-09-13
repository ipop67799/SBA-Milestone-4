package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	public WebDriver driver;
	By ourbrands = By.className("t-font-weight-bold");
	By jwmarriott = By.xpath("//header/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/ul[1]/li[4]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]");
	By destination = By.id("HFLKKWMW_search-location");
	By findhotel = By.cssSelector("body.t-bg-extralightgrey:nth-child(2) div.page-container.fixed-header:nth-child(3) div.id-content-wrapper div.l-row:nth-child(1) section.mi-sub-section.sub-section.t-bg-standard-20.l-margin-subsection-bottom-large.l-margin-tile-vertical-default.l-padding-tile-vertical-default.l-padding-subsection-vertical-none:nth-child(2) div.l-print-fullbleed.l-container div.l-s-col-4.l-m-col-8.l-s-col-last.l-m-col-last.l-l-col-12.l-xl-col-12.l-l-col-last.l-xl-col-last div.is-new-ux div.tile-hsearch-homepage.m-homepage-hsearch.l-hsearch-2.l-hsearch-takeover.l-hsearch-cntnr.l-hsearch-bottom.animate-search-form:nth-child(4) div.clearfix.homepage-search-form.l-form-container.l-clear form:nth-child(2) div.l-form-group.m-field-wrap.l-hsearch-labels.clearfix:nth-child(73) div.l-xs-col-4.l-xl-col-4.l-xl-last-col.l-hsearch-find.l-find-top.js-hform-fields.l-hsearch-find-homepage:nth-child(9) > button.analytics-click.js-is-roomkey-enabled.m-button.m-button-primary");
	By memberbenefits = By.xpath("//body/div[@id='page-container']/div[@id='main-body-wrapper']/div[1]/section[10]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[2]/a[1]");
	
	public homePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement ourBrands() {
		return driver.findElement(ourbrands);
	}
	
	public WebElement jwMarriott() {
		return driver.findElement(jwmarriott);
	}
	
	public WebElement Destination() {
		return driver.findElement(destination);
	}
	
	public WebElement findHotel() {
		return driver.findElement(findhotel);
	}
	
	public WebElement memberBenefits() {
		return driver.findElement(memberbenefits);
	}
	
}
