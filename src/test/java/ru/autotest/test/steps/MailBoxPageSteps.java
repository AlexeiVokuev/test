package ru.autotest.test.steps;

import cucumber.api.java.bg.И;
import cucumber.api.java.bg.То;
import ru.autotest.test.pages.MailBoxPage;

public class MailBoxPageSteps {
    private MailBoxPage mailBoxPage = new MailBoxPage(BasicSteps.driver);

    @И("выйти из почты$")
    public void logOut(){
        mailBoxPage.logOut();
    }

    @То("открыта почта (.*)$")
    public void checkMailBoxUserName(String userName){
        mailBoxPage.checkMailBoxUserName(userName);
    }
}
