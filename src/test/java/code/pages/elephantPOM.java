package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class elephantPOM {
    public elephantPOM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2[.='Mother Elephant With Babies Soft Toy']")
    private WebElement header;
    @FindBy(xpath = "//h3[.='Price: $20']")
    private WebElement toysPrice;
    @FindBy(xpath = "//select[@name='quantity']")
    private WebElement quantityDropdown;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNowButton;
    @FindBy(xpath = "//input[@id='card_nmuber']")
    private WebElement cardNumber;
    @FindBy(xpath = "//select[@id='month']")
    private WebElement expMonth;
    @FindBy(xpath = "//select[@id='year']")
    private WebElement expYear;
    @FindBy(xpath = "//input[@id='cvv_code']")
    private WebElement cvvCode;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement payNowButton;
    @FindBy(xpath = "//h2[.='Payment successfull!']")
    private WebElement paymentSuccessfullHeader;

    public void setHeader(String str) {
        Assert.assertEquals(str,header.getText());
    }
    public void setToysPrice(String str) {
        String actualHeader=toysPrice.getText();
        if(actualHeader.contains(str)){
            System.out.println("Price verification passed");
        }else{
            System.out.println("Price verification has failed");
        }
    }
    private String expectedURL="https://demo.guru99.com/payment-gateway/index.php";
    private String actualURL=Driver.getDriver().getCurrentUrl();
    public void setURLVerification(String str){
        if(actualURL.contains(str)){
            Assert.assertEquals(expectedURL,actualURL);
        }else{
            Assert.assertNotEquals(expectedURL,actualURL);
        }
    }
    public void setQuantityDropdown(String str) {
        BrowserUtils.staticWait(2);
        Select select=new Select(quantityDropdown);
        select.selectByValue(str);
    }
    public void setBuyNowButton() {
        BrowserUtils.staticWait(1);
        buyNowButton.click();
    }

    public void setCardNumber(String str) {
        BrowserUtils.staticWait(1);
        cardNumber.sendKeys(str);
    }

    public void setExpMonth(String month) {
        BrowserUtils.staticWait(1);
        Select select=new Select(expMonth);
        select.selectByValue(month);
    }

    public void setExpYear(String year) {
        BrowserUtils.staticWait(1);
        Select select=new Select(expYear);
        select.selectByValue(year);
    }

    public void setCvvCode(String cvv) {
        BrowserUtils.staticWait(1);
        cvvCode.sendKeys(cvv);
    }

    public void setPayNowButton() {
        BrowserUtils.staticWait(1);
        payNowButton.click();
    }

    public void setPaymentSuccessfullHeader(String str) {
        Assert.assertEquals(str,paymentSuccessfullHeader.getText());
    }
}
