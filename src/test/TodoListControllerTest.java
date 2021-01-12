package test;

public class TodoListControllerTest {
    public static void main(String[] args) {
        // test
        testInput();
    }

    public static void testInput(){
        String name = input("Nama");
        System.out.println("Hi "+ name);

        String hobby = input("Hobi");
        System.out.println("Saya suka " + hobby);
    }
}
