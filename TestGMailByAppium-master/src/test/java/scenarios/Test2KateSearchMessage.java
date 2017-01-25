package scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test2KateSearchMessage extends AndroidSetup {
    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tear() throws Exception {
        driver.quit();
    }

    @Test
    public void SearchMessage() throws InterruptedException {
        driver.findElement(By.id("com.perm.kate_new_6:id/action_messages")).click();
        driver.findElement(By.id("com.perm.kate_new_6:id/fl_button_search")).click();
        driver.findElement(By.name("Messages")).click();
        driver.findElement(By.id("com.perm.kate_new_6:id/tb_search")).sendKeys("starkova");
        driver.findElement(By.id("com.perm.kate_new_6:id/btn_search")).click();
        driver.findElement(By.id("com.perm.kate_new_6:id/tv_message_name")).click();
    }
}