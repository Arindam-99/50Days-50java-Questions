// Reverse a number using while loop 
import java.util.Scanner;

public class Day7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    int reversed = 0;

    // Loop to reverse the number
    while (num != 0) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num = num / 10;
    }

    System.out.println("Reversed number: " + reversed);

    sc.close();
  }
}
