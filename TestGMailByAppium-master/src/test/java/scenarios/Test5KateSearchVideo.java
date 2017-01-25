package scenarios;

/**
 * Created by Valeriya on 25.01.2017.
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class Test5KateSearchVideo extends AndroidSetup {
    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tear() throws Exception {
        driver.quit();
    }

    @Test
    public void SearchVideo() throws InterruptedException {
        driver.findElement(By.id("com.perm.kate_new_6:id/action_video")).click();
        driver.findElement(By.id("com.perm.kate_new_6:id/fl_button_search")).click();
        driver.findElement(By.name("Video")).click();
        driver.findElement(By.id("com.perm.kate_new_6:id/tb_search")).sendKeys("Funny cats");
        driver.findElement(By.id("com.perm.kate_new_6:id/btn_search")).click();
    }
}
