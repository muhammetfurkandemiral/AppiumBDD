package AvatoonAvatarMaker.pages;

import AvatoonAvatarMaker.utils.Driver;
import org.openqa.selenium.support.PageFactory;

import static AvatoonAvatarMaker.utils.Locators.POSE;

public class HomePage {


    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public void goToSave() {
        Driver.get().findElement(POSE).click();
    }

    public void removeApp() {
        Driver.get().removeApp("face.cartoon.picture.editor.emoji");
        int i=0;
        while (i<1) {
            Driver.get().launchApp();
            i++;
        }
    }
}
