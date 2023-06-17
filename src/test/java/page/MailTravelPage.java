package page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MailTravelPage {
    public MailTravelPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "button[id^='onetrust-accept']")
    public WebElement cookies;

    @FindBy(id = "searchtext_freetext_search_form")
    public WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"as_ul\"]/li[1]/a")
    public WebElement india;

    @FindBy(id = "book-button-header")
    public WebElement bookOnlineHeader;

    @FindBy(xpath = "//div[(@class='fielderror')]")
    public List<WebElement> fieldError;

    @FindBy(id = "book-button")
    public WebElement bookOnlineDown;

    @FindBy(id="calbox-f0050aa159413059b0d39248658bdb50-1")
    public WebElement availableDate;

    @FindBy(name = "numAdults")
    public WebElement numberOfAdultes;

    @FindBy(id = "tour-price")
    public WebElement tourPrice;

    @FindBy(xpath = "(//div[@class='nbf_tpl_pms_bf_panel__title'])[1]")
    public WebElement ddpDetails;

    @FindBy(xpath = "//div[@class='nbf_tpl_pms_departure_select']")
    public WebElement displayAirport;

    @FindBy(xpath = "//div[@class='nbf_tpl_pms_bf_passenger_number unit size1of2 lastUnit']")
    public WebElement verifyAdult;

   // @FindBy(xpath = "//div[@class='nbf_tpl_pms_bf_departure_value unit size1of2 lastUnit']")
     @FindBy(xpath = "(//span[.='London Heathrow (LHR) '])[1]")
    public WebElement verifyAirport;

    @FindBy(xpath = "//div[@class='nbf_tpl_pms_bf_departuredate']")
    public WebElement verifyDate;
    @FindBy(xpath = "(//div[@class='nbf_tpl_pms_bf_panel__title'])[3]")
    public WebElement accommodation;

    @FindBy(id = "room-1859919-numselect")
    public WebElement numberRequired;
    @FindBy(xpath = "//button[@class='nbf_button nbf_tpl_pms_book_button']")
    public WebElement selectRoomButton;
    @FindBy(id = "pax-a-title-1")
    public WebElement adult1Title;
    @FindBy(id = "pax-a-first-1")
    public WebElement adult1FirstName;
    @FindBy(id = "pax-a-last-1")
    public WebElement adult1LastName;
    @FindBy(id = "pax-a-dobd-1")
    public WebElement adult1dod;
    @FindBy(id = "pax-a-dobm-1")
    public WebElement adult1dom;
    @FindBy(id = "pax-a-doby-1")
    public WebElement adult1doy;
    @FindBy(id = "pax-a-title-2")
    public WebElement adult2Title;
    @FindBy(id = "pax-a-first-2")
    public WebElement adult2FirstName;
    @FindBy(id = "pax-a-last-2")
    public WebElement adult2LastName;
    @FindBy(id = "pax-a-dobd-2")
    public WebElement adult2dod;
    @FindBy(id = "pax-a-dobm-2")
    public WebElement adult2dom;
    @FindBy(id = "pax-a-doby-2")
    public WebElement adult2doy;
    @FindBy(id = "contact-name")
    public WebElement contactName;
    @FindBy(id = "contact-mobile")
    public WebElement contactNumber;
    @FindBy(id = "contact-email")
    public WebElement contactEmail;
    @FindBy(id = "contact-address1")
    public WebElement addressLine1;
    @FindBy(id = "contact-address2")
    public WebElement addressLine2;
    @FindBy(id = "contact-city")
    public WebElement city;
    @FindBy(id = "contact-postcode")
    public WebElement postCode;
    @FindBy(id = "contact-country")
    public WebElement country;
    @FindBy(id = "contact-hearabout")
    public WebElement whereDidYouHeard;
    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement buttonContinue;
    @FindBy(xpath = "//h1[.='Confirm Details + Book']")
    public WebElement confirmDetails;
    @FindBy(id = "nbf_booknow_button")
    public WebElement bookButton;

}
