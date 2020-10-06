import java.util.Scanner;
/**
 *
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for an integer
    System.out.println("Please enter an integer to create a multiplication table for");
    int userNum = input.nextInt();

    // create a for loop to count
    for(int count = 1; count <= 12; count++){
      // multiply the user's number by count
      int sum = userNum * count;
      // print the multiplication
      System.out.println(count + " x " + userNum + " = " + sum);
    }
    
  }
}
