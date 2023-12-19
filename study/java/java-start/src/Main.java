public class Main {
    public static void main(String[] args) {

        String my_string = "aAb1B2cC34oOP2vb23";
        int answer = 0;
        String str = "";
        int a = 5;
        String s = String.valueOf(a);

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) < 65) {
                str = String.valueOf(my_string.charAt(i));
                answer += Integer.valueOf(str);
                System.out.println(answer);
            }
        }
    }
}