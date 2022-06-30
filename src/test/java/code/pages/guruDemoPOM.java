package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class guruDemoPOM extends BrowserUtils {
    public guruDemoPOM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h3[.='Add Tariff Plan']")
    private WebElement addTariffButton;
    @FindBy(xpath = "//h1[.='Add Tariff Plans']")
    private WebElement tariffHeader;
    @FindBy(xpath = "//input[@placeholder='Monthly Rental']")
    private WebElement monthlyRentals;
    @FindBy(xpath = "//input[@name='local_minutes']")
    private WebElement freeLocalMinutes;
    @FindBy(xpath = "//input[@name='inter_minutes']")
    private WebElement freeInternationalMinutes;
    @FindBy(xpath = "//input[@name='sms_pack']")
    private WebElement FreeSMSPack;
    @FindBy(xpath = "//input[@name='minutes_charges']")
    private WebElement LocalMinutesPerCharges;
    @FindBy(xpath = "//input[@name='inter_charges']")
    private WebElement internationalMinutesCharges;
    @FindBy(xpath = "//input[@name='sms_charges']")
    private WebElement SMSperCharges;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//h2[.='Congratulation you add Tariff Plan']")
    private WebElement CongratulationHeader;

    public void setAddTariffButton() {
        BrowserUtils.staticWait(3);
        addTariffButton.click();

    }
    public void verifyHeader(String str){
        Assert.assertEquals(str,tariffHeader.getText());
    }
    public void fillingTable(Map<String, String> dataTable){
        monthlyRentals.sendKeys(dataTable.get("Monthly Rental"));
        freeLocalMinutes.sendKeys(dataTable.get("Free Local Minutes"));
        freeInternationalMinutes.sendKeys(dataTable.get("Free International Minutes"));
        FreeSMSPack.sendKeys(dataTable.get("Free SMS Pack"));
        LocalMinutesPerCharges.sendKeys(dataTable.get("Local Per Minutes Charges"));
        internationalMinutesCharges.sendKeys(dataTable.get("International Per Minutes Charges"));
        SMSperCharges.sendKeys(dataTable.get("SMS Per Charges"));
        BrowserUtils.staticWait(3);
    }

    public void setSubmitButton() {
        submitButton.click();
    }
    public void congratulationHeader(String str){
        Assert.assertEquals(str,CongratulationHeader.getText());
    }

    /******************************************************************************************/
    @FindBy(xpath = "//a[.='Add Customer']")
    private WebElement addCustomerButton;
    @FindBy(xpath = "//h1[.='Add Customer']")
    private WebElement CustomerHeader;

    public void setAddCustomerButton() {
        addCustomerButton.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.moveByOffset(0,0).click().build().perform();
        BrowserUtils.staticWait(3);
    }
    public void setVerifyCustomerHeader(String str){
        Assert.assertEquals(str, CustomerHeader.getText());
        BrowserUtils.staticWait(3);
    }

    @FindBy(xpath = "//label[@for='done']")
    private WebElement doneButton;
    @FindBy (xpath = "//label[@for='pending']")
    private WebElement pendingButton;
//    @FindBy (xpath = "//label[@for='done']")
//    private WebElement verifyDoneText;
//    @FindBy (xpath = "//label[@for='pending']")
//    private WebElement verifyPendingText;
//    @FindBy (xpath = "//h3[text()='Background Check']")
//    public List<WebElement> bcheck;
    public void setBackgroundCheck(String str){
        if(str.equalsIgnoreCase(doneButton.getText())){
           doneButton.click();
        }else if(str.equalsIgnoreCase(pendingButton.getText())){
            pendingButton.click();
        }
    }

    @FindBy(xpath = "//input[@id='fname']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id='lname']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailID;
    @FindBy(xpath = "//textarea[@id='message']")
    private WebElement address;
    @FindBy(xpath = "//input[@id='telephoneno']")
    private WebElement phoneNumber;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submit;


    public void setFillingInTableInfo(String firstname, String lastname, String email,
                                      String addRESS, String phoneNum){
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        emailID.sendKeys(email);
        address.sendKeys(addRESS);
        phoneNumber.sendKeys(phoneNum);
        submit.click();
        BrowserUtils.staticWait(3);
    }

    @FindBy(xpath = "//h1[.='Access Details to Guru99 Telecom']")
    private WebElement verifyAccessDetails;

    public void setVerifyAccessDetails(String str) {
        Assert.assertEquals(str,verifyAccessDetails.getText());
       // BrowserUtils.staticWait(2);
    }

}
