package Arrays;

public class Kadanes {
    public static void Kadanes(int numbers[]) {
        int currSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("The maximum of sub array sum is :" + currSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, -1, -6, 4, -2, 2, 5 };
        Kadanes(numbers);
    }
}
