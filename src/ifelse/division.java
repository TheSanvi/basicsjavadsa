package ifelse;

import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numerator");
        int numerator = sc.nextInt();
        System.out.println("Enter a denominator");
        int denominator = sc.nextInt();
        if(denominator==0) {
            System.out.println("division by zero not allowed");

        }else{
                double result = numerator/denominator;
                System.out.println(result);
            }
        }
    }



