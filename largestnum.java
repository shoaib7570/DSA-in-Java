public class largestnum {
    public static int findlargest(int num[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {32, 4, 53, 12, 54,100, 56, 2, 3, 1};
        System.out.println(findlargest(num));
    }
}
