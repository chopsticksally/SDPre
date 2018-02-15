import java.util.Scanner;

public class BMICategories {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner (System.in);
    double inches, pounds, m, kg, bmi;

    System.out.print(" Your height in inches: ");
    inches = keyboard.nextDouble();

    System.out.print(" Your weight in pounds: ");
    pounds = keyboard.nextDouble();

    m = inches * .0254;
    kg = pounds * 0.453592;

    bmi = kg / (m*m);
    System.out.println("Your BMI is: " + bmi);

    System.out.println("BMI category: ");
    if (bmi < 15.0){
      System.out.println("very severely under weight");
    }
    else if (bmi <=16.0) {
      System.out.println("very under weight");
    }
  else if (bmi < 18.5) {
    System.out.println("underweight");
  }
  else if (bmi < 25.0) {
    System.out.println(" normal weight");
  }
  else if (bmi < 30.0) {
    System.out.println("overweight");
  }
  else if (bmi < 35.0) {
    System.out.println("moderately obese");
  }
  else if (bmi < 40.0) {
    System.out.println("severely obese");
  }
  else {
    System.out.println("very severely/\"morbidly\" obese");
  }
  }

}
