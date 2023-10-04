package Strings;

import java.util.Scanner;

public class Basics {
    // ***Anagrams */
    public static boolean isAnagram(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        if (count == str1.length()) {
            return true;
        }
        return false;
    }

    // ***Count how many times lowercase vowels occurred in a String entered by the
    // user */
    public static int vowelsCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ("aeiou".indexOf(str.charAt(i)) != -1) {
                // Character is a vowel (a, e, i, o, u)
                count++;
            }
        }
        return count;
    }
    // ****String compression */

    public static String getCompression(String testStr) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < testStr.length(); i++) {
            Integer count = 1;
            while (i < (testStr.length() - 1) && testStr.charAt(i) == testStr.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(testStr.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    // ****Convert letters to uppercase */

    public static String toUppercase(String str) {
        StringBuilder sb = new StringBuilder(""); // stringBuilder does not operate directly in string format.So we
                                                  // should convert to string using .toString() method
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString(); // this converts sb to string
    }
    // ************Check if a string is a palindrome */ // O(n)
    // public static boolean isPalindrome(String s) {
    // // for (int i = 0; i < s.length() / 2; i++) {
    // // if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
    // // return true;
    // // }
    // // }
    // // return false;
    // // *********using comparison of strings .equals() and substring .substring( ,
    // )
    // if (s.length() == 1) {
    // return true;
    // } else if (s.length() == 2) {
    // return s.charAt(0) == (s.charAt(1));
    // } else if (s.length() == 3) {
    // return s.charAt(0) == s.charAt(s.length() - 1);
    // } else {
    // int n, m;
    // n = (s.length() - 1) / 2;
    // if (s.length() % 2 == 0) {
    // m = n + 1;
    // } else {
    // m = n + 2;
    // }
    // return s.substring(0, n).equals(s.substring(m, s.length() - 1));
    // }
    // }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name:");
        // String name = sc.nextLine();
        // System.out.println(name.length());
        String fName = "Arjun";
        String lName = "reddy";
        String fullName;
        fullName = fName + lName;
        char initial = fName.charAt(0);
        // System.out.print(initial);
        boolean equality = fName.equals(lName);
        // System.out.print(equality);
        String s = "mom";
        // System.out.print(isPalindrome(s));

        // // *********.compareTo() lexicographical order */
        // String fruits[] = { "ram", "sita", "arjun", "reddy" };
        // String largest = "ram";
        // for (int i = 1; i < fruits.length; i++) {
        // if (largest.compareTo(fruits[i]) < 0) {
        // largest = fruits[i];
        // }
        // }
        // System.out.print(largest);
        // **If some changes are made to a string, new string will be created. To
        // **overcome this we use StringBuilder */
        // StringBuilder sb = new StringBuilder("");
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // sb.append(ch);
        // }
        // System.out.print(sb);
        // String str = "preethy shetty";
        // str = toUppercase(str);
        // System.out.println(str);
        // String testStr = "aabc";
        // testStr = getCompression(testStr);
        // System.out.print(testStr);

        // String str = "Hello baby";
        // System.out.print(vowelsCount(str));
        // String str1 = "care";
        // String str2 = "race";
        // System.out.println(isAnagram(str1, str2));
        System.out.println(5 >> 1);
    }
}
