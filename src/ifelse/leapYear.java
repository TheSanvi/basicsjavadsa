package ifelse;

import java.util.Scanner;

public class leapYear {
    /*
    year    div by 400      div by 4        div by 100
    2000    y               y               y
    2020    n               y               n
    1900    n               y               y
    2023    n               n               n


     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 400 == 0 || year %4==0 && year%100!=0)
        {
            System.out.println("it is a leap year");
        }
        else
        {
            System.out.println("it is not a leap year");
        }

    }

}

