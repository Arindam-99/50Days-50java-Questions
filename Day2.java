// Day 2: Take user input (name, age) and print it.

import java.util.Scanner;

public class Day2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Name:");
    String name = sc.nextLine();
    System.out.println("Enter the Age:");
    int age = sc.nextInt();
    System.out.println("Your name is :-->" + name + "And age is :" + age);

    sc.close();

  }
}
