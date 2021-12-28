package com.company.controller;
import com.company.view.LoginPage;
import com.company.model.Person;

import static com.company.Main.persons;

public class CreateAccount {

     private LoginPage loginPage ;
     private Person person;

    public CreateAccount(){

        loginPage = new LoginPage();
        createAccount();


    }

    public void createAccount(){

        person = new Person(loginPage.getEntered_Username().getText(), loginPage.getEntered_password().getText(),
                loginPage.getNameField().getText(),loginPage.getNameField().getText());

        persons.add(person);







    }
}
