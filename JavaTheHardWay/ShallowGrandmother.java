import java.util.Scanner;

public class ShallowGrandmother {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int age;
    double income, cute, happy;
    boolean allowed, allowed2;

    System.out.println("Enter your age: ");
    age = keyboard.nextInt();

    System.out.println("Enter your yesrly income: ");
    income = keyboard.nextDouble();

    System.out.println("How cute are you, on a scale of 0.0 to 10.0? ");
    cute = keyboard.nextDouble();

    System. out.println("How happy do you make my granchild, on a scale of 0.0 to 10.0? ");
    happy = keyboard.nextDouble();

    allowed = (age > 25 && age < 40 &&( income > 50000 || cute >= 8.5));
    allowed2 = (age >25 && age <40 && ( happy > 8.5));

    System.out.println("Allowed to date my granchild? " + allowed);
    System.out.println("Allowed to date my grandchild? " + allowed2);

  }

}
