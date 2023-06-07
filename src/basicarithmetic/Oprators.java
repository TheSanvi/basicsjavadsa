package basicarithmetic;

import java.util.Scanner;

public class Oprators {// +,-,/,*, %

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A and B");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);
        System.out.println(1 / 2);
        System.out.println(1 / 2.0);


    }
}
