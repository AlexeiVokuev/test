package ru.autotest.test.pages.VK;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VKfeedPage {
    public String VKfeedPageURL = "https://vk.com/feed";

    public VKfeedPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"l_pr\"]/a")
    private WebElement menuMain;

    @FindBy(id = "top_profile_link")
    private WebElement torProfileLink;

    @FindBy(xpath = "//*[@id=\"top_logout_link\"]")
    private WebElement topLogoutLink;

    @FindBy(className = "top_profile_name")
    private WebElement topProfileName;

    public void checkVKfeedPage(){
        String factURL = driver.getCurrentUrl();
        System.out.println("пытаемся сравнить " + VKfeedPageURL + " с " + factURL);
        Assert.assertEquals(VKfeedPageURL, factURL);
    }

    public void logOut(){
        System.out.println("выполняется клик на " + torProfileLink.getText());
        torProfileLink.click();
        try{
            System.out.println("подождем...");
            Thread.sleep(3000);
        }
        catch(Exception e){
            System.out.println("не вышло подождать");
            e.printStackTrace();
        }
        System.out.println("выполняется клик на " + topLogoutLink.getText());
        topLogoutLink.click();
        try{
            System.out.println("подождем...");
            Thread.sleep(3000);
        }
        catch(Exception e){
            System.out.println("не вышло подождать");
            e.printStackTrace();
        }
        System.out.println("клик на " + topLogoutLink.getText() + " выполнен");
    }

    public void goToProfile(){
        System.out.println("выполняется клик на " + menuMain.getText());
        menuMain.click();
        System.out.println("клик на " + menuMain.getText() + " выполнен");
    }

    public void profileNameCheck(String profileName) {
        String factname = topProfileName.getText();
        System.out.println("пытаемся сравнить " + profileName + " с " + factname);
        Assert.assertEquals(profileName, factname);
    }

}
