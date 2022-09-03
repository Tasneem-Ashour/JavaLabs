package org.example;

import org.example.Controller.ItemController;
import org.example.Controller.StoreController;
import org.example.Entity.Store;

public class Main {
    public static void main(String[] args) {

//        ItemController.getAllRecords();
//        ItemController.insertRecord();
//        ItemController.updateRecord();
//        ItemController.removeRecord();


//        StoreController.getAllRecords();
        StoreController.insertRecord(new Store("new store form jpa "));
      StoreController.updateRecord();
//        StoreController.removeRecord();

    }
}