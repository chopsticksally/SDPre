import java.util.Scanner;

public class RunningTotal {
  public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  int current, total = 0;

  System.out.print("Type a bunch of values and I'll add them up. ");
  System.out.println("I'll stop when you type a zero");
//  System.out.print("Value:" );
  //current = keyboard.nextInt();

    do {
      System.out.println("Value: ");
      current = keyboard.nextInt();
      total += current;
      if (current != 0)
      System.out.println("The total so far is: " + total);
    

  //  while (current != 0){
    //  total += current ;
    //  System.out.println("The total so far is " + total);

      //System.out.print("Value:" );
      //current = keyboard.nextInt();

    } while (current != 0);


    System.out.println("The final total is: " + total);
  }
}
