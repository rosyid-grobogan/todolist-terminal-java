package test;
import static main.java.com.rosyidgrobogan.view.TodoListView.*;
import static main.java.com.rosyidgrobogan.service.TodoListService.*;

public class TodoListViewTest {
    public static void main(String[] args) {
        //testShowTodoList();
        //testAddTodoList();
        //testDeleteTodoList();
    }

    public static void testShowTodoList(){
        addTodoList("Olah Raga");
        addTodoList("Sarapan");
        addTodoList("Membaca");
        addTodoList("Ngopi");

        viewShowTodoList();
    }

    public static void testAddTodoList(){
        addTodoList("Olah Raga");
        addTodoList("Sarapan");
        addTodoList("Membaca");
        addTodoList("Ngopi");

        viewAddTodoList();
        showTodoList();
    }

    public static void testDeleteTodoList(){
        addTodoList("Olah Raga");
        addTodoList("Sarapan");
        addTodoList("Membaca");
        addTodoList("Ngopi");

        showTodoList();
        viewDeleteTodoList();
        showTodoList();
    }
}
