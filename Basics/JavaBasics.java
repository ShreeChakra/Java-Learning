import java.util.*;

public class JavaBasics {
    // public static void main(String[] args) {
    // Scanner sc=new Scanner (System.in);
    // int principal = sc.nextInt();
    // float rate = sc.nextFloat();
    // int time = sc.nextInt();
    // float SimpleInterest = principal*time*rate/100;
    // System.out.println("The simple interest is " + SimpleInterest);
    // }
    // }
    public static void main(String args[]) {

        // int a = 23;
        // int b = 45;
        // float c = (float) b / (float) a;
        // int c = b%a;
        // int s = 13;
        // int p = s++;
        // int q = s;
        // System.out.println(p);
        // System.out.println(q);

        // int a = 23;

        // int b = ++a;
        // int c = a++;
        // int d = --a;
        // int e = a--;
        // int f = a;
        // System.out.println("b=" + b + " " + "c=" + c + " " + "d=" + d + " " + "e=" +
        // e + " " + "f=" + f);

        // int number = 13;
        // int RightShiftNumber = number >> 1 << 1;
        // System.out.println(RightShiftNumber);
        // right shift operator divides the number by 2
        // left shift operator multiplies the number by 2

        // int num1 = 13;
        // num1 |= 2;
        // System.out.println(num1);
        // int a = 5;
        // int b = 10;
        // a = b;
        // System.out.println(a);
        // type conversion
        // Scanner scan = new Scanner(System.in);
        // float number = scan.nextInt();
        // System.out.println(number);
        // type conversion
        // int a = 'b';
        // System.out.println(a);
        // type casting :
        // float num1 = 999.999f;
        // int num2 = (int) num1;
        // System.out.println(num2);
        // System.out.println(num1);

        //////////////////////////// Income Tax Calculator
        // Scanner scanner = new Scanner(System.in);
        // int salary = scanner.nextInt();
        // int tax;
        // if (salary >= 1000000) {
        // System.out.println("Income tax is:" + salary * 0.3);
        // } else if (salary >= 500000) {
        // System.out.println("Income tax is:" + salary * 0.2);
        // } else {
        // System.out.println("Income tax not applicable");
        // }
        // if (salary < 500000) {
        // tax = 0;
        // } else if (salary >= 500000 && salary < 1000000) {
        // tax = (int) (salary * 0.2);
        // } else {
        // tax = (int) (salary * 0.3);
        // }
        // System.out.println("Income tax is " + tax);

        // Scanner scanner = new Scanner(System.in);
        // int salary = scanner.nextInt();
        // int tax;

        // if (salary < 500000) {
        // tax = 0;
        // } else if (salary >= 500000 && salary < 1000000) {
        // tax = (int) (salary * 0.2);
        // } else {
        // tax = (int) (salary * 0.3);
        // }
        // System.out.println("Income tax is:" + tax);

        // Scanner scanner = new Scanner(System.in);
        // int number1 = scanner.nextInt();
        // int number2 = scanner.nextInt();
        // int number3 = scanner.nextInt();
        // if (number1 > number2) {
        // if (number1 > number3) {
        // System.out.println("number1 is the largest number :" + number1);
        // } else {
        // System.out.println("number3 is the largest number :" + number3);
        // }
        // } else if (number2 > number3) {
        // System.out.println("number2 is the largest number :" + number2);
        // } else {
        // System.out.println("number 3 is the largest number :" + number3);
        // }

        // if ((number1 >= number2) && (number1 >= number3)) {
        // System.out.println("number1 is the largest which is:" + number1);
        // } else if (number2 >= number3) {
        // System.out.println("number2 is the largest which is:" + number2);
        // } else {
        // System.out.println("number3 is the largest which is:" + number3);
        // }

        // // Ternary Operator

        // int variable = (number1 > number2) ? number1 : number2;
        // System.out.println(variable);
        // String type = (variable % 2 == 0) ? "even" : "odd";
        // System.out.println(type);
        // To check if a student passed or failed the exam
        // Scanner sc = new Scanner(System.in);
        // double marks = sc.nextDouble();

        // String result = (marks >= 33) ? "PASS" : "FAIL";
        // System.out.println(result);

        // // switch statement

        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // String integer = (number >= 0) ? "positive" : "negative";
        // System.out.println("the integer is :" + integer);

        // Scanner scanner = new Scanner(System.in);
        // double temperature = scanner.nextDouble();

        // String fever = (temperature >= 100) ? "Fever" : "No fever";
        // System.out.println(fever);

        // Scanner dayScanner = new Scanner(System.in);
        // int day = dayScanner.nextInt();
        // switch (day) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Enter a valid day, only seven days in a week");
        // }

        // Scanner leapScanner = new Scanner(System.in);
        // System.out.print("Enter year:");
        // int year = leapScanner.nextInt();
        // if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
        // System.out.println("Leap year: " + year);
        // } else {
        // System.out.println("Not leap year: " + year);
        // }
    }
}
