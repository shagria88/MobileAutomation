package androidPhone;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RealEstate extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[13]")
    public static WebElement realEstate;

    public void checkRealEstate() throws InterruptedException {
        menu.click();
        sleep(2);
        realEstate.click();
        scrollAndClickByName("US cybersecurity has been crippled by government shutdown");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "US cybersecurity has been crippled by government shutdown";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }

}
