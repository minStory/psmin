package access.ex;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter counterMain = new MaxCounter(3);
        counterMain.increment();
        counterMain.increment();
        counterMain.increment();
        counterMain.increment();
        int count = counterMain.getCount();
        System.out.println(count);
    }
}
