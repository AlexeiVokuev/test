package ru.autotest.test.steps.Ya;

import cucumber.api.java.bg.И;
import cucumber.api.java.bg.То;
import ru.autotest.test.pages.Ya.MainPage;
import ru.autotest.test.steps.BasicSteps;

public class MainPageSteps {

    private MainPage mainPage = new MainPage(BasicSteps.driver);

    @И("открыть главную страницу Yandex$")
    public void goToMainPage(){
        mainPage.goToMainPage();
    }

    @И("войти с почтой (.*) и паролем (.*)$")
    public void logIn(String login, String password){

        mainPage.logIn(login, password);
    }

    @То("открыта главная Yandex$")
    public void checkMainPage(){
        mainPage.checkMainPage();
    }
}
