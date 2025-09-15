// Reverse a String using String builder ..
import java.util.Scanner;

public class Day9 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder(str);

    System.out.println("Reversed string: " + sb.reverse());
  }
}
