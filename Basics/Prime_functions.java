import java.util.*;

public class Prime_functions {
    // public static boolean Prime(int number) {
    // if (number == 2) {
    // return true;
    // }
    // for (int i = 2; i <= Math.sqrt(number); i++) {
    // if (number % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // public static void PrimesInRange(int number) {
    // for (int i = 2; i <= number - 1; i++) {
    // if (Prime(i)) {
    // System.out.print(i + " ");
    // }
    // }
    // }

    // public static void main(String args[]) {
    // PrimesInRange(20);
    // }

    // // Decimal to binary
    // public static void Binary(int number) {
    // while (number > 0) {
    // int binary;
    // binary = number % 2;
    // System.out.print(binary);
    // number = number / 2;
    // }
    // }

    // public static void main(String args[]) {
    // Binary(45);
    // }

    // // Binary to decimal

    // public static void Decimal(int binary) {
    // int myNum = binary;
    // int pow = 0;
    // int decimal = 0;
    // while (binary > 0) {
    // int lastDigit = binary % 10;
    // decimal = decimal + (lastDigit * (int) Math.pow(2, pow));
    // pow++;
    // binary = binary / 10;
    // }
    // System.out.println("The decimal form of " + myNum + " is " + decimal);
    // }

    // public static void main(String args[]) {
    // Decimal(101101);
    // }
    // public static double Average(double a, double b, double c) {
    // double average = (a + b + c) / 3;
    // return average;
    // }

    // public static void main(String args[]) {
    // System.out.println(Average(5, 8, 9));
    // }
    // public static boolean isEven(int number) {
    // if (number % 2 == 0) {
    // return true;
    // }
    // return false;
    // }

    // public static void main(String args[]) {
    // System.out.println(isEven(16));
    // }

    // // To find weather a number is palindrome or not
    // public static boolean reverse(int number) {
    // int reverse = 0;
    // int myNum = number;
    // for (; number > 0; number /= 10) {
    // int lastDigit = number % 10;
    // reverse = (reverse * 10) + lastDigit;
    // }
    // if (myNum != reverse) {
    // return false;
    // }
    // return true;
    // }

    // public static void main(String args[]) {
    // System.out.println(reverse(15251));
    // }

    // public static int Sum(int number) {
    // int sum = 0;
    // while (number > 0) {
    // int lastDigit;
    // lastDigit = number % 10;
    // sum = sum + lastDigit;
    // number = number / 10;
    // }
    // return sum;

    // int sum = 0;
    // for (; number > 0; number /= 10) {
    // int lastDigit = number % 10;
    // sum += lastDigit;
    // }
    // return sum;
    // }

    // public static void main(String args[]) {
    // System.out.print(Sum(154895));
    // }

    // public static void main(String args[]) {
    // int min = (int) Math.avg(2, 5, 4); // ????????????????
    // System.out.print(min);
    // }
    public static void main(String args[]) {
        // int i;
        // for (i = 1; i < 6; i++) {
        // if (i > 3)
        // continue;
        // }
        // System.out.println(i);

        // int count = 1;
        // while (count <= 15) {
        // System.out.println(count % 2 == 1 ? "***" : "+++++");
        // ++count;
        // }
        // for (int j = 1; j <= 5; j++) {
        // for (int k = 5; k >= j; k--) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        int a = 10;
        System.out.println(a-- * a--);

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}