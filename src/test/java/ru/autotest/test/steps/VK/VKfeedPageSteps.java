package ru.autotest.test.steps.VK;

import io.cucumber.java.ru.И;
import io.cucumber.java.ru.То;
import ru.autotest.test.pages.VK.VKfeedPage;
import ru.autotest.test.steps.BasicSteps;

public class VKfeedPageSteps {
    private VKfeedPage vkfeedPage = new VKfeedPage(BasicSteps.driver);

    @И("выйти из VK$")
    public void logOut(){
        vkfeedPage.logOut();
    }

    @То("открыта VK новости$")
    public void checkVKfeedPage(){
        vkfeedPage.checkVKfeedPage();
    }

    @И("пользователь (.*) авторизован")
    public void profileNameCheck(String profileName){
        vkfeedPage.profileNameCheck(profileName);
    }

    @И("перейти в VK на страницу профиля")
    public void goToProfile(){
        vkfeedPage.goToProfile();
    }

}
