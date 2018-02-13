package ru.autotest.test.pages.Ya;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailBoxPage {

    public MailBoxPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    private WebDriver driver;

    @FindBy(id = "recipient-1")
    private WebElement userMenu;

    @FindBy(xpath = "//*[@id=\"nb-4\"]/div/div/div[8]/a")
    private WebElement menuExit;

    @FindBy(className = "mail-User-Name")
    public WebElement userNameLabel;

    public void logOut(){
        userMenu.click();
        menuExit.click();
    }

    public void checkMailBoxUserName(String userName) {
        String factUserName = userNameLabel.getText();
        Assert.assertEquals(userName, factUserName);
    }
}
