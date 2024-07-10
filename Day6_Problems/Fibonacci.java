import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = num.nextInt();
        int x = 0;
        int y = 1;
        ArrayList <Integer> fib = new ArrayList<Integer>();
        fib.add(x);
        fib.add(y);
        if (a == 0){
            System.out.println(x);
        } else if (a == 1) {
            System.out.println(fib);
        } else {
            for (int i = 2; i < a ; i++){
                int c = x + y;
                fib.add(c);
                x = y;
                y = c;
            }
            System.out.println(fib);
        }
    }
}
