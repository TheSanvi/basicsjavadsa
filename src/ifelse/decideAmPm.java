package ifelse;

import java.sql.SQLOutput;
import java.util.Scanner;

public class decideAmPm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter timing");
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
//      if(hours<=11
//      {
//          System.out.println(hours + " AM");
//      }
//      else if(hours==12)
//      {
//          System.out.println(hours + " PM");
//      }
//      else
//      {
//          System.out.println((hours-12) + " PM");
//      }


        String time = (hours<12) ? hours + ":" + minutes + " AM" :(hours==12) ?hours + " PM" :(hours-12) + " PM" ;
        System.out.println(time);
    }
}
