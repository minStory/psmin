package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
//        String msg = "Hello, world!";

//        for (int i = 0; i < 3; i++) {
//            System.out.println(msg);
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(msg);
//        }
//
//        for (int i = 0; i < 7; i++) {
//            System.out.println(msg);
//        }

        printMsg("Hello, world!", 3);
        printMsg("java", 5);
        printMsg("hi", 7);
    }

    public static void printMsg(String msg, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }
}
