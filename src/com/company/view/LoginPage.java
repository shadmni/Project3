package com.company.view;
import com.company.controller.CreateAccount;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.application.Application;
import javafx.scene.layout.Pane.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class LoginPage extends TabPane {
    private TextField entered_Username;
    private PasswordField entered_password;
    private TextField nameField;
    private Button enter_login;
    private TextField descriptionField;
    private Button enter_sighnin;


    public TextField getEntered_Username() {
        return entered_Username;
    }

    public PasswordField getEntered_password() {
        return entered_password;
    }

    public Button getEnter_login() {
        return enter_login;
    }

    public Button getEnter_sighnin() {
        return enter_sighnin;
    }

    public TextField getNameField() {
        return nameField;
    }

    public TextField getDescriptionField() {
        return descriptionField;
    }

    public LoginPage() {
        Image imagefirstpage = new Image("https://cdn.wallpapersafari.com/69/19/iLajcO.jpg");
        Label username = new Label("    Username");
        username.setTextFill(Color.GREEN);
        username.setFont(Font.font ("FontPosture.ITALIC", 18));
        username.setAlignment(Pos.CENTER);
        username.setPrefHeight(30);
        entered_Username = new TextField();
        Label password = new Label("    password");
        password.setPrefHeight(30);
        password.setAlignment(Pos.CENTER);
        password.setTextFill(Color.BLUE);
        password.setFont(Font.font ("FontPosture.ITALIC", 18));
        entered_password = new PasswordField();
        enter_login = new Button("login");
        enter_login.setPrefHeight(30);
        enter_login.setPrefWidth(240);
        VBox boxlogin = new VBox(username, entered_Username, password, entered_password, enter_login);
        boxlogin.setAlignment(Pos.TOP_LEFT);
        boxlogin.setMaxWidth(240);
        boxlogin.setPrefHeight(50);
        boxlogin.setSpacing(20);
        Tab login = new Tab("longin", boxlogin);

        //Sing in :

        Label username2 = new Label("username");
        username2.setTextFill(Color.GREEN);
        username2.setFont(Font.font ("FontPosture.ITALIC", 18));
        username2.setPrefHeight(30);
        username2.setAlignment(Pos.CENTER);
        entered_Username = new TextField();
        Label password2 = new Label("password");
        password2.setPrefHeight(30);
        password2.setAlignment(Pos.CENTER);
        password2.setTextFill(Color.BLUE);
        password2.setFont(Font.font ("FontPosture.ITALIC", 18));
        entered_password = new PasswordField();
        enter_sighnin = new Button("sighn in"); //this
        enter_sighnin.setPrefHeight(30);
        enter_sighnin.setPrefWidth(240);
        //name :
        Label nameLBL = new Label("name");
        nameField = new TextField();
        nameLBL.setPrefHeight(30);
        nameLBL.setPrefWidth(240);
        nameLBL.setAlignment(Pos.BOTTOM_LEFT);
        nameLBL.setTextFill(Color.ROSYBROWN);
        nameLBL.setFont(Font.font("FontPosture.ITALIC" , 22));

        //Description  :
        Label descriptionLBL = new Label("description ");
        descriptionField = new TextField();
        descriptionLBL.setPrefHeight(30);
        descriptionLBL.setPrefHeight(240);
        descriptionLBL.setAlignment(Pos.BOTTOM_LEFT);
        descriptionLBL.setTextFill(Color.TEAL);
        descriptionLBL.setFont(Font.font("FontPosture.ITALIC" , 18));




        VBox boxsighnin = new VBox(username2, entered_Username, password2, entered_password,nameLBL,nameField,descriptionLBL,descriptionField ,enter_sighnin);
        boxsighnin.setAlignment(Pos.TOP_LEFT);
        boxsighnin.setMaxWidth(240);
        boxsighnin.setMaxHeight(70);
        boxsighnin.setSpacing(20);
        Tab Sighnin = new Tab("Sighn in", boxsighnin);

        this.getTabs().add(login);
        this.getTabs().add(Sighnin);

      CreateAccount createAccount = new CreateAccount();
      createAccount.createAccount();

    }
}