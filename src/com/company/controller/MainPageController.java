package com.company.controller;
import com.company.view.MainPage;
import javafx.scene.layout.VBox;

public class MainPageController  extends VBox {

    private MainPage mainPage;

    public MainPageController() {
        mainPage =new MainPage();
    }

    public MainPage getMainPage() {
        return mainPage;
    }
}
