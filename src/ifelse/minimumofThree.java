package ifelse;

import java.util.Scanner;

public class minimumofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = +0;
        int b = -8;
        int c = 7;
        int min = (a <= b) ? (a <= c) ? a : c : (b <= c) ? b : c;
        System.out.println(min);

        int max = (b <= a) ? (c <= a) ? b : a : (c <= b) ? c : a;
        System.out.println(max);


    }
}
