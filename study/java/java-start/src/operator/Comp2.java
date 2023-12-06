package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열";
        String str2 = "문자열";
        String str3 = new String("문자열");
        String str4 = new String("문자열");

        boolean result1 = "hello".equals("hello");  //리터럴 비교
        boolean result2 = str1.equals("문자열1");
        boolean result3 = str1.equals(str2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("hello" == "hello");
        System.out.println("str1.hashCode() = " + str1.hashCode());
        System.out.println("str2.hashCode() = " + str2.hashCode());
        System.out.println("str3.hashCode() = " + str3.hashCode());
        System.out.println("str4.hashCode() = " + str4.hashCode());
        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));
        System.out.println("System.identityHashCode(str2) = " + System.identityHashCode(str2));
        System.out.println("System.identityHashCode(str3) = " + System.identityHashCode(str3));
        System.out.println("System.identityHashCode(str4) = " + System.identityHashCode(str4));
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);
        System.out.println(str3 == str4);
    }
}
