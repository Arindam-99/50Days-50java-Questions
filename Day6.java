import java.util.Scanner;

public class Day6 {
  // Day 6: Print multiplication table of a given number.
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number :--> ");
    int num = sc.nextInt();
    System.out.println("The multiplecation table of " + num + "  is : --> ");

    // loop 
    for(int i=1;i<=10;i++){
      System.out.println(num + "*" + i + " = "+ num * i );
    }
    sc.close();
  }
}
