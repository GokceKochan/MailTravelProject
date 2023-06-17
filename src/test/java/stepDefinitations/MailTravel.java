package stepDefinitations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import page.MailTravelPage;
import utilities.BrowserUtils;
import utilities.Configuration_Reader;
import utilities.Driver;

public class MailTravel {

    MailTravelPage mailTravelPage=new MailTravelPage();

    @Given("User should enter the Mail Tavel web page")
    public void user_should_enter_the_mail_tavel_web_page() {
        Driver.getDriver().get(Configuration_Reader.getProperties("url"));
    }
    @Then("User should click the accept cookies")
    public void user_should_click_the_accept_cookies() {
        BrowserUtils.sleep(5);
      mailTravelPage.cookies.sendKeys(Keys.ENTER);
    }
    @Then("User verify title ‘Home Page | Mail Travel’")
    public void user_verify_title_home_page_mail_travel() {
        String expectedTitle = "Home Page | Mail Travel";
        String actualTitle = Driver.getDriver().getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title is as expected.Verification PASSED!");
        } else {
            System.out.println("Title is NOT as expected.Verification FAILED!");

        }
    }
    @Then("User should search <India> in searchbar")
    public void user_should_search_india_in_searchbar() {
        mailTravelPage.searchBar.sendKeys("India");
        mailTravelPage.india.click();
    }
    @Then("User should click on <BOOK ONLINE> button")
    public void user_should_click_on_book_online_button() {
      mailTravelPage.bookOnlineHeader.click();
      mailTravelPage.fieldError.get(0).isDisplayed();
        String expectedData="Please select your departure date";
        String actualData=mailTravelPage.fieldError.get(0).getText();
        if (actualData.equals(expectedData)) {
            System.out.println("Data is as expected.Verification PASSED!");
        } else {
            System.out.println("Data is NOT as expected.Verification FAILED!");

        }

    }
    @Then("User should be scroll to the bottom of the page and select the next available date.")
    public void user_should_be_scroll_to_the_bottom_of_the_page_and_select_the_next_available_date() {

        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", mailTravelPage.bookOnlineDown);
        mailTravelPage.bookOnlineDown.isDisplayed();
        mailTravelPage.availableDate.sendKeys(Keys.ENTER);
        mailTravelPage.availableDate.click();


    }
    @Then("User should select {int} adults")
    public void user_should_select_adults(Integer int1) {
        Select numOfAdults=new Select(mailTravelPage.numberOfAdultes);
        numOfAdults.selectByIndex(1);



    }
    @Then("User should be make the note Departure Airport")
    public void user_should_be_make_the_note_departure_airport() {
   Assert.assertEquals("Departure Airport:\nLondon Heathrow Airport",(mailTravelPage.displayAirport.getText()));
    }
    @Then("User should be Validation the Price for {int} Adults")
    public void user_should_be_validation_the_price_for_adults(Integer int1) {
    mailTravelPage.tourPrice.isDisplayed();
        String expectedTourPriceData= "£4,198";
        String actualTourPriceText=mailTravelPage.tourPrice.getText();
        if (expectedTourPriceData.equals(actualTourPriceText)) {
            System.out.println("Price for 2 Adults is displayed correctly: £4,198 " );
        } else {
            System.out.println("Price for 2 Adults is not displayed correctly: " );
        }

    }
    @Then("User should not see the ‘Please select your departure date’ text after the date selection")
    public void user_should_not_see_the_please_select_your_departure_date_text_after_the_date_selection() {

        if (mailTravelPage.fieldError.size()==0){
            System.out.println("Element is not exist" );
        }



    }
    @Then("User should click on Book online")
    public void user_should_click_on_book_online() {
        mailTravelPage.bookOnlineDown.click();

    }

    @Then("User should verify the Data,Departure and Passengers")
    public void user_should_verify_the_data_departure_and_passengers() {
     mailTravelPage.ddpDetails.click();
        String expectedVerifyAdult="2";
        String actualVerifyAdult=mailTravelPage.verifyAdult.getText();
        if (actualVerifyAdult.equals(expectedVerifyAdult)) {
            System.out.println("Adult:2 is PASSED " );
        } else {
            System.out.println("Adult:2 is FAILED " );
        }
        System.out.println("Airport  = " + mailTravelPage.verifyAirport.getText());
        Assert.assertEquals("London Heathrow (LHR)",(mailTravelPage.verifyAirport.getText()));

        String expectedVerifyDate="Thu, 12 Oct 2023";
        String actualVerifyDate=mailTravelPage.verifyDate.getText();
        if (actualVerifyDate.equals(expectedVerifyDate)) {
            System.out.println("Date is PASSED " );
        } else {
            System.out.println("Date is FAILED " );
        }
    }
    @Then("User should select number required as {int} under accomodition")
    public void user_should_select_number_required_as_under_accomodition(Integer int1) {
        Select numberRequired=new Select(mailTravelPage.numberRequired);
        numberRequired.selectByIndex(1);

    }
    @Then("User should be click on the ‘SELECT YOUR ROOMS AND CONTINUE’")
    public void user_should_be_click_on_the_select_your_rooms_and_continue() {
        mailTravelPage.selectRoomButton.click();
    }
    @Then("User should be filled the details for first adult")
    public void user_should_be_filled_the_details_for_first_adult() {
     Select adult1Title=new Select(mailTravelPage.adult1Title);
     adult1Title.selectByValue("Mrs");
     mailTravelPage.adult1FirstName.sendKeys("Gokce",Keys.TAB);
     mailTravelPage.adult1LastName.sendKeys("Eksi",Keys.TAB);
     mailTravelPage.adult1dod.sendKeys("1",Keys.TAB);
     mailTravelPage.adult1dom.sendKeys("January",Keys.TAB);
     mailTravelPage.adult1doy.sendKeys("2007",Keys.TAB);

    }
    @Then("User should be filled the details for second adult")
    public void user_should_be_filled_the_details_for_second_adult() {
    Select adult2Title=new Select(mailTravelPage.adult2Title);
    adult2Title.selectByIndex(1);
    mailTravelPage.adult2FirstName.sendKeys("Serdar",Keys.TAB);
    mailTravelPage.adult2LastName.sendKeys("Eksi",Keys.TAB);
    mailTravelPage.adult2dod.sendKeys("11",Keys.TAB);
    mailTravelPage.adult2dom.sendKeys("November",Keys.TAB);
    mailTravelPage.adult2doy.sendKeys("2005",Keys.TAB);
    }
    @Then("User should be filled the lead on the contact")
    public void user_should_be_filled_the_lead_on_the_contact() {
     mailTravelPage.contactName.sendKeys("Gokce Eksi",Keys.TAB);
     mailTravelPage.contactNumber.sendKeys("07305415123",Keys.TAB);
     mailTravelPage.contactEmail.sendKeys("gokce@yopmail.com",Keys.TAB);
     mailTravelPage.addressLine1.sendKeys("11 yop street",Keys.TAB);
     mailTravelPage.addressLine2.sendKeys("church road",Keys.TAB);
     mailTravelPage.city.sendKeys("London",Keys.TAB);
     mailTravelPage.postCode.sendKeys("sw11ss",Keys.TAB);
     mailTravelPage.country.sendKeys("United Kingdom",Keys.TAB);
     mailTravelPage.whereDidYouHeard.sendKeys("EMail",Keys.TAB);
        Actions actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        mailTravelPage.buttonContinue.sendKeys(Keys.ENTER);

    }

    @Then("User should check to display the Confirm Details + Book")
    public void user_should_check_to_display_the() {
     BrowserUtils.waitFor(3);
    Assert.assertTrue(mailTravelPage.confirmDetails.isDisplayed());
    }
    @Then("User should check to enable the Book Now button")
    public void user_should_check_to_enable_the() {
    Assert.assertTrue(mailTravelPage.bookButton.isEnabled());
    }

}
