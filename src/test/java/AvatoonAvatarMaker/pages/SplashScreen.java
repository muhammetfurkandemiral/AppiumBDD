package AvatoonAvatarMaker.pages;

import AvatoonAvatarMaker.utils.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static AvatoonAvatarMaker.utils.Locators.*;

public class SplashScreen {

    WebDriverWait wait = new WebDriverWait(Driver.get(), 30);

    public SplashScreen() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void skip() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NEXT)).click();
        Driver.get().findElement(NEXT).click();
        Driver.get().findElement(NEXT).click();
        Driver.get().findElement(CLOSE_BUTTON).click();
    }
}
