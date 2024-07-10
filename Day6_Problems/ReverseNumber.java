import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = num.nextInt();
        int rev = 0;
        while (a>0){
            int temp = a%10;
            rev = rev*10 + temp;
            a /= 10;
        }
        System.out.println("Reverse Number is "+ rev);
    }
}
