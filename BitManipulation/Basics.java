package BitManipulation;

public class Basics {
    // **To check if a number is even or odd */
    public static void checkNumber(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 1) {
            System.out.print("The number is odd");
        } else if ((n & bitMask) == 0) {
            System.out.print("The number is even");
        }
    }

    // **Get i th bit
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // **Set ith bit */
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    // ** clear ith bit */
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    // ** update ith bit */
    // first clear ith bit then update ith bit using OR operation
    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return (n | bitMask);
    }

    // **clear last i bits */
    public static int clearLastBits(int n, int i) {
        int bitMask = (~0) << i;
        return (n & bitMask);
    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = ~0 << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return (n & bitMask);
    }

    // **Count set bits in a number */
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String args[]) {
        // If MSB == 0, then the number is positive
        // If MSB == 1, then the number is negative

        // If LSN == 0, then the number is even
        // If LSB == 1, then the number is odd
    }
}
