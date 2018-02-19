import java.util.Scanner;

public class SafeSquareRoot {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner (System.in);
    double x, y;
    String answer = "Y, N";


    System.out.println("Are you ready? (Y/N)");
    answer = keyboard.next();
    if (answer.equals("Y")) {
      System.out.print("Give me a number, and I'll find it's square root. ");
      System.out.print("(No negatives please.)");
      x = keyboard.nextDouble();


    while (x < 0) {
      System.out.println("I wont take the square root of a negative.");
      System.out.println("\nNew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);
    System.out.println("The square root of " + x + " is " + y);
  }
}
}
