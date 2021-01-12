package main.java.com.rosyidgrobogan.view;
import static main.java.com.rosyidgrobogan.service.TodoListService.*;
import static main.java.com.rosyidgrobogan.controller.TodoListController.*;

public class TodoListView {
    public static void viewShowTodoList(){
        while (true){
            System.out.println("#TO DO LIST :");
            showTodoList();

            System.out.println();
            System.out.println("#MENU : ");
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
                System.out.println();
            }
        }

    }

    public static void viewAddTodoList(){
        System.out.println("TAMBAH TODOLIST");

        String todo = input("Todo (x Jika Batal");

        if (todo.equals("x")){
            // batal
        } else {
            addTodoList(todo);
        }
    }

    public static void viewDeleteTodoList(){}
}
