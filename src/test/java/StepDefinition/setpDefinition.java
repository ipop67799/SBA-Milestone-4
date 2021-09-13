package StepDefinition;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import resource.Base;
import pageObjects.*;
@RunWith(Cucumber.class)
public class setpDefinition extends Base{
	public WebDriver driver = null;
	public memberBenefitsPage member = new memberBenefitsPage(driver);
	public homePage home = new homePage(driver);
	public searchHotelPage searchhotel = new searchHotelPage(driver);
	Logger log = LogManager.getLogger(homePage.class.getName());

	@Given("^User is on Home Page$")
    public void user_is_on_home_page() throws Throwable {
		driver = InitializeDriver();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\java\\resource\\data.properties");
		prop.load(fis);
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("HomePage load successful");
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
    }

    @When("^User click on \"([^\"]*)\"$")
    public void user_click_on_something(String strArg1) throws Throwable {
    	System.out.println(strArg1);
        if (strArg1.equalsIgnoreCase("Our Brands")) {
        	home.ourBrands().click();
        	log.info("Click successful");
    		TakesScreenshot scrShot =((TakesScreenshot)driver);
    		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        }
        else if (strArg1.endsWith("nefits")) {
        	home.memberBenefits().click();
        	log.info("Click successful");
    		TakesScreenshot scrShot =((TakesScreenshot)driver);
    		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        }
    }

    @When("^Enter a city name in the destination field, click on \"([^\"]*)\" and Search for \"([^\"]*)\"$")
    public void enter_a_city_name_in_the_destination_field_click_on_something_and_search_for_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
        if (strArg1.equalsIgnoreCase("Find Hotels")) {
        	home.Destination().sendKeys(strArg2);
        	home.findHotel().click();
        	log.info("Search successful");
    		TakesScreenshot scrShot =((TakesScreenshot)driver);
    		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        }
    }

    @Then("^\"([^\"]*)\" is listed in the list$")
    public void something_is_listed_in_the_list(String strArg1) throws Throwable {
    	System.out.println(strArg1);
    	if (strArg1.equalsIgnoreCase("Our Brands")) {
        	Assert.assertTrue(home.jwMarriott().isDisplayed());
        	log.info("Test execution successful");
    		TakesScreenshot scrShot =((TakesScreenshot)driver);
    		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        }
        else if (strArg1.equalsIgnoreCase("Member Benefits")) {
        	Assert.assertTrue(member.mobileCheckIn().isDisplayed());
        	log.info("Test execution successful");
    		TakesScreenshot scrShot =((TakesScreenshot)driver);
    		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        }
    }

    @Then("^Check the address in the first hotel in the search results list and verify if \"([^\"]*)\" present$")
    public void check_the_address_in_the_first_hotel_in_the_search_results_list_and_verify_if_something_present(String strArg1) throws Throwable {
    	System.out.println(strArg1);
    	String address = searchhotel.Hotel().getText();
    	Assert.assertEquals(strArg1, address);
    	log.info("Address match successful");
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
    }
}