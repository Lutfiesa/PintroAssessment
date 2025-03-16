package RegistrasiMurid;

import Keyword.formPendaftaranMuridBaru;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class testRegisterandLogin {

    @Test
    public void testFlowPendaftaranMurid() throws InterruptedException {

        WebDriver driver = WebDriverManager.chromiumdriver().create();
        formPendaftaranMuridBaru PagePendaftaran = new formPendaftaranMuridBaru(driver);
        driver.get("https://pmb-dev-alazharpontianak.pintro.id/");

        PagePendaftaran.inputDataMurid();
        PagePendaftaran.inputDataWali();
        PagePendaftaran.loginAndLogout();

    }

}