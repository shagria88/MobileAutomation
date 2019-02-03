/*
package java.controlsPage;

//public class Controls {
//}

import controlsPage.Controls;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.uiCatalogPage.UiCatalog;

import static common.Base.ad;

public class TestControls extends controlsPage.Controls {
    controlsPage.Controls controls;
    @BeforeMethod
    public void navigate() throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad,UiCatalog.class);
        ui.getControls();
        controls = PageFactory.initElements(ad, Controls.class);
    }
    @Test
    public void standarSwithTet(){
        controls.setStandardSwitch();
    }
    @Test
    public void standarSliderTest(){
        controls.setStandarSlider();
    }
    @Test
    public void costumizedSliderTest(){
        controls.setCustomizedSlider();
    }
}*/
package java.controlsPage;

import controlsPage.Controls;
import uiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestControls extends Controls {
    Controls controls;

    @BeforeMethod
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getButtonPage();
        controls = PageFactory.initElements(ad, Controls.class);
    }
    @Test
    public void testControlsWholePage() throws InterruptedException {
        controls.checkButtonsWholePage();sleep(2);
    }
    @Test
    public void testSwitchOption() throws InterruptedException {
        controls.checkSwitchOption();sleep(2);
    }
    @Test
    public void testStandardSwitch() throws InterruptedException {
        controls.checkStandardSwitch();sleep(2);
    }
    @Test
    public void testSwitchButton() throws InterruptedException {
        controls.checkSwitchButton();sleep(2);
    }
    @Test
    public void testControlsView() throws InterruptedException {
        controls.checkControlsView();sleep(2);
    }
    @Test
    public void testUiSlider() throws InterruptedException {
        controls.checkUiSlider();sleep(2);
    }
    @Test
    public void testStandardSlider() throws InterruptedException {
        controls.checkStandardSlider();sleep(2);
    }
    @Test
    public void testSliderButton() throws InterruptedException {
        controls.checkSliderButton();sleep(2);
    }
    @Test
    public void testCustomSlider() throws InterruptedException {
        controls.checkCustomSlider();sleep(2);
    }
    @Test
    public void testCustomSliderButton() throws InterruptedException {
        controls.checkCustomSliderButton();sleep(2);
    }

}
