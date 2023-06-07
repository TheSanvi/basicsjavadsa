package basicarithmetic;

import java.util.Scanner;

public class Compoundinterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter P and R and T");
        int p = s.nextInt();
        int r = s.nextInt();
        int t = s.nextInt();
        // p * (1+r/100) to  power t -p
        double ci=p * Math.pow(1+r/100.0,t)-p;
        System.out.println(p*r*t/100.0);
        System.out.println(ci);

    }
}
