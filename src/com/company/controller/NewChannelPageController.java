package com.company.controller;


import com.company.model.Person;
import com.company.view.NewChannelPage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollToEvent;
import javafx.scene.layout.HBox;


public class NewChannelPageController {

    NewChannelPage newChannelPage ;

    public NewChannelPageController(){

        newChannelPage = new NewChannelPage();
        chooseButtonController();

    }

    public void chooseButtonController(){

        for(Button i : newChannelPage.getChoose()){
            i.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    i.setText("selected");


                }
            });

        }





    }

    public NewChannelPage getNewChannelPage() {
        return newChannelPage;
    }
}
