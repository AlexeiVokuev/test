package ru.autotest.test.pages.Ya;

import org.junit.Assert;
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

    public String MainPageURL = "https://yandex.ru/";

    public void goToMainPage(){
        System.out.println("пытаемся перейти к " + MainPageURL);
        driver.get(MainPageURL);
        System.out.println("переход к " + MainPageURL + " осуществлен");
    }

    public void checkMainPage(){
        String factURL = driver.getCurrentUrl();
        System.out.println("пытаемся сравнить " + MainPageURL + " с " + factURL);
        Assert.assertEquals(MainPageURL, factURL);
    }

    public void logIn(String login, String password){
        System.out.println("выполняется ввод логина/пароля: " + login + " / " + password);
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        System.out.println("ввод логина/пароля: " + login + " / " + password + " выполнен");
        System.out.println("выполняется клик на " + loginButton.getText());
        loginButton.click();
        System.out.println("клик на " + loginButton.getText() + " выполнен");
    }
}
