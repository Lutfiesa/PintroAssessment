package RegistrasiMurid;

import Keyword.loginSystemVA;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLoginPembayaranVA {

    WebDriver driver;
    loginSystemVA LoginSystemVA;

    @BeforeEach
    void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LoginSystemVA = new loginSystemVA(driver);

    }

    @AfterEach
    void tearDown(){

        driver.close();

    }

    @Test
    public void flowLoginAndVA() throws InterruptedException {

        driver.get("https://pmb-dev-alazharpontianak.pintro.id/");
        driver.manage().window().maximize();
        LoginSystemVA.loginWeb("2503003", "02031999");
        LoginSystemVA.pembayaranVA();

    }

}
