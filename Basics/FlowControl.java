import java.util.*;

public class FlowControl {
    public static void main(String args[]) {

        // *********While loop ****************

        // // *****Printing specific no.of times********************************

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter no.of times:");
        // int count = scanner.nextInt();
        // int counter = 0;
        // while (counter < count) {
        // System.out.println("Hello baby");
        // counter++;
        // }
        // System.out.println("Printed " + counter + " times");

        // // ********************************Print numbers from 1 to 10
        // // ********************************

        // int counter = 1;
        // while (counter <= 10) {
        // System.out.print(counter + " ");
        // counter++;
        // }
        // // System.out.println();

        // // ********************************sum of first n natural numbers ****
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a natural number:");
        // int noOfTimes = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while (i <= noOfTimes) {
        // sum = sum + i;
        // i++;
        // }
        // System.out.println("the sum first " + noOfTimes + " natural numbers is: " +
        // sum);

        // ***************************For Loop***************************

        // for (initialization,condition,updation){
        // some code
        // }

        // for (int i = 1; i <= 5; i++) {
        // System.out.println("Hello baby");
        // }

        // ************To print SQUARE pattern ****************

        // for (int lines = 1; lines <= 4; lines++) {
        // System.out.println("****");
        // }

        // int lines = 1;
        // while (lines <= 4) {
        // System.out.println("****");
        // lines++;
        // }

        // int lines = 1;
        // do {
        // System.out.println("****");
        // lines++;
        // } while (lines <= 4);

        // ************* Print reverse of a number ************************

        // int number = 154289;
        // while (number > 0) {
        // int lastDigit = number % 10;
        // System.out.print(lastDigit);
        // number /= 10;
        // }

        // // ************* Reverse the given number ***********************
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number:");
        // int number;
        // int reverseNumber = 0;
        // for (number = sc.nextInt(); number > 0; number /= 10) {
        // int lastDigit = number % 10;
        // reverseNumber = (reverseNumber * 10) + lastDigit;
        // }
        // System.out.println(reverseNumber);

        // **************** Break Statement ****************

        // for (int number = 1; number <= 5; number++) {
        // if (number == 4) {
        // break;
        // }
        // System.out.println(number);
        // }

        // Scanner sc = new Scanner(System.in);
        // while (true) {
        // System.out.print("Enter the number:");
        // int n = sc.nextInt();
        // if (n % 10 == 0) {
        // break;
        // }
        // System.out.println(n);
        // }

        // // ************ To find whether a number is prime or not *********
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();

        // if (number == 2) {
        // System.out.println("The number is a prime number");
        // } else {
        // boolean isPrime = true;
        // for (int i = 2; i <= Math.sqrt(number); i++) {
        // if (number % i == 0) {
        // isPrime = false;
        // }
        // }
        // if (isPrime == true) {
        // System.out.println("This is a prime number");
        // } else {
        // System.out.println("This is not a prime number");
        // }
        // }

        // // **** write a program that reads a set of integers,and then prints the sum
        // of
        // // the even and odd integers.****

        // Scanner sc = new Scanner(System.in);
        // int number;
        // int choice;
        // int evenSum = 0;
        // int oddSum = 0;

        // do {
        // number = sc.nextInt();
        // if (number % 2 == 0) {
        // evenSum += number;
        // } else {
        // oddSum += number;
        // }
        // System.out.print("Do you want to continue ? Press1 for yes or 0 for no");
        // choice = sc.nextInt();
        // } while (choice == 1);
        // System.out.println("EvenSum:" + evenSum);
        // System.out.println("oddSum:" + oddSum);

        // *******Write a program to find the factorial of any number entered by the
        // // user*******

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number to find the factorial: ");
        // int number = sc.nextInt();
        // int i;
        // int factorial = 1;
        // for (i = 1; i <= number; i++) {
        // factorial *= i;
        // }
        // System.out.println("Factorial of " + number + " is " + factorial);

        // // ******** Write a program to print the multiplication table of a number N ,
        // // entered by the user ********

        // Scanner sc = new Scanner(System.in);
        // int result = 1;
        // System.out.print("Enter a number to print the multiplication table: ");
        // int number = sc.nextInt();
        // for (int i = 0; i <= 10; i++) {
        // result = number * i;
        // System.out.println(number + " x " + i + " = " + result);

        // }

        // // error question

        // for (int i = 0; i <= 5; i++) {
        // System.out.println("i = " + i);
        // }
        // System.out.println("i after the loop = " + i);

    }
}
