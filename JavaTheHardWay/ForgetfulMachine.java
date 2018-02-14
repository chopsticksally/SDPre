import java.util.Scanner;

public class ForgetfulMachine {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "What is the capital of France?" );
    keyboard.next();

    System.out.println( "What is 6 multipied by 7?" );
    keyboard.nextInt();
// the computer blows up when i type "forty two"
    System.out.println( "Enter a number between 0.0 and 1.0." );
    keyboard.nextDouble();
// the computer blows up when i type words...ex. dog but took the number 22

    System.out.println( "Is there anything else you would like to say?" );
    keyboard.next();


  }
}
