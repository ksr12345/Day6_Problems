import java.util.Scanner;

public class Perfect {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = num.nextInt();

        int sum = 0;
        for (int i = 1; i < a; i++){
            if (a%i == 0){
                sum += i;
            }
        }
        if (sum == a){
            System.out.println("It is a Perfect number.");
        } else {
            System.out.println(" Not a Perfect Number");
        }
    }
}
