public class Functions_1 {
    public static int Factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int nmr(int n, int r) {
        int nmr = n - r;
        int nmrf = 1;
        for (int i = 1; i <= nmr; i++) {
            nmrf *= i;
        }
        return nmrf;
    }

    public static int rf(int r) {
        int rf = 1;
        for (int i = 1; i <= r; i++) {
            rf *= i;
        }
        return rf;
    }

    public static void main(String args[]) {
        System.out.println(Factorial(10) / nmr(10, 5) * rf(5));
    }

}
