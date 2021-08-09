package StepsForTests;

import PageObjects.MainPage;

public class StepsToOpenLoginPage {
    private MainPage mainPage = new MainPage();

    public void openLoginPage(){

        mainPage.goToLoginPage();
    }
}
