package ru.autotest.test.tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.autotest.test.pages.MailBoxPage;
import ru.autotest.test.pages.MainPage;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private static WebDriver driver;
    private static MainPage mainPage;
    private static MailBoxPage mailBoxPage;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        mailBoxPage = new MailBoxPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(mainPage.MainPageURL);
    }

    @Test
    public void loginTest(){
        mainPage.logIn("baranov.jet119@yandex.ru", "123Abcdef");
        String factUserName = mailBoxPage.userNameLabel.getText();
        Assert.assertEquals("baranov.jet119", factUserName);
    }

    @AfterClass
    public static void down(){
        mailBoxPage.logOut();
        driver.quit();
    }
}
