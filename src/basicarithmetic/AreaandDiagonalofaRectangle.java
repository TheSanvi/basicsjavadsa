package basicarithmetic;

import java.util.Scanner;

public class AreaandDiagonalofaRectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter L and B");
        int l = s.nextInt();
        int b = s.nextInt();
        System.out.println(l*b);

        double diagonal = Math.sqrt(l*l+b*b);

        System.out.println(diagonal);

    }
}
