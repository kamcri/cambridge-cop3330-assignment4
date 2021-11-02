/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ucf.assignments;

import com.sun.tools.javac.jvm.Items;
import javafx.fxml.FXML;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

//Handle buttons clicked.

public class ListController {

    public displayLists List = new displayLists();
    public List todoList = new List();
    //declare a 'displayLists' object to use the methods
    //declare a 'list' object to use the methods?

    @FXML
    public void addListButton(ActionEvent event){
        //List.addList()
    }
    @FXML
    public void deleteListButton(ActionEvent event) {
        //List.deleteList()
    }
    @FXML
    public void editListButton(ActionEvent event){
        //List.editList()
    }
    @FXML
    public void saveListButton(ActionEvent event)
    {
        //List.save()
    }
    @FXML
    public void saveAllButton(ActionEvent event)
    {
        //List.saveAll()
    }
    @FXML
    public void loadListButton(ActionEvent event){
        //List.loadList();
    }

    @FXML
    public void addItemButton(ActionEvent event){
        //todoList.addItem() from List class
    }

    @FXML
    public void markCompleteButton(ActionEvent event){
        //todoList.markComplete()
    }

    @FXML
    public void markIncompleteButton(ActionEvent event){
        //todoList.markIncomplete()
    }

    @FXML
    public void editItemButton(ActionEvent event){
        //todoList.editItem()
    }

    @FXML
    public void deleteItemButton(ActionEvent event){
        //todoList.deleteItem()
    }

    @FXML
    public void showCompleteButton(ActionEvent event){
        //todoList.displayComplete()
    }

    @FXML
    public void showIncompleteButton(ActionEvent event){
        //todoList.displayIncomplete()
    }

    @FXML
    public void sortButton(ActionEvent event){
        //todoList.sortedItemsList()
    }

    @FXML
    public void defaultDisplay(){
        //todoList.displayAllItems()
    }
}

