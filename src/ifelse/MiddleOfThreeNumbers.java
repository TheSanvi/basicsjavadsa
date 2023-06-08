package ifelse;

public class MiddleOfThreeNumbers {
    public static void main(String[] args) {
        int a = 2, b= 1, c=3;
        int middle;

        if (a >= b && a <= c || a>=c && a<+b)
            middle = a;
        else if (b >= c && b<=a || b>=a && b<=c)
            middle = b;
        else
            middle = c;
        System.out.println(middle);


    }
}
