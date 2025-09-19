public class Day12 {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 7, 9 }; // Example array

    boolean isSorted = true;

    // Loop through the array and check
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        isSorted = false;
        break;
      }
    }

    if (isSorted) {
      System.out.println("The array is sorted.");
    } else {
      System.out.println("The array is not sorted.");
    }
  }
}
