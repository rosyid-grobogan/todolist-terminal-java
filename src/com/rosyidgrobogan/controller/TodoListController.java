package com.rosyidgrobogan.controller;

import static com.rosyidgrobogan.model.TodoListModel.*;

public class TodoListController {

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
}
