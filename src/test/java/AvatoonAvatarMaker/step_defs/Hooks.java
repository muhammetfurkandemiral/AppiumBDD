package AvatoonAvatarMaker.step_defs;

import AvatoonAvatarMaker.utils.Driver;
import org.junit.Before;
import org.junit.BeforeClass;

import java.util.concurrent.TimeUnit;

public class Hooks {


    @BeforeClass
    public static void setUp() {

        //Driver.get().get("http://127.0.0.1:4723/wd/hub");
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
}
