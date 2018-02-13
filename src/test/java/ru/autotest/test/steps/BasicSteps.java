package ru.autotest.test.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.autotest.test.pages.MailBoxPage;
import ru.autotest.test.pages.MainPage;

import java.util.concurrent.TimeUnit;

public class BasicSteps {
    public static WebDriver driver;

    @Before
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public static void down(){
        driver.quit();
    }
}
