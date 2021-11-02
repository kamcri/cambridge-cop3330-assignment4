package ucf.assignments;

import java.util.ArrayList;

//describes what a list is and adding items to the list

public class List {

    private String title;
    private ArrayList<Item> itemsList; //List of object 'Item'
    private ArrayList<Item> sortedItemsList;

    public void getTitle(){
        //return title
    }

    public void setTitle(String title){
        //this.title = title
    }

    public void createList(){
        //use setTitle() to create a new list
        //initialize the new list
    }

    public void addItem(Item item){
        //itemsList.add(item)
    }

    public void deleteItem(Item item){
        //itemsList.remove(item)
    }

    public void editItem(){
        //make sure item is selected
        //search for item in ArrayList<Item>
        //use the setter methods to change description and due date?
    }

    public void markComplete(){
        //find item in array list
        //change isComplete() from false to true?
    }

    public void markIncomplete(){
        //find item in array list
        //check if isComplete is set to true
        //if true, change isComplete() from true to false
    }

    public ArrayList<Item> displayAllItems(){
        //displays all items of a list. default
    }

    public ArrayList<Item> displayComplete() {
        //initialize a new ArrayList<Item> Complete
        //search through original array list
        //if isComplete() is true, add item to the 'Complete' ArrayList
        //return the new list
    }

    public ArrayList<Item> displayIncomplete() {
        //initialize a new ArrayList<Item> Incomplete
        //search through original array list
        //if isComplete() is false, add item to the 'Incomplete' ArrayList
        //return new list
    }

    public ArrayList<Item> sortedList(){
        //initialize the 'sortedItemsList'
        //On passed ArrayList, use comparator on getDueDate() from Item class
        //copy into sortedItemsList
        //return a sorted list
    }
}
