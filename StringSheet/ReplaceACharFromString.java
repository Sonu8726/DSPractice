package StringSheet;
public class ReplaceACharFromString {
    public static void main(String[] args) {

        String str = new String("Sonu Kumar on Fireozn");

        ReplaceACharFromString rp = new ReplaceACharFromString();

        System.out.println(str);

        String str2 = rp.changeCharInString(str, 'o', 'm');

        System.out.println(str2);
    }

    private String changeCharInString(String str, char oldCh, char newCh) {
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == oldCh) {
                sb.setCharAt(i, newCh);
            }
        }

        return sb.toString();
    }
}