package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){
        //인스턴스 생성을 막는다.
        System.out.println("내부 호출");
    }

    public static int sum(int values[]) {
        int result = 0;
        for (int i : values) {
            result += i;
        }
        return result;
    }

    public static double avg(int values[]) {
        double result = (double) sum(values) / values.length;
        return result;
    }

    public static int min(int values[]) {
        int result = values[0];
        for (int i : values) {
            if (result > i) {
                result = i;
            }
        }
        return result;
    }

    public static int max(int values[]) {
        int result = values[0];
        for (int i : values) {
            if (result < i) {
                result = i;
            }
        }
        return result;
    }
}
