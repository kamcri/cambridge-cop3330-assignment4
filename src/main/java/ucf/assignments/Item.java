/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package ucf.assignments;

import com.sun.tools.javac.jvm.Items;

import java.time.LocalDate;

//describing what an item is. setting description, due dates, and if it is complete

public class Item {
    private String description;
    private LocalDate dueDate;
    private boolean completed = false;

    public Item(String description, LocalDate date, boolean completed){
        /*this.setDueDate(date)
        this.setDescription(description)
        this.setComplete(completed)*/
    }

    public void getDescription(){
        //return description
    }

    public void setDescription(String description){
        //this.description = description
    }

    public void getDueDate(){
        //return dueDate
    }

    public void setDueDate(LocalDate dueDate){
        //this.dueDate = dueDate
    }

    public void isComplete(Items item){
        //return completed
    }

    public void setComplete(boolean completed) {
        //this.completed = completed
    }

    private void Formatter(){
        /*set date format to YYYY-MM-DD
        formatter = DateTimeFormatter.ofPattern yyyy-MM-dd*/
    }

    //this will show the actual description instead of the reference
    @Override
    public String toString(){
        //return description
    }

}




