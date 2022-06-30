package code.stepDefinitions;

import code.pages.guruDemoPOM;
import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

import java.util.Locale;
import java.util.Map;

public class guruDemoSteps extends BrowserUtils {
    guruDemoPOM home=new guruDemoPOM();

    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("GuruUrl"));
        //BrowserUtils.waitForPageToLoad(5);

    }
    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {
        home.setAddTariffButton();

    }
    @Then("The user wants to verify {string} headerr")
    public void the_user_wants_to_verify_headerr(String string) {
        home.verifyHeader(string);

    }
    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String,String> dataTable) {
        home.fillingTable(dataTable);

    }
    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {
        home.setSubmitButton();

    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        home.congratulationHeader(string);
    }

    /******************************************************************************************/

    @When("the user wants to add a customer")
    public void the_user_wants_to_add_a_customer() {
        home.setAddCustomerButton();
    }
    @Then("the user wants to verify {string} header")
    public void the_user_wants_to_verify_header(String string) {
        home.setVerifyCustomerHeader(string);
    }
    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String bCheck) {
        home.setBackgroundCheck(bCheck);
    }
    @Then("The user wants to enter billingaddress as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billingaddress_as_and_and_and_and(String fName, String lName, String email,
     String address, String pNumber) {
        home.setFillingInTableInfo(fName,lName,email,address,pNumber);
    }
    @Then("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String string) {
        home.setVerifyAccessDetails(string);
    }

}
