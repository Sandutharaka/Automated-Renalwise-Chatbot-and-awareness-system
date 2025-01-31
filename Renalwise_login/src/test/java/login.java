import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
    @Test
    public void login() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8000/");
        WebElement login = driver.findElement(By.xpath("/html/body/div/nav/div/ul[2]/li[1]/a"));
        login.click();
        WebElement EnterUserName = driver.findElement(By.name("username"));
        EnterUserName.sendKeys("sanduni__Tharaka");
        WebElement EnterPassword = driver.findElement(By.name("password"));
        EnterPassword.sendKeys("Pass123#");
        WebElement LoginButton = driver.findElement(By.xpath("/html/body/div/div[2]/form/button"));
        LoginButton.click();
    }
}
