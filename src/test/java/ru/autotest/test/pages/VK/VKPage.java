package ru.autotest.test.pages.VK;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VKPage{
    public String VKPageURL = "https://vk.com/";

    public VKPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    private WebDriver driver;

    @FindBy(name = "email")
    private WebElement loginField;

    @FindBy(name = "pass")
    private WebElement passwordField;

    @FindBy(id = "index_login_button")
    private WebElement loginButton;

    public void goToVKPage(){
        System.out.println("пытаемся перейти к " + VKPageURL);
        driver.get(VKPageURL);
    }

    public void checkVKPage(){
        String factURL = driver.getCurrentUrl();
        System.out.println("пытаемся сравнить " + VKPageURL + " с " + factURL);
        Assert.assertEquals(VKPageURL, factURL);
    }

    public void logIn(String login, String password){
        System.out.println("выполняется ввод логина/пароля..");
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        System.out.println("выполняется клик на " + loginButton.getText());
        loginButton.click();
    }
}
