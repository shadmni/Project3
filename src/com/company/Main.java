package com.company;
import com.company.controller.LoginPageController;
import com.company.model.Person;

import com.company.view.LoginPage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

        public static ArrayList<Person> persons = new ArrayList<>();
        public static Person person;

    public static  void main(String [] args ){

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        LoginPageController loginPageController = new LoginPageController();

        primaryStage.setScene(new Scene(loginPageController.getLoginPage()));
        primaryStage.setHeight(400);
        primaryStage.setWidth(400);

        primaryStage.show();

        /*LoginPage loginPage = new LoginPage();
        primaryStage.setScene(new Scene(loginPage));
        primaryStage.setHeight(800);
        primaryStage.setWidth(400);
        primaryStage.show();*/







    }
}
