package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    WebElement myelement;

    public DialogContent() {  //Webdriver driver yazmistik gerek yok Parenti extend ettigimizden

        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "mat-input-0")
    public WebElement username;

    @FindBy(id = "mat-input-1")
    public WebElement password;

    @FindBy(css = " button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(linkText = "Got it!")
    public WebElement gotItBtn;



    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;//+ butonu

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;





    public void findElementClickFunction(String Elementname){

        switch (Elementname){
            case "loginButton" :
             myelement=loginButton;break;
            case "gotItBtn" :
                myelement=gotItBtn;break;

            case "addButton"  :
                myelement=addButton;break;
            case "saveButton" :
                myelement=saveButton;
        }
        clickFunction(myelement);
    }


    public void findElementAndSendKeys(String ElementName,String value){
        switch (ElementName){
            case "username" :
             myelement=username;break;
            case "password" :
                myelement=password;break;

            case "nameInput"   :
                myelement=nameInput;break;
            case "codeInput" :
                myelement=codeInput;break;
        }
        sendKeysFunction(myelement,value);
    }


    public void findElementAndVeryfyContainsText(String ElementName,String msg){
        switch (ElementName){
            case "msjContainer" :
                myelement=msjContainer;break;
        }
        verifyElementContainstext(myelement,msg);
    }


}