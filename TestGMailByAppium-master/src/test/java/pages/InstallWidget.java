package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;

public class InstallWidget extends BasePage {
    private final By appsBtn = By.xpath("//android.widget.TextView[contains(@content-desc,'Apps')]");
    private final By widgetsBtn = By.xpath("//android.widget.TextView[contains(@content-desc,'Widgets')]");
    WebElement element;

    public InstallWidget(AndroidDriver driver) {
        super(driver);
    }

    public InstallWidget start() throws InterruptedException {
        driver.navigate().back();
        driver.navigate().back();
        waitForVisibilityOf(appsBtn);
        driver.findElement(appsBtn).click();
        waitForVisibilityOf(widgetsBtn);
        driver.findElement(widgetsBtn).click();
        boolean exit = false;
        while(!exit)
        {
            element = null;
            try
            {
                element = driver.findElement(By.name("Kate Mobile"));
            }
            catch (Exception ex){}
            if(element==null)
            {
                Dimension size = driver.manage().window().getSize();
                int startx = (int) (size.width * 0.8);
                int endx = (int) (size.width * 0.20);
                int starty = size.height / 2;
                driver.swipe(startx, starty, endx, starty, 1000);
            }
            else exit = true;
        }
        TouchAction action = new TouchAction(driver);
        action.longPress(element).release().perform();
        driver.findElement(By.name("Primary")).click();
        System.out.println("Ending test " + new Object(){}.getClass().getName());
        return new InstallWidget(driver);
    }
}
