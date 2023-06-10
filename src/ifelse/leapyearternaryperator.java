package ifelse;

import java.util.Scanner;

public class leapyearternaryperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year");
        int year = sc.nextInt();
        String result = (year % 400 == 0) ? "leap year" : (year % 4 != 0) ? "not leap year" : (year % 100 != 0) ? " leap year" : "not leap year";

        System.out.println(result);
    }
}
