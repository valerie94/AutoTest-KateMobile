package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import util.ConstValue;

public class MainPageSendMain extends BasePage {
    private final String moreOptionsBtnXpath = "//android.widget.ImageButton[contains(@content-desc,'More options')]";
    private final String composeBtnName = "Compose";
    private final By toEdit = By.id("com.google.android.gm:id/to");
    private final By subjectEdit = By.id("com.google.android.gm:id/subject");
    private final By bodyEdit = By.id("com.google.android.gm:id/body");
    private final By sendBtn = By.id("com.google.android.gm:id/send");

    public MainPageSendMain(AndroidDriver driver) {
        super(driver);
    }

    public MainPageSendMain start() throws InterruptedException {
        driver.findElementByXPath(moreOptionsBtnXpath).click();
        driver.findElementByName(composeBtnName).click();
        waitForVisibilityOf(toEdit);

        driver.findElement(toEdit).sendKeys(ConstValue.email+"\n");
        driver.findElement(subjectEdit).sendKeys("TEST");
        driver.findElement(bodyEdit).sendKeys("TEST_BODY");
        driver.findElement(sendBtn).click();

        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
        return new MainPageSendMain(driver);
    }
}
