import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiElementsActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // Display Radio Buttons Selection
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
        */ // Display Radio Buttons Selection

    }
}
