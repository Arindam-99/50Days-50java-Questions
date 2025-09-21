// Day 14:Reverse an Array Without Using Extra Space
public class Day14 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };

    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      // swap elements
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      start++;
      end--;
    }

    // print reversed array
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}
