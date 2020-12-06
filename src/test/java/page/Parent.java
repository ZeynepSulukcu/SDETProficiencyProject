package page;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utility.Driver;

public class Parent {
    WebDriver driver;
    WebDriverWait wait;

    public Parent() {
        driver=Driver.getDriver();
        wait=new WebDriverWait(driver,10);
    }

    public void clickFunction(WebElement element){
            waitUntilClickable(element);             //element click bekle
            scrollToelement(element);                //scroll
            element.click();             //click
    }



    public void sendKeysFunction(WebElement element,String value){

       waitUntilVisible(element);  //element click bekle
       scrollToelement(element); //scroll
       element.clear(); //clear
       element.sendKeys(value); //value
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }


    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public void scrollToelement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", element);

    }

   /* public void waiting(int ms){


        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }*/

   public void verifyElementContainstext(WebElement element,String text){
       waitUntilVisible(element);
       //wait.until(ExpectedConditions.textToBePresentInElement(element,text));

     //  System.out.println(element.getText());
     //  System.out.println(text);

       Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));


   }

   public void veryfyElementContainsText(WebElement element,String text){
       waitUntilVisible(element);
       Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));

   }

}
