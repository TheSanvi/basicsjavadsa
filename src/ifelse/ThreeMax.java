package ifelse;

public class ThreeMax {
    public static void main(String[] args) {
        int a = 22, b = 3, c = 30;
        int max;
        if (a >= b && a >= c)
            max = a;
        else if (b >= c)
            max = b;
        else
            max = c;
        System.out.println(max);

    }
}
