package basicarithmetic;

import java.util.Scanner;

public class Quadraticequation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of A and B and C");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        double d = Math.sqrt(b*b-4.0 * a * c);
//        System.out.println(d);
        double r1=(-b+d)/(2*a);
        double r2=(-b-d)/(2*a);
        System.out.println(r1);
        System.out.println(r2);


        }


    }

