public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age, sonsAge;
    double seconds, e, checking, groceries;
    String firstName, lastName, title, bfName, son;

    x = 10;
    y = 400;
    age = 39;
    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    sonsAge = 9;
    groceries = 350.50;


    firstName = "Miranda";
    lastName = "Martin";
    title = "Ms.";
    bfName = "Chris";
    son = "Dexter";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y" );
    System.out.println("The experiment took " + seconds + " seconds." );
    System.out.println("A favorite irrational # is Euler's number: " + e );
    System.out.println("Hopefully you have more than $ " + checking + " !" );
    System.out.println("My name's " + title + " " + firstName +  " " + lastName );
    System.out.println("I have a boyfriend named " + bfName);
    System.out.println("I also have a son named " + son + " and he is " + sonsAge + " years old.");
    System.out.println("Groceries cost me about $"  + groceries + " a month.");

  }
}
