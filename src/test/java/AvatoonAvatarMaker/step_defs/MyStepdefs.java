package AvatoonAvatarMaker.step_defs;

import AvatoonAvatarMaker.pages.CreatePage;
import AvatoonAvatarMaker.pages.HomePage;
import AvatoonAvatarMaker.pages.SaveToPage;
import AvatoonAvatarMaker.pages.SplashScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    CreatePage createPage = new CreatePage();
    SaveToPage saveToPage = new SaveToPage();
    SplashScreen splashScreen = new SplashScreen();

    @Given("Skip steps")
    public void skipSteps() {
        splashScreen.skip();
    }

    @Given("Choose gender {string}")
    public void chooseGender(String gender) {
        createPage.chooseGender(gender);
    }

    @When("Choose Manuel Edit")
    public void chooseManuelEdit() {
        createPage.manualEdit();
    }

    @When("Choose Face")
    public void chooseFace() {
        createPage.chooseFace();
    }

    @Then("Choose Hair")
    public void chooseHair() {
        createPage.chooseHair();
    }

    @And("Choose Eye")
    public void chooseEye() {
        createPage.chooseEye();
    }

    @And("Choose Beard")
    public void chooseBeard() {
        createPage.chooseBeard();
    }

    @And("Click Notifications")
    public void clickNotifications() {
        createPage.clickNotifications();
    }

    @And("Save Gallery and Verify")
    public void saveGalleryAndVerify() throws InterruptedException {
        homePage.goToSave();
        saveToPage.choosePoseType();
        saveToPage.saveToGallery();
        saveToPage.verifySave();
        homePage.removeApp();
    }
}
