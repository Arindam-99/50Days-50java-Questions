// Day 16: Find duplicates in an array 
import java.util.*;

public class  Day16 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 4, 9, 1, 7};
        Arrays.sort(arr);

        System.out.print("Duplicate elements: ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
