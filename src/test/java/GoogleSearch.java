import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Selenium Programming");
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.findElement(By.id("L2AGLb")).click();
        System.out.println(driver.getCurrentUrl());
        System.out.println("Program executed successfully");
    }
}
