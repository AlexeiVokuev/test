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

    @FindBy(id = "index_email")
    private WebElement loginField;

    @FindBy(id = "index_pass")
    private WebElement passwordField;

    @FindBy(id = "index_login_button")
    private WebElement loginButton;

    public void goToVKPage(){
        System.out.println("пытаемся перейти к " + VKPageURL);
        driver.get(VKPageURL);
        System.out.println("переход к " + VKPageURL + " осуществлен");
    }

    public void checkVKPage(){
        String factURL = driver.getCurrentUrl();
        System.out.println("пытаемся сравнить " + VKPageURL + " с " + factURL);
        Assert.assertEquals(VKPageURL, factURL);
    }

    public void logIn(String login, String password){
        System.out.println("выполняется ввод логина/пароля: " + login + " / " + password);
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        System.out.println("ввод логина/пароля: " + login + " / " + password + " выполнен");
        System.out.println("выполняется клик на " + loginButton.getText());
        loginButton.click();
        try{
            Thread.sleep(5000);
        }
        catch(Exception e){
            System.out.println("не вышло подождать");
            e.printStackTrace();
        }
        System.out.println("клик на " + loginButton.getText() + " выполнен");
    }
}
