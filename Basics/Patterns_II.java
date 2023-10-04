public class Patterns_II {
    public static void main(String args[]) {
        // for (int i = 0; i < n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // for (int i = 0; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // if ((i - j) % 2 == 0) {
        // System.out.print("1 ");
        // } else {
        // System.out.print("0 ");
        // }
        // }
        // System.out.println();
        // }
        Butterfly(4);
        // // Rhombus(5);
        // // HollowRhombus(5);
        // Daimond(4);
    }

    public static void Butterfly(int n) {
        // ***** Butterfly pattern ******
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // public static void Rhombus(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }
    // for (int k = 1; k <= n; k++) {
    // System.out.print("*");
    // }
    // for (int l = 1; l <= (i - 1); l++) {
    // System.out.print(" ");
    // }
    // System.out.println();
    // }
    // }
    public static void HollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // code of rectangle
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Daimond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}