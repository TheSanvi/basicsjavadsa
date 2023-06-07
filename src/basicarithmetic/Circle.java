package basicarithmetic;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("area of a circle");
        int area = s.nextInt();
        double radius = Math.sqrt(area / Math.PI);
        System.out.println(radius);
        System.out.println(2*Math.PI*radius);

//        System.out.println(Math.PI);
//        System.out.println(Math.E);
    }
}
