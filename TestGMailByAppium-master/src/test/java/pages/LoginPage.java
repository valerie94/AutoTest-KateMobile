package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import util.ConstValue;

import java.util.List;

public class LoginPage extends BasePage {
    private final By nextBtn = By.id("com.google.android.gsf.login:id/next_button");
    private final By userEdit = By.id("com.google.android.gsf.login:id/username_edit");
    private final By passwordEdit = By.id("com.google.android.gsf.login:id/password_edit");
    private final By okBtn = By.id("android:id/button1");
    private final By barSubtitle = By.id("By.id(\"android:id/action_bar_subtitle\")");


    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    public LoginPage start() throws InterruptedException {
        driver.findElement(nextBtn).click();
        driver.findElement(userEdit).sendKeys("v.volkovaia@gmail.com");
        driver.findElement(passwordEdit).sendKeys("Nightisyoung817");
        driver.findElement(nextBtn).click();
        driver.findElement(okBtn).click();
        waitForVisibilityOf(nextBtn);
        driver.findElement(nextBtn).click();

        Assert.assertTrue(driver.findElement(barSubtitle).getText().equalsIgnoreCase(ConstValue.email));
        return new LoginPage(driver);
    }
}
