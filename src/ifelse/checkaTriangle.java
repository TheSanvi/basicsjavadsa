package ifelse;

import java.util.Scanner;

public class checkaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b and c side of a triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("triangle is not possible");
            return;
        }

        if (a == b && a == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || a == c || b == c) {
            System.out.println("isosceles triangle");
        } else {
            System.out.println("Scalene");
        }
        if ((a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b) || (c * c) + (b * b) == (a * a)) {
            System.out.println("Right Triangle");

        }

    }
}

