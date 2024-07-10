import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = num.nextInt();
        int x = 0;
        for (int i = 2; i<a; i++){
            if (a%i == 0){
                x += 1;
            }
        }
        if (x == 0){
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
    }
}
