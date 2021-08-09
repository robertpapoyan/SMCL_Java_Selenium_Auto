package StepsForTests;

import PageObjects.MainPage;

public class StepsToOpenLoginPage {
    MainPage mainPage = new MainPage();

    public void openLoginPage(){

        mainPage.goToLoginPage();
    }
}
