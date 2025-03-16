import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSystem {

    @Test
    public void flowLogin() throws InterruptedException {

        WebDriver driver = WebDriverManager.chromiumdriver().create();
        Actions actions = new Actions(driver);
        driver.get("https://pmb-dev-alazharpontianak.pintro.id/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Gunakan elemen setelah ditemukan

        driver.findElement(By.xpath("//*[@id=\"hide_on_scroll\"]/div/a[2]/button")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[1]/input")).sendKeys("2503003");
        driver.findElement(By.xpath("//*[@id=\"user-password\"]")).sendKeys("02031999");
        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div/div[2]/ul/li[2]/a/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div[1]/div[3]/div/div[2]/div/div"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"virtual\"]/div[2]/div[1]/div[2]/label/div[2]"))).click();
        //driver.findElement(By.xpath("//*[@id=\"virtual\"]/div[2]/div[1]/div[2]/label/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"changeChannel\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"pay_now\"]")).click();
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[2]/div[1]/div[1]/div/div/div[1]"));
        Assertions.assertTrue(element2.isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div/div[3]/div[2]/img")).click();

    }

}
