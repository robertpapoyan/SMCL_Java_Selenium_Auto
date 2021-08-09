package StepsForTests;

import PageObjects.RegistrationPage;

import java.util.Random;

public class StepsToRegisterAnAccount {
    private RegistrationPage regPage = new RegistrationPage();

    public void stepsToRegCorrectAccount() throws InterruptedException {
        regPage.regElementNameFieldClick();
        Random random = new Random(999999999);


        String randNum = Integer.toString(random.nextInt());
        while(randNum.contains("-")){
            randNum = Integer.toString(random.nextInt());
        }


        Random r = new Random();
        String alphabet = "123xyz";

        regPage.regElementNameField.sendKeys("robertss"+randNum);

        randNum = Integer.toString(random.nextInt());

        while(randNum.contains("-")){
            randNum = Integer.toString(random.nextInt());
        }

        System.out.println(randNum);

        regPage.regElementEmailFieldClick();
        regPage.regElementEmailField.sendKeys(alphabet.charAt(r.nextInt(alphabet.length()))+"asd@"+randNum+alphabet.charAt(r.nextInt(alphabet.length()))+".com"+alphabet.charAt(r.nextInt(alphabet.length())));

        regPage.regElementPasswordFieldClick();
        regPage.regElementPasswordField.sendKeys("asdasd123");

        regPage.regElementConfirmPasswordFieldClick();
        regPage.regElementConfirmPasswordField.sendKeys("asdasd123");

        regPage.regElementButtonClick();

        Thread.sleep(3000);

    }
}
