package StringSheet;
public class CountTheVowelsInString {
    public static void main(String[] args) {
        System.out.println(countTheVowelsInString("Sonu Kumar"));
    }

    private static int countTheVowelsInString(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'
                    || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}
