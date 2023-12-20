package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int c = 3;

//        int sum = a + b + c;
//        double avg = sum / 3.0;
        System.out.println("avg = " + avg(1, 2, 3));

//        int x = 15;
//        int y = 25;
//        int z = 35;

//        sum = x + y + z;
//        avg = sum / 3.0;
        System.out.println("avg = " + avg(15, 25, 35));
    }

    public static double avg(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
