import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {
    double num1 ,num2 , sum;



    Scanner input = new Scanner(System.in);
    System.out.println("What is your age?");
    num1 = input.nextDouble();
    System.out.println("What is the age of your spouse?");
    num2 = input.nextDouble();

    sum = num1 + num2;

    System.out.println("The sum of  " + num1 + " and " + num2 + " is " + sum);

    input.close();






  }
}
