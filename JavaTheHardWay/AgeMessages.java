import java.util.Scanner;

public class AgeMessages {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int age;
    System.out.println("How old are you? ");
    age = keyboard.nextInt();

    System.out.println("You are: ");
    if (age < 13) {
      System.out.println("\ttoo young to get a Facebook account");
    }
    if (age > 13) {
      System.out.println("\told enough to get a Facebook account");
    }
    if (age < 16) {
      System.out.println("\ttoo young to get a driver's license");
    }
    if (age < 16) {
      System.out.println("\told enough to get a driver's license");
    }
    if (age < 18) {
      System.out.println("\ttoo young to get a tattoo");
    }
    if (age > 18) {
      System.out.println("\told enough to get a tattoo");
    }
    if (age < 21) {
      System.out.println("\ttoo young to drink alcohol");
    }
    if (age > 21) {
      System.out.println("\told enough to drink alcohol");
    }
    if (age < 35) {
      System.out.println("\ttoo young to run for President of the U.S.");
    }
    if (age > 35) {
      System.out.println("\told enough to run for President of the U.S.");
    }
    if ( age > 65) {
      System.out.println("\told enough to retire!");
    }
    if ( age < 65) {
      System.out.println("\tnot old enough to retire!");
    }
      System.out.println("\t\t(How sad!)");
      // when i type in an age greater than 35 my code only prints (How sad!) because there is no comdition for anything over that number.

  }

}
