package main.java.com.rosyidgrobogan.view;
import static main.java.com.rosyidgrobogan.service.TodoListService.*;
import static main.java.com.rosyidgrobogan.controller.TodoListController.*;

public class TodoListView {
    public static void viewShowTodoList(){
        while (true){
            showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            String input = input("Pilih");
            if (input.equals("1")){
                viewAddTodoList();
            }else if(input.equals("2")){
                viewDeleteTodoList();
            }else if(input.equals("x")){
                break;
            }else {
                System.out.println("Pilihan tidak ada");
            }
        }

    }

    public static void viewAddTodoList(){}
    public static void viewDeleteTodoList(){}
}