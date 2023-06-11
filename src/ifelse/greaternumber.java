package ifelse;

import java.util.Scanner;

public class greaternumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a and b");
        int a = 10;// sc.nextInt();
        int b = 8;// sc.nextInt();
        int max = (a > b) ? a : b;
//        if (a > b)
//            max = a;
//        else
//            max = b;
        System.out.println(max);
        int min = (a > b) ? b : a;
        System.out.println(min);




    }
}
