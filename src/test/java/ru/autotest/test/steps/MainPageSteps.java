package ru.autotest.test.steps;

import cucumber.api.java.bg.И;
import cucumber.api.java.bg.То;
import ru.autotest.test.pages.MainPage;

public class MainPageSteps {

    private MainPage mainPage = new MainPage(BasicSteps.driver);

    @И("открыть главную страницу$")
    public void goToMainPage(){
        mainPage.goToMainPage();
    }

    @И("войти с почтой (.*) и паролем (.*)$")
    public void logIn(String login, String password){
        mainPage.logIn(login, password);
    }

    @То("открыта главная$")
    public void checkMainPage(){
        mainPage.checkMainPage();
    }
}
