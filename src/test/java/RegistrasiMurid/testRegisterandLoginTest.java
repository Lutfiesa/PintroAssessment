package RegistrasiMurid;

import Keyword.formPendaftaranMuridBaru;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testRegisterandLoginTest {

    WebDriver driver;
    formPendaftaranMuridBaru inputDataPendaftaran;

    @BeforeEach
    void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        inputDataPendaftaran = new formPendaftaranMuridBaru(driver);

    }

    @AfterEach
    void tearDown(){

        driver.close();

    }

    @Test
    public void testFlowPendaftaranMurid() throws InterruptedException {
        driver.get("https://pmb-dev-alazharpontianak.pintro.id/");
        driver.manage().window().maximize();
        inputDataPendaftaran.inputDataMurid();
        inputDataPendaftaran.inputDataWali();
        inputDataPendaftaran.loginAndLogout();

    }

}