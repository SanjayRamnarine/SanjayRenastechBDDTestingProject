package code.stepDefinitions;

import code.pages.elephantPOM;
import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.Map;

public class elephantSteps {
    elephantPOM elephant=new elephantPOM();
    @Given("The user wants to go the elephant website")
    public void the_user_wants_to_go_the_elephant_website() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("ElephantURL"));
        BrowserUtils.staticWait(2);
    }
    @Then("The user wants to verify {string}")
    public void the_user_wants_to_verify(String string) {
        elephant.setHeader(string);
    }
    @Then("The user wants to verify the toys price is {string}")
    public void the_user_wants_to_verify_the_toys_price_is(String string) {
        elephant.setToysPrice(string);
    }
    @Then("The user wants to verify that URL contains {string}")
    public void the_user_wants_to_verify_that_url_contains(String string) {
        elephant.setURLVerification(string);
    }
    @Then("The user wants to buy elephant toys as {string}")
    public void the_user_wants_to_buy_elephant_toys_as(String string) {
        elephant.setQuantityDropdown(string);
    }
    /*****************************************************/
    @Then("The user wants to enter card information")
    public void the_user_wants_to_enter_card_information() {
        elephant.setBuyNowButton();
    }
    @Then("The user wants to enter Credit Card Number as {string}")
    public void the_user_wants_to_enter_credit_card_number_as(String string) {
        elephant.setCardNumber(string);
    }
    @Then("The user wants to enter Expiration Month as {string}")
    public void the_user_wants_to_enter_expiration_month_as(String string) {
        elephant.setExpMonth(string);
    }
    @Then("The user wants to enter Expiraton Year as {string}")
    public void the_user_wants_to_enter_expiraton_year_as(String string) {
        elephant.setExpYear(string);
    }
    @Then("The user wants to enter CVVCode as {string}")
    public void the_user_wants_to_enter_cvv_code_as(String string) {
        elephant.setCvvCode(string);
    }
    @Then("The user wants to click on pay now")
    public void the_user_wants_to_click_on_pay_now() {
        elephant.setPayNowButton();
    }
    @Then("The user wants to verify purchased message as {string}")
    public void the_user_wants_to_verify_purchased_message_as(String string) {
        elephant.setPaymentSuccessfullHeader(string);
    }
    @Then("The user wants to enter card information in a list way")
    public void the_user_wants_to_enter_card_information_in_a_list_way(Map<String, String> dataTable) {
        elephant.setCardNumber(dataTable.get("cardNumber"));
        elephant.setExpYear(dataTable.get("expMonth"));
        elephant.setExpMonth(dataTable.get("expYear"));
        elephant.setCvvCode(dataTable.get("ccvCode"));
        elephant.setPayNowButton();
    }

    @Then("The user wants to buy {string}")
    public void the_user_wants_to_buy(String string) {
        elephant.setQuantityDropdown(string);
        elephant.setBuyNowButton();
    }
}
