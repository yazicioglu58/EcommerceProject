package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class MainPage {
    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class='login']")
    public WebElement logInButton;

    @FindBy(id = "email")
    public WebElement emailIdField;

    @FindBy(id = "passwd")
    public WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"login_form\"]/div/p[1]/a")
    public WebElement forgotPasswordButton;

    public void login (String uid, String pwd){
        logInButton.click();
        BrowserUtils.waitForVisibility(emailIdField,4);
        emailIdField.sendKeys(uid);
        passwordField.sendKeys(pwd);
        BrowserUtils.waitForClickablility(signInButton,3);
        signInButton.click();
    }
}


