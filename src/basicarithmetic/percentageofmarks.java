package basicarithmetic;

import java.util.Scanner;

public class percentageofmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A and B and C");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double t = 90;
        int sum = a + b + c;
        System.out.println(sum);
        double percentage = Math.round(100 * sum / t * 100) / 100.0;
        System.out.println(percentage);

    }
}
