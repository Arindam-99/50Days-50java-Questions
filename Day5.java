// Day 5: Find the largest of three numbers.
import java.util.Scanner;

public class Day5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(":Check the largest number: ");
    System.out.print("Enter the first number:--> ");
    int num1 = sc.nextInt();

    System.out.print("Enter the Second number:--> ");
    int num2 = sc.nextInt();

    System.out.print("Enter the Third number:--> ");
    int num3 = sc.nextInt();

    if (num1 == num2 || num2 == num3 || num1 == num3) {
      System.out.println("Change the number pattern to check the bigger one ");
      sc.close();
      return;
    }
    if (num1 > num2 && num1 > num3) {
      System.out.println("Number " + num1 + " is largest number: ");

    } else if (num2 > num1 && num2 > num3) {
      System.out.println("Number " + num2 + " is largest number: ");

    } else {
      System.out.println("Number " + num3 + " is largest number: ");
    }
    sc.close();

  }
}
