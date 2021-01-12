package test;


import static com.rosyidgrobogan.service.TodoListService.*;
import static com.rosyidgrobogan.model.TodoListModel.*;

class TodoListServiceTest {
    public static void main(String[] args) {
        // panggil
        //testShowTodoList();
        //testAddTodoList();
        testDeleteTodoList();
    }


    public static void testShowTodoList() {
        dataTodo[0] = "Belajar Java Fundamental";
        dataTodo[1] = "Belajar Java OOP";
        dataTodo[2] = "Belajar Java Advanced";

        showTodoList();
    }


    public static void testAddTodoList() {
        for (int i = 0; i < 25; i++){
            addTodoList("Insert ke-" + i);
        }
        showTodoList();
    }

    public static void testDeleteTodoList() {
        addTodoList("A");
        addTodoList("B");
        addTodoList("C");
        addTodoList("D");


        // hapus index yg lebih dari jumlah array
        boolean result = deleteTodoList(20); // false
        System.out.println(result);

//        result = deleteTodoList(4);
//        System.out.println(result);

        // hapus index
        result = deleteTodoList(1); // true
        System.out.println(result);

        showTodoList();
    }
}