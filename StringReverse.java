public class StringReverse {
    public static void main(String[] args) {
        String str = new String("Latest Kumar");

        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            temp += str.charAt(i);
        }

        return temp;
    }
}
