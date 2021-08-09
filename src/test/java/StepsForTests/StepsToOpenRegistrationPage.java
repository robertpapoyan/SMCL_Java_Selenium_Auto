package StepsForTests;

import PageObjects.MainPage;

public class StepsToOpenRegistrationPage {
    private MainPage mainPage = new MainPage();

    public void openRegistrationPage(){

        mainPage.goToRegistrationPage();
    }
}
