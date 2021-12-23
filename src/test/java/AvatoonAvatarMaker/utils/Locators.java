package AvatoonAvatarMaker.utils;

import org.openqa.selenium.By;

public class Locators {

    //Splash Screen
    public static final By NEXT = By.xpath("//*[@text='NEXT']");
    public static final By CLOSE_BUTTON = By.id("iv_close");

    //Create Avatar Screen
    public static final By BOY = By.id("iv_boy");
    public static final By GIRL = By.id("iv_girl");
    public static final By MANUAL_EDIT = By.id("iv_manual");

    //Face
    public static final By FACE_TYPE = By.xpath("//android.widget.FrameLayout[3]/android.widget.ImageView");

    //Hair
    public static final By HAIR_MENU = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[2]");
    public static final By HAIR_TYPE = By.xpath("//android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]");
    public static final By HAIR_COLOR = By.xpath("//androidx.recyclerview.widget.RecyclerView[1]/android.widget.FrameLayout[7]/android.view.View");

    //Eye
    public static final By EYE_MENU = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[3]");
    public static final By EYE_TYPE = By.xpath("//android.widget.FrameLayout[5]/android.view.ViewGroup/android.widget.ImageView[3]");

    //Beard
    public static final By BEARD_MENU = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[7]");
    public static final By BEARD_TYPE = By.xpath("//android.widget.FrameLayout[10]/android.view.ViewGroup/android.widget.ImageView[3]");

    //Notifications
    public static final By SAVE = By.xpath("//*[@text='Save']");
    public static final By CLAIM = By.xpath("//*[@text='Claim']");
    public static final By NOTIFICATION_NEXT = By.xpath("//*[@text='Next']");
    public static final By CLICK_SCREEN = By.xpath("//*[@text='Pick-a-Pic']");

    //Save to Gallery
    public static final By POSE = By.xpath("//*[@text='Pose']");
    public static final By POSE_TYPE = By.xpath("//android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[1]");
    public static final By SAVE_TO_GALLERY = By.xpath("//*[@text='Save to Gallery']");
    public static final By CLOSE_AD = By.xpath("//android.widget.RelativeLayout[3]/android.widget.ImageView");
    public static final By GALLERY = By.xpath("//*[@text='Gallery']");
    public static final By RESULT_TITLE = By.xpath("//*[@text='Share Pose']");
    public static final By DONE = By.xpath("//*[@text='Done']");
}
