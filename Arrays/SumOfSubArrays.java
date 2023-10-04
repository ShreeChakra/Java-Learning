package Arrays;

import java.util.*;

public class SumOfSubArrays {
    public static void subArrays(int numbers[]) {
        int mx = Integer.MIN_VALUE;
        int sample = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                sample = 0;
                for (int k = i; k <= j; k++) {
                    sample += numbers[k];
                }
                System.out.println(sample);
                if (mx < sample) {
                    mx = sample;
                }
            }
        }
        System.out.println("Max sum of subarray: " + mx);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12 };
        subArrays(numbers);
    }
}
