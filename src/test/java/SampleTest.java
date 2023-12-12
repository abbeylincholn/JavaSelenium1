import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/");
        Thread.sleep(1000);
        driver.findElement(By.id("gparent_1")).sendKeys("abbeylincholn");
        driver.findElement(By.xpath("(//div [contains(text(),'Table With Checkbox')]//input[@type='checkbox'])[1]")).click();
    }
}
