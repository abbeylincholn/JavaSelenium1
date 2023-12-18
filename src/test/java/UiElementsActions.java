import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class UiElementsActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://omayo.blogspot.com/search?q=test");
        driver.manage().window().maximize();
        Thread.sleep(3000);

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























    }
}
