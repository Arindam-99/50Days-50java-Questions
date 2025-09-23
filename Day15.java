
// Day 15: Find the frequency of elements in an array
import java.util.HashMap;
import java.util.Map;

public class Day15 {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 2, 4, 5, 3, 2, 4 };

    // HashMap to store frequency
    Map<Integer, Integer> freqMap = new HashMap<>();

    for (int num : arr) {
      freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    // Print frequencies
    for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
      System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
    }
  }
}
