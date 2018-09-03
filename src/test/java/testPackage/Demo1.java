package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
    WebDriver driver = new ChromeDriver();
    @Test
    public void method1() {
        driver.get("https://facebook.com");
    }
    @Test
    public void method2(){
        driver.navigate().to("https://bing.com");
        driver.close();
        driver.quit();
    }
}
