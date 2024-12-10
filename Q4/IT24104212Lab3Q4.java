import java.util.Scanner;

public class IT24104212Lab3Q4 { 

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    
    System.out.print("Enter a five-digit number (e.g., 52348): ");
    int number = scanner.nextInt();

    
    if (number < 10000 || number > 99999) {
      System.out.println("Invalid input. Please enter a five-digit number.");
      return;
    }

    
    for (int i = 4; i >= 0; i--) {
      int digit = number / (int) Math.pow(10, i);
      number %= (int) Math.pow(10, i);
      System.out.print(digit + " ");
    }
  }
}