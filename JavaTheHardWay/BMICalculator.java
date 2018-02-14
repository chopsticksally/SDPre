import java.util.Scanner;

  public class BMICalculator {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      double inches, pounds, m, kg, bmi;

      System.out.print(" Your height in inches: ");
      inches = keyboard.nextDouble();

      System.out.print(" Your weight in pounds: ");
      pounds = keyboard.nextDouble();

      m = inches * .0254;
      kg = pounds * 0.453592;


      bmi = kg / (m*m);
// inch= 0.0254 meters
// pound=0.453592 kgs




      System.out.println(" Your BMI is " + bmi);





    }
  }
