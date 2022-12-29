package StringSheet;
public class CheckIfStringIsBinary {
    public static void main(String[] args) {

        System.out.println(checkBinary("Sonu Kumar"));
        System.out.println(checkBinary("12345"));
        System.out.println(checkBinary("10101"));
        System.out.println(checkBinary("Sonu1011"));
        System.out.println(checkBinary("10101010O"));
    }

    private static boolean checkBinary(String str) {
        boolean status = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0' || str.charAt(i) == '1') {
                status = true;
            } else {
                status = false;
                break;
            }
        }
        return status;
    }
}
