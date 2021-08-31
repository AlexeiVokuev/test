package ru.autotest.test.steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasicSteps {
    public static WebDriver driver;

    @Before
    public static void setup(){
        System.out.println("выполняется запуск драйвера...");
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("запуск драйвера выполнен");
    }

    @After
    public static void down(){
        System.out.println("завершение работы драйвера...");
        driver.quit();
        System.out.println("завершение работы выполнено");
    }
}
