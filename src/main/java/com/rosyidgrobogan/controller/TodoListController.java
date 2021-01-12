package main.java.com.rosyidgrobogan.controller;

import static main.java.com.rosyidgrobogan.model.TodoListModel.*;

public class TodoListController {

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
}
