package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent  {

    public LeftNav() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement country;





    WebElement myElement;

    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {
            case "setupOne":
                myElement = setupOne;
                break;

            case "parameters":
                myElement = parameters;
                break;

            case "country":
                myElement = country;
                break;

        }
        clickFunction(myElement);


        //(//span[text()='Setup'])[1]
        //(//span[text()='(//span[text()='Setup']'])[1]
        // (//span[text()='Countries'])[1]
    }





}
