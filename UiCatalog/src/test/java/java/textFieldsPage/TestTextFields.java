package java.textFieldsPage;

import textFieldsPage.TextFields;
import uiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestTextFields extends TextFields {

    public TextFields TextFields() {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getAlerts();
        return PageFactory.initElements(ad, TextFields.class);
    }

    @Test
    public void testTextFieldsWholePage() throws InterruptedException {
        TextFields().checkTextFieldsWholePage();
        sleep(2);
    }
    @Test
    public void testUiTextField() throws InterruptedException {
        TextFields().checkUiTextField();
        sleep(2);
    }
    @Test
    public void testUiTextBox() throws InterruptedException {
        TextFields().checkUiTextBox();
        sleep(2);
    }
    @Test
    public void testRoundedTextField() throws InterruptedException {
        TextFields().checkRoundedTextField();
        sleep(2);
    }
    @Test
    public void testRoundedTextBox() throws InterruptedException {
        TextFields().checkRoundedTextBox();
        sleep(2);
    }
    @Test
    public void testSecureTextField() throws InterruptedException {
        TextFields().checkSecureTextField();
        sleep(2);
    }
    @Test
    public void testSecureTextBox() throws InterruptedException {
        TextFields().checkSecureTextBox();
        sleep(2);
    }
    @Test
    public void testUiTextFieldWithLeftView() throws InterruptedException {
        TextFields().checkUiTextFieldWithLeftView();
        sleep(2);
    }
    @Test
    public void testUiTextFieldWithLeftViewTextBox() throws InterruptedException {
        TextFields().checkUiTextFieldWithLeftViewTextBox();
        sleep(2);
    }
}
