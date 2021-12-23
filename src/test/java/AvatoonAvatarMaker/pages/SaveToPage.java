package AvatoonAvatarMaker.pages;

import AvatoonAvatarMaker.utils.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import static AvatoonAvatarMaker.utils.Locators.*;

public class SaveToPage {

    WebDriverWait wait = new WebDriverWait(Driver.get(), 20);

    public SaveToPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void choosePoseType() throws InterruptedException {
        Thread.sleep(8000);
        wait.until(ExpectedConditions.presenceOfElementLocated(POSE_TYPE)).click();
    }

    public void saveToGallery() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SAVE_TO_GALLERY)).click();
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(CLOSE_AD)).click();
            new TouchAction(Driver.get()).tap(PointOption.point(1030, 48)).release().perform();
        }
        catch (Exception e) {
            System.out.println("Ad not exist");
        }

    }

    public void verifySave() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(GALLERY)).click();
        String actual = Driver.get().findElement(RESULT_TITLE).getText();
        Assert.assertEquals(actual, "Share Pose");
        Driver.get().findElement(DONE).click();
    }
}
