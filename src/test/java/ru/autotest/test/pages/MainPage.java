package ru.autotest.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    private WebDriver driver;

    @FindBy(name = "login")
    private WebElement loginField;

    @FindBy(name = "passwd")
    private WebElement passwordField;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div[1]/div[2]/div/div/div/form/div/div[2]/button")
    private WebElement loginButton;

    public String MainPageURL = "https://yandex.ru";

    public void logIn(String login, String password){
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
