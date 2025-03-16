import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationSystemTest {

    @Test
    public void flowRegis() throws InterruptedException {

        WebDriver driver = WebDriverManager.chromiumdriver().create();
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://pmb-dev-alazharpontianak.pintro.id/");
        driver.manage().window().maximize();
        Faker faker = new Faker();
        String randomName = faker.name().fullName();
        String randomEmail = faker.internet().emailAddress();


        //Informasi Calon Murid
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div[2]/div[1]/a/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"modalTerm\"]/div/div/div/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nav-info\"]/div[2]/div[1]/input")).sendKeys(randomName);
        driver.findElement(By.xpath("//*[@id=\"nav-info\"]/div[2]/div[3]/input")).sendKeys("Banyumas");
        driver.findElement(By.xpath("//*[@id=\"nav-info\"]/div[2]/div[4]/div/div[1]/input")).sendKeys("4");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nav-info\"]/div[2]/div[4]/div/div[2]/select")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-info\"]/div[2]/div[4]/div/div[2]/select/option[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-info\"]/div[2]/div[4]/div/div[3]/input")).sendKeys("2011");
        driver.findElement(By.xpath("//*[@id=\"nav-info\"]/div[2]/div[4]/label")).click();
        actions.sendKeys(Keys.SPACE).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"level\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"level\"]/option[5]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ng_department_id\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ng_department_id\"]/option[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ng_applicant_type_id\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ng_applicant_type_id\"]/option[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ng_class_level_id\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ng_class_level_id\"]/option[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ng_class_type_id\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ng_class_type_id\"]/option[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"test_type\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"test_type\"]/option[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nav-info\"]/div[4]/div[7]/div/div[1]/div[1]/button/div/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"bs-select-3-1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"school_of_origin_layout\"]/input")).sendKeys("Sekolah Lama");
        driver.findElement(By.xpath("//*[@id=\"nav-info\"]/div[4]/div[7]/label")).click();
        actions.sendKeys(Keys.SPACE).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nav-info\"]/div[6]/div[1]/div/div/div[1]/button/div/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"bs-select-6-10\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nav-info\"]/div[6]/div[3]/div/div/div[1]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"bs-select-7\"]/ul/li[11]")).click();
        driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
        Thread.sleep(2000);

        //Informasi Wali Murid
        driver.findElement(By.xpath("//*[@id=\"nav-parent\"]/div[1]/div[1]/input")).sendKeys("coco Cici");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nav-parent\"]/div[1]/div[2]/div[1]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"bs-select-8-2\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nav-parent\"]/div[1]/div[3]/select")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-parent\"]/div[1]/div[3]/select/option[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-parent\"]/div[1]/div[4]/textarea")).sendKeys("Jalan Jalan");
        driver.findElement(By.xpath("//*[@id=\"nav-parent\"]/div[1]/div[5]/div[1]/div[1]/input")).sendKeys("0812546984");
        driver.findElement(By.xpath("//*[@id=\"nav-parent\"]/div[1]/div[5]/div[1]/div[2]/input")).sendKeys(randomEmail);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nav-parent\"]/div[1]/div[5]/label")).click();
        actions.sendKeys(Keys.SPACE).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nav-parent\"]/div[1]/div[6]/div[1]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-parent\"]/div[1]/div[6]/div[1]/div/div[1]/input")).sendKeys("Indonesia");
        driver.findElement(By.xpath("//*[@id=\"bs-select-9-98\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nav-parent\"]/div[1]/div[7]/div[1]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-parent\"]/div[1]/div[7]/div[1]/div/div[1]/input")).sendKeys("Jakarta");
        driver.findElement(By.xpath("//*[@id=\"bs-select-14-34\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nav-parent\"]/div[1]/div[8]/div[1]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-parent\"]/div[1]/div[8]/div[1]/div/div[1]/input")).sendKeys("Jakarta Pusat");
        driver.findElement(By.xpath("//*[@id=\"bs-select-15-2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-parent\"]/div[1]/div[9]/input")).sendKeys("10111");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"terms\"]")));
        driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        //Validasi Data&Login
        driver.findElement(By.xpath("//*[@id=\"tab-info\"]/div[2]")).click();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();

        //Dashboard&Logout
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div/div[3]/div[2]/img")).click();

    }


}
