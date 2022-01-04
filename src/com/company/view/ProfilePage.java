package com.company.view;

import javafx.scene.layout.VBox;

import java.awt.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import  java.awt.*;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;

    public class ProfilePage extends VBox {

        private TextField usernameField ;
        private TextField nameField;
        private TextField descriptionField ;
        private Button nameEditBTN;


        public Button getNameEditBTN() {
            return nameEditBTN;
        }

        public ProfilePage(){

            usernameField = new TextField();
            nameField = new TextField();
            descriptionField = new TextField();
            nameEditBTN = new Button();

            Label nameLBL = new Label("name : ");
            Label usernameLBL = new Label("username :");
            Label descriptionLBL = new Label("description : ");



        }

        public TextField getUsernameField() {
            return usernameField;
        }

        public TextField getNameField() {
            return nameField;
        }

        public TextField getDescriptionField() {
            return descriptionField;
        }
    }

