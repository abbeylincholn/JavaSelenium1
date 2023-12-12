import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MyTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.get("https://opensource-demo.orangehrmlive.com");
        driver.get("https://www.amazon.co.uk/");
        Thread.sleep(4000);

        //driver.manage().window().maximize();
        driver.manage().window().setPosition(new Point(100, 100));
        Thread.sleep(5000);

        //driver.quit();
//        driver.navigate().to("https://www.amazon.co.uk/gp/bestsellers/?ref_=nav_cs_bestsellers");
//        Thread.sleep(4000);

        /* driver.navigate().refresh();
        Thread.sleep(4000);

        driver.navigate().back();
        Thread.sleep(4000);

        driver.navigate().forward(); */

        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.co.uk/gp/bestsellers/?ref_=nav_cs_bestsellers");
        Thread.sleep(4000);
        driver.close();
        Set<String> windowHandles = driver.getWindowHandles();


        driver.switchTo().window(windowHandles.stream().findFirst().get());
        Thread.sleep(4000);
        driver.navigate().to("https://www.amazon.co.uk/gp/bestsellers/?ref_=nav_cs_bestsellers");
        driver.close();

       }
}