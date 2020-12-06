package StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DialogContent;
import page.LeftNav;

public class CountrySteps {
    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();
    @Then("^Navigate to country page$")
    public void navigate_to_country_page()  {
   leftNav.findElementAndClickFunction("setupOne");
   leftNav.findElementAndClickFunction("parameters");
   leftNav.findElementAndClickFunction("country");

    }

    @When("^Create a country$")
    public void create_a_country()  {

        dialogContent.findElementClickFunction("addButton");
        dialogContent.findElementAndSendKeys("nameInput","zeynpUlkesi");
        dialogContent.findElementAndSendKeys("codeInput","12345");
        dialogContent.findElementClickFunction("saveButton");

    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed()  {

dialogContent.findElementAndVeryfyContainsText("msjContainer","successfully");
    }

}
