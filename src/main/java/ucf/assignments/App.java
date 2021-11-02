/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ucf.assignments;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.beans.EventHandler;
import java.util.Objects;


public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("viewLists.fxml")));

        Scene scene = new Scene(root, 430, 325);

        stage.setTitle("To-Do List");
        stage.setScene(scene);
        stage.show();


    }
    public static void main(String[] args) {
        launch(args);
    }
}