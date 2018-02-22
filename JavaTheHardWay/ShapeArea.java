import java.util.Scanner;

public class ShapeArea {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int choice;
    double area = 0;

    System.out.print("Shape Area Calculator version 0.1");
    System.out.println(" (c) 2015 LJtHW Sample Output, Inc.");

    do {
      System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
      System.out.println("1)Triangle");
      System.out.println("2)Circle");
      System.out.println("3)Rectangle");
      System.out.println("4)Square");
      System.out.println("5)Quit");
      System.out.print("> ");
      choice = keyboard.nextInt();

      if (choice == 1){
        System.out.print("\nBase: ");
        int b = keyboard.nextInt(); //base
        System.out.print("Height: ");
        int h = keyboard.nextInt();//height
        area = computeTriangleArea(b, h);//base and height
        System.out.println("The area is " + area);

      }
      else if (choice == 2 ) {
        System.out.print("\nRadius: ");
        int radius = keyboard.nextInt();
        area = computeCircleArea(radius);
        System.out.println("The area is " + area);
      }
      else if (choice == 3) {
        System.out.print("\nLength: ");
        int l = keyboard.nextInt();
        System.out.print("Width: ");
        int w = keyboard.nextInt();
        System.out.println("The area is " + computeRectangleArea(l, w));
      }
      else if ( choice == 4) {
        System.out.print("\nTall: ");
        int c = keyboard.nextInt();
        System.out.print("Wide: ");
        int f = keyboard.nextInt();
        System.out.println("The area is " + computeSquareArea (c, f));
      }
      else if ( choice != 5) {
        System.out.println("ERROR.");
      }
    } while (choice != 5);
  }
  public static double computeTriangleArea ( int base , int height) {
    double A;
    A = 0.5 * base * height;
    return A;
  }
  public static double computeCircleArea ( int radius) {
    double A;
    A = Math.PI * radius * radius;
    return A;
  }
  public static double computeRectangleArea ( int length, int width) {
    return (length * width);
  }
  public static double computeSquareArea ( int tall, int wide ) {
    return (tall * wide);
  }

}
