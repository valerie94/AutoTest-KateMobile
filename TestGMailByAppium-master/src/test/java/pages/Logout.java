package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import util.ConstValue;

public class Logout extends BasePage {
    private final By googleLabel = By.name("Google");
    private final By emailLabel = By.name(ConstValue.email);
    private final By moreOptionsXPath = By.xpath("//android.widget.ImageButton[contains(@content-desc,'More options')]");
    private final By removeAccBtn = By.name("Remove account");
    private final By okBtn = By.id("android:id/button1");

    public Logout(AndroidDriver driver) {
        super(driver);
    }

    public Logout start() throws InterruptedException {
        driver.startActivity(ConstValue.settingPackage, ConstValue.settingActivity);
        driver.findElement(googleLabel).click();
        driver.findElement(emailLabel).click();
        driver.findElement(moreOptionsXPath).click();
        driver.findElement(removeAccBtn).click();
        driver.findElement(okBtn).click();

        System.out.println("Ending test " + new Object(){}.getClass().getName());
        return new Logout(driver);
    }
}



