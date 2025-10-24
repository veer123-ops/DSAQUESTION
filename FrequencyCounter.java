package veer.com;
import java.util.*;

public class FrequencyCounter {
    public static Map<Integer, Integer> countFrequency(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4};
        System.out.println(countFrequency(arr)); // Output: {1=2, 2=2, 3=1, 4=1}
    }
}
