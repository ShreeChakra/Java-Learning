public class patterns_1 {
    public static void main(String args[]) {

        // // ********To print star pattern

        int n = 4;
        for (int lines = 1; lines <= n; lines++) {
            for (int stars = 1; stars <= lines; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // // *********To print inverted star pattern

        // for (int lines = 1; lines <= n; lines++) {
        // for (int stars = 1; stars <= (n - lines + 1); stars++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // ********Half pyramid pattern
        // for (int lines = 1; lines <= n; lines++) {
        // for (int num = 1; num <= lines; num++) {
        // System.out.print(num);
        // }
        // System.out.println();
        // }

        // // **********Character pattern
        // char character = 'A';
        // for (int lines = 1; lines <= n; lines++) {
        // for (int chars = 1; chars <= lines; chars++) {
        // System.out.print(character);
        // character++;
        // }
        // System.out.println();
        // }
    }
}