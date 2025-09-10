// Find the sum of two numbers.

import java.util.Scanner;

public class Day3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the First Number: ");
    int num1=sc.nextInt();

     System.out.println("Enter the Second Number: ");
    int num2=sc.nextInt();

    System.out.println("Sum of two number is :"+(num1+num2));

    sc.close();

  }
}
