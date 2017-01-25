package scenarios;

import org.openqa.selenium.By;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Test1KateLogin extends AndroidLogin {

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tear() throws Exception {
        driver.quit();
    }

    @Test
    public void LoginTestLogin() throws InterruptedException {
        driver.findElement(By.id("com.perm.kate_new_6:id/username")).sendKeys("v.volkovaia@gmail.com");
        driver.findElement(By.id("com.perm.kate_new_6:id/password")).sendKeys("*888");
        driver.findElement(By.id("com.perm.kate_new_6:id/login_btn")).click();
    }
