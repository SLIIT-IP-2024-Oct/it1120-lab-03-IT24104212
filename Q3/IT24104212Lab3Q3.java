import java.util.Scanner;

public class IT24104212Lab3Q3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    
    System.out.print("Enter the rupee amount (e.g., 2754): ");
    int amount = scanner.nextInt();

    
    int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

   
    for (int denomination : denominations) {
      int noteCount = amount / denomination;
      amount %= denomination; 

      System.out.println(denomination + " Notes/Coins - " + noteCount);
    }
  }
}