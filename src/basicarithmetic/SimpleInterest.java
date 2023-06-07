package basicarithmetic;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
//        int p = 1;
//        int r = 2;
//        int t = 1;
//        System.out.println((p * r * t) / 100.0);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter P and R and T");
        int p = s.nextInt();
        int r = s.nextInt();
        int t = s.nextInt();
        System.out.println(p*r*t/100.0);
    }
}
