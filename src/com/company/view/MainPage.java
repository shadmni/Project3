package com.company.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;



public class MainPage extends VBox {

    private Button editProfileBTN;
    private Button newChannelBTN;
    private Button newGroupBTN;

    public MainPage(){

        editProfileBTN = new Button("Edit Profile");
        editProfileBTN.setAlignment(Pos.CENTER_LEFT);
        newChannelBTN = new Button("+New Channel");
        newChannelBTN.setAlignment(Pos.CENTER_LEFT);
        newGroupBTN = new Button("+New Group");
        newGroupBTN.setAlignment(Pos.CENTER_LEFT);
        TextField header = new TextField("");
        header.setAlignment(Pos.CENTER);
        VBox menu =new VBox(editProfileBTN,newGroupBTN,newChannelBTN);
        menu.setSpacing(10);
        SplitPane mainSPL = new SplitPane(menu,header);
        VBox  mainVbox =  new VBox(mainSPL);

    }

    public Button getEditProfileBTN() {
        return editProfileBTN;
    }

    public Button getNewChannelBTN() {
        return newChannelBTN;
    }

    public Button getNewGroupBTN() {
        return newGroupBTN;
    }
}
