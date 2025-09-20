// Day13: Find second leargest element in array
public class Day13 {
  public static void main(String[] args) {
    int[] arr = { 12, 35, 1, 10, 34, 1 };

    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;

    for (int num : arr) {
      if (num > first) {
        second = first;
        first = num;
      } else if (num > second && num != first) {
        second = num;
      }
    }

    if (second == Integer.MIN_VALUE) {
      System.out.println("There is no second largest element");
    } else {
      System.out.println("The second largest element is: " + second);
    }
  }
}
