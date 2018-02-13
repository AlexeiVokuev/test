package ru.autotest.test.steps.VK;

import cucumber.api.java.bg.И;
import cucumber.api.java.bg.То;
import ru.autotest.test.pages.VK.VKPage;
import ru.autotest.test.steps.BasicSteps;

public class VKPageSteps {
    private VKPage vkPage = new VKPage(BasicSteps.driver);

    @И("открыть главную страницу VK$")
    public void goToVKPage(){
        vkPage.goToVKPage();
    }

    @И("войти в VK с почтой (.*) и паролем (.*)$")
    public void logIn(String login, String password){
        vkPage.logIn(login, password);
    }

    @То("открыта VK$")
    public void checkVKPage(){
        vkPage.checkVKPage();
    }
}
