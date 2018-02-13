package ru.autotest.test.steps.Ya;

import cucumber.api.java.bg.И;
import cucumber.api.java.bg.То;
import ru.autotest.test.pages.Ya.MailBoxPage;
import ru.autotest.test.steps.BasicSteps;

public class MailBoxPageSteps {
    private MailBoxPage mailBoxPage = new MailBoxPage(BasicSteps.driver);

    @И("выйти из почты Yandex$")
    public void logOut(){
        mailBoxPage.logOut();
    }

    @То("открыта почта Yandex (.*)$")
    public void checkMailBoxUserName(String userName){
        mailBoxPage.checkMailBoxUserName(userName);
    }
}
