import java.util.Scanner;

public class Objective6Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;
    //String selection;

    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List my favorite foods");
      System.out.println("3: Exit");
      System.out.println();
        selection = scanner.nextInt();
      //selection = scanner.next();

      //if(selection.equals("1"))
      if (selection == 1)
      System.out.println("Hello World!");

      //if (selection.equals("2"))
      if (selection == 2)
      System.out.println("Apples, Bananas, Coconuts");

      //if (selection.equals("3")){
      if (selection == 3) {
      System.out.println("Goodbye!");
      break;
      }
    }

      scanner.close();

  }
}
