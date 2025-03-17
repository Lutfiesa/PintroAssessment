package Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginSystemVA {

    WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    By user = By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[1]/input");
    By pass = By.xpath("//*[@id=\"user-password\"]");
    By buttonLogin = By.xpath("//*[@id=\"login\"]");

    public loginSystemVA(WebDriver driver){

        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void loginWeb(String Username, String Password){

        driver.findElement(By.xpath("//*[@id=\"hide_on_scroll\"]/div/a[2]/button")).click();
        driver.findElement(user).sendKeys(Username);
        driver.findElement(pass).sendKeys(Password);
        driver.findElement(buttonLogin).click();

    }

    public void pembayaranVA() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div/div[2]/ul/li[2]/a/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div[1]/div[3]/div/div[2]/div/div"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"virtual\"]/div[2]/div[1]/div[2]/label/div[2]"))).click();
        driver.findElement(By.xpath("//*[@id=\"changeChannel\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"pay_now\"]")).click();
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[2]/div[1]/div[1]/div/div/div[1]"));
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div/div[3]/div[2]/img")).click();

    }
}
