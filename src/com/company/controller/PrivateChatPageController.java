package com.company.controller;

import com.company.view.PrivateChatPage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class PrivateChatPageController {

    PrivateChatPage privateChatPage ;


    public PrivateChatPageController(){

        privateChatPage = new PrivateChatPage();
        sendButtonController();

    }

    public  void sendButtonController(){

        privateChatPage.getSendBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String message = privateChatPage.getMessageField().getText();
                privateChatPage.getChat_List().getItems().add(message);

                privateChatPage.getMessageField().clear();



            }
        });

    }


    public PrivateChatPage getPrivateChatPage() {
        return privateChatPage;
    }
}


