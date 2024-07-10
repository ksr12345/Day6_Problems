import java.util.*;

public class CouponNumber {
    public static int generateCoupon(int n) {
        Random random = new Random();
        return random.nextInt(n) + 1;
    }
    public static int collectCoupons(int n) {
        boolean[] collected = new boolean[n];
        int countUnique = 0;
        int totalRandomNumbers = 0;

        while (countUnique < n) {
            int randomCoupon = generateCoupon(n);

            if (!collected[randomCoupon - 1]) {
                collected[randomCoupon - 1] = true;
                countUnique++;
            }

            totalRandomNumbers++;
        }

        return totalRandomNumbers;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of distinct coupon numbers: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Invalid input. N must be a positive integer.");
            return;
        }

        int totalRandomNumbersNeeded = collectCoupons(N);

        System.out.println("Total random numbers needed to have all distinct numbers: " + totalRandomNumbersNeeded);

        scanner.close();
    }
}
