public class ClubBouncer {
  public static void main(String[] args){
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if (onGuestList || age >= 21 || (gender.equals("F") && allure >= 8)) {
      System.out.println("You are allowed to enter the club");
    }
    // System.out.println("get a cheeseburger, first");
    else
    System.out.println("You are not allowed to get into the club");

  }
}
// does not compile because line 11 because is not an if or else statement....commented out
