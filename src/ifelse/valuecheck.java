package ifelse;

import java.util.Scanner;

public class valuecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A and B");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a);

        } else {
            System.out.println(b);
        }

    }
}