package pages;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ConstValue;

public class MainPageSearch extends BasePage {
    private final By searchBtn = By.id("com.google.android.gm:id/search");
    private final By searchEdit = By.id("android:id/search_src_text");
    private final By letterSubject = By.name("TEST");
    private final By subjectLabel = By.id("com.google.android.gm:id/subject");

    public MainPageSearch(AndroidDriver driver) {
        super(driver);
    }

    public MainPageSearch start() throws InterruptedException {
        driver.findElement(searchBtn).click();
        driver.findElement(searchEdit).sendKeys(ConstValue.email+"\n");
        waitForVisibilityOf(letterSubject);

        driver.findElement(letterSubject).click();
        Assert.assertTrue(driver.findElement(subjectLabel).getText().equalsIgnoreCase(letterSubject.toString()));
        return new MainPageSearch(driver);
    }
}
