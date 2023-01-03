package Basic;

public class LargestAmongThreeNumbers {

    public static void main(String[] args) {

        System.out.println(findLargestAmongThree(94, 0, 95));
    }

    static int findLargestAmongThree(int a, int b, int c) {
        int largest;
        if (a > b) {
            if (a > c) {
                largest = a;
            } else {
                largest = c;
            }
        } else if (b > c) {
            largest = b;
        } else {
            largest = c;
        }
        return largest;
    }
}
