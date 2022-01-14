package com.company.controller;

import com.company.view.ChannelChatPage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ChannelChatPageController {

    ChannelChatPage channelChatPage;


    public ChannelChatPageController(){

        channelChatPage = new ChannelChatPage();

        sendButtonController();
    }

    public void sendButtonController(){

        channelChatPage.getSendBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String post = channelChatPage.getMessageField().getText();
                channelChatPage.getPosts().getItems().add(post);
                channelChatPage.getMessageField().clear();


            }
        });

    }

    public ChannelChatPage getChannelChatPage() {
        return channelChatPage;
    }
}
