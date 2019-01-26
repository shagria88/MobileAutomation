/*package ControlsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Controls {

    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Standard\"]")public static WebElement standardSwitch;
    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Standard\"]")public static WebElement standardSlider;
    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Custom\"]") public static WebElement customizedSlider;
    public void setStandardSwitch(){
        standardSwitch.click();
    }
    public void setStandarSlider(){
        standardSlider.click();
    }
    public void setCustomizedSlider(){
        customizedSlider.click();
    }

}*/

package ControlsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class Controls extends Base {

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable")
    public static WebElement controlsWholePage;
    @FindBy(xpath = "/XCUIElementTypeStaticText[@name=\"Stepper 1 to 10\"]")
    public static WebElement switchOption;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Standard Switch\"]")
    public static WebElement standardSwitch;
    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Standard\"]")
    public static WebElement switchButton;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ControlsViewController.m: -(UISwitch *)switchCtl\"]")
    public static WebElement controlsView;
    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"UISlider\"])[1]")
    public static WebElement uiSlider;
    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"UISlider\"])[1]")
    public static WebElement standardSlider;
    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Standard\"]")
    public static WebElement sliderButton;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Customized Slider\"]")
    public static WebElement customSlider;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Customized Slider\"]")
    public static WebElement customSliderButton;


    public void checkButtonsWholePage(){
        controlsWholePage.click();
    }
    public void checkSwitchOption(){
        switchOption.click();
    }
    public void checkStandardSwitch(){
        standardSwitch.click();
    }
    public void checkSwitchButton(){
        switchButton.click();
    }
    public void checkControlsView(){
        controlsView.click();
    }
    public void checkUiSlider(){
        uiSlider.click();
    }
    public void checkStandardSlider(){
        standardSlider.click();
    }
    public void checkSliderButton(){
        sliderButton.click();
    }
    public void checkCustomSlider(){
        customSlider.click();
    }
    public void checkCustomSliderButton(){
        customSliderButton.click();
    }

}
