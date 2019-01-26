package TextFieldsPage;

/*import common.Base;

*//**
 * Created by mrahman on 1/15/17.
 *//*
public class TextFields extends Base {

    public void typeOnUiTextField(){
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]", "Architecture");
    }
    public void typeOnUiTextFieldRounded(){
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]", "Rounded");
    }
    public void typeOnUiTextFieldSecure(){
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]", "test123");
    }
    public void typeOnUiTextFieldLeftView(){
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]", "Secure");
    }
    public void enterOnUiTextField(){
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]", "Architecture");
    }
    public void enterOnUiTextFieldRounded(){
        typeByXpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]", "Architecture");
    }

    public void checkTypeOnUiTextField(){
        typeOnUiTextField.click();
    }


    }*/

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextFields extends Base {

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable")
    WebElement textFieldsWholePage;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UITextField\"]")
    WebElement uiTextField;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Normal\"]")
    WebElement uiTextBox;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UITextField Rounded\"]")
    WebElement roundedTextField;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Rounded\"]")
    WebElement roundedTextBox;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UITextField Secure\"]")
    WebElement secureTextField;
    @FindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Secure\"]")
    WebElement secureTextBox;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UITextField (with LeftView)\"]")
    WebElement uiTextFieldWithLeftView;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Check\"]")
    WebElement uiTextFieldWithLeftViewTextBox;

    public void checkTextFieldsWholePage() { textFieldsWholePage.click();
    }
    public void checkUiTextField() { uiTextField.click();
    }
    public void checkUiTextBox() { uiTextBox.click();
    }
    public void checkRoundedTextField() { roundedTextField.click();
    }
    public void checkRoundedTextBox() { roundedTextBox.click();
    }
    public void checkSecureTextField() { secureTextField.click();
    }
    public void checkSecureTextBox() { secureTextBox.click();
    }
    public void checkUiTextFieldWithLeftView() { uiTextFieldWithLeftView.click();
    }
    public void checkUiTextFieldWithLeftViewTextBox() { uiTextFieldWithLeftViewTextBox.click();
    }
}