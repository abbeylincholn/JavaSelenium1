import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class UiElementsActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       /* driver.get("https://omayo.blogspot.com/search?q=test");
        driver.manage().window().maximize();
        Thread.sleep(3000); */

     // Display Radio Buttons Selection Option  -----------------------------------------------------------
 /*     WebElement radioOptionMale = driver.findElement(By.id("radio1"));
        WebElement radioOptionFemale = driver.findElement(By.id("radio2"));
        UiElementsActions uiElementsActions = new UiElementsActions();

        uiElementsActions.statusofMaleOption(radioOptionMale);
        radioOptionMale.click();
        uiElementsActions.statusofMaleOption(radioOptionMale);
        Thread.sleep(2000);


        radioOptionFemale.click();
        uiElementsActions.statusofFemaleOption(radioOptionFemale);
        uiElementsActions.statusofFemaleOption(radioOptionFemale);
        uiElementsActions.statusofMaleOption(radioOptionMale);


    }
    public void statusofMaleOption(WebElement radioOptionMale){
        if(radioOptionMale.isSelected()){
            System.out.println(" Male Selected");
        }else {
            System.out.println(" Male is not Selected ");
        }
    }

    public void statusofFemaleOption(WebElement radioOptionFemale){
        if(radioOptionFemale.isSelected()){
            System.out.println(" Female Selected ");
        }else {
            System.out.println(" Female is not Selected ");
        }
        */ // Display Radio Buttons Selection Option
 //-------------------------------------------------------------------------------------------

 // The select element (Drop Down) -----------------------------------------------------------------------
   /*    WebElement oldNewsLetters = driver.findElement(By.id("drop1"));
        Select oldNewsLettersSelect  = new Select(oldNewsLetters);
        oldNewsLettersSelect.selectByValue("mno");
        Thread.sleep(2000);
        oldNewsLettersSelect.selectByVisibleText("doc 2");
        Thread.sleep(2000);
        oldNewsLettersSelect.selectByIndex(1);
        Thread.sleep(2000);

        System.out.println(" Select Text " + oldNewsLetters.getText());
        //System.out.println("Select Text" + oldNewsLettersSelect.getFirstSelectedOption().getText()); */
 // The select element (Drop Down) -----------------------------------------------------------------------

 // File Upload -----------------------------------------------------------------------------------------
  /*      driver.navigate().to("https://the-internet.herokuapp.com/upload");
        Thread.sleep(2000);
        String currentDir = System.getProperty("user.dir");
        System.out.println(" Current Dir: " +currentDir);
        driver.findElement(By.xpath("//input[@name='file']")).sendKeys(currentDir+"/src/test/resources/pix/abb.jpg");
        driver.findElement(By.id("file-submit")).click(); */
     //   ------------------------------------------------------------------------------------------------------

  // Drag and Drop ----------------------------------------------------------------------------------------------
    /*   driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
        Thread.sleep(3000);
        WebElement elementA = driver.findElement(By.id("column-a"));
        WebElement elementB = driver.findElement(By.id("column-b"));
        Actions action = new Actions (driver);
        action.dragAndDrop(elementA, elementB).perform();  */
    //-------------------------------------------------------------------------------------------------

 // Javascrip Alerts (the three alert option), //button[text()='Click for JS Prompt']--------------------------------------------------------

    /*    driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Pass");
        driver.switchTo().alert().accept(); */

// Basic Auth --------------------------------------------------------------------
    //  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

// Iframes --------------------------------------------------------------------

     /*   driver.get("https://the-internet.herokuapp.com/iframe");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//span[text()='File']")).click();
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("Hello world");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();  // this help to click file switching out of the iframe
        driver.findElement(By.xpath("//span[text()='File']")).click(); */

// Scroll up & down in a page by script -------------------------------------------------------------------
     /*   driver.get("https://the-internet.herokuapp.com");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//a[@href='/typos']")).click();
        WebElement element = driver.findElement(By.xpath("//a[@href='/typos']"));
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()",element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",element);
        Thread.sleep(2000);

        WebElement element1 = driver.findElement(By.xpath("//a[@href='/abtest']"));
        JavascriptExecutor jv = (JavascriptExecutor) driver;
        jv.executeScript("arguments[0].scrollIntoView()",element1);  */








    }
}
