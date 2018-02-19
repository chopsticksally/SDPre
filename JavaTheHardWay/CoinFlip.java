import java.util.Scanner;

public class CoinFlip {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String coin, again;
    int streak = 0;
    boolean gotHeads;
    again = "Y"; // assigning Y to again to force execution of loop

    while (again.equals("Y")){

            gotHeads = Math.random() < 0.5; //gotHeads is true if Math.random < 0.5

              if ( gotHeads )
                 coin = "HEADS"; // true
              else
                coin = "TAILS"; // false

              System.out.println("You flip a coin and it's... " + coin);

              if ( gotHeads ) {
                  streak++;
                  System.out.println("\tThat's " + streak + " in a row....");
                  System.out.println("\tWould you like to flip again (Y/N)?");
                  again = keyboard.next();
              }
              else{
                System.out.println("\tYou lose everything!");
                System.out.println("\tShouldv'e quit while you were aHEAD....");
                streak = 0;
                again = "N";
              }
          }

          System.out.println("Final score: " + streak);
        }
      }
