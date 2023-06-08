package ifelse;

public class basicideaofifelse {
    public static void main(String[] args) {
        boolean a = true, b= false;
        /*
        or
        a   b   output
        F   F   F
        F   T   T
        T   F   T
        T   T   T

        and

        a   b   output
        F   F   F
        F   T   F
        T   F   F
        T   T   T

        not F=T, T=F



         */
        System.out.println(a || b);
        System.out.println(a && b);
    }
}
