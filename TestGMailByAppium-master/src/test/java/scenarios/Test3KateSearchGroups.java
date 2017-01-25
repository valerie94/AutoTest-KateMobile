package scenarios;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.LoginPage;

/**
 * Created by Valeriya on 25.01.2017.
 */
public class Test3KateSearchGroups extends AndroidSetup{
    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tear() throws Exception {
        driver.quit();
    }

    @Test

    public void SearchGroups() throws InterruptedException {
        driver.findElement(By.id("com.perm.kate_new_6:id/action_groups")).click();
        driver.findElement(By.id("com.perm.kate_new_6:id/fl_button_search")).click();
        driver.findElement(By.name("Groups")).click();
        driver.findElement(By.id("com.perm.kate_new_6:id/tb_search")).sendKeys("Genymotion");
        driver.findElement(By.id("com.perm.kate_new_6:id/btn_search")).click();
        driver.findElement(By.id("com.perm.kate_new_6:id/tv_group_name")).click();
    }
}
