package com.company.controller;


import com.company.view.LeftSideMainPage;
import  com.company.controller.ProfilePageController;
import com.company.view.MainPage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainPageController  extends VBox {

    private MainPage mainPage ;


    public MainPageController(){

        mainPage = new MainPage();

        newChannelButtonController();
        myProfileButtonController();

    }



    public void newChannelButtonController(){

        mainPage.getNewChannelBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                NewChannelPageController newChannelPageController = new NewChannelPageController();
                Stage newChannelStage = new Stage();
                newChannelStage.setScene(new Scene(newChannelPageController.getNewChannelPage()));
                newChannelStage.show();

            }
        });



    }

    public  void myProfileButtonController(){

        mainPage.getMyProfileBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                ProfilePageController profilePageController =new ProfilePageController();
                Stage profileStage  = new Stage();
                profileStage.setScene(new Scene(profilePageController.getProfilePage()));
                profileStage.show();



            }
        });

    }

    public MainPage getMainPage() {
        return mainPage;
    }


}
