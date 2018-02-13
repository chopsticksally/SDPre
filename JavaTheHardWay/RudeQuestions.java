import java.util.Scanner;

  public class RudeQuestions {
    public static void main(String[] args) {
      String name, car;
      int age,;
      double weight, income;

      Scanner keyboard = new Scanner(System.in);

      System.out.print("What is your name?");
      name = keyboard.next();

      System.out.print(" Hi," + name + "! How old are you? ");
      age = keyboard.nextInt();

      System.out.println(" So you're " + age + ", eh? That's not very old. ");
      System.out.print(" How much do you weigh " + name + "? ");
      weight = keyboard.nextDouble();

      System.out.println(weight + "! Better keep that quiet!! ");
      System.out.println(" What kind of car do you drive " + name + " ?");
      car = keyboard.next();
      System.out.println("A " + car + " is a pretty decent car. ");
      
      System.out.print(" Finally, what's your income, " + name + "? ");
      income = keyboard.nextDouble();

      System.out.print(" Hopefully that is " + income + " per hour");
      System.out.println(" and not per year! ");
      System.out.print(" Well thanks for answering my rude questions, ");
      System.out.println( name + ".");
// computer does not blow up when put an int instead of a double because it can be ex 22.0
// the computer will also accept an int or double in a string because u can have a string of anything ??
// i cant get the computer to blow up on an String... I tried numbers and letter combined,put in a double even a math equation.
// i can get it to blow up entering letters into the int and double because an int and double are defined by numerics.
    }
  }
