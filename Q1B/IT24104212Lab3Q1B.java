import java.util.Scanner;

public class IT24104212Lab3Q1B { 

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    
    System.out.print("Enter the price of 1kg of rice (e.g., 5.25): ");
    double pricePerKg = scanner.nextDouble();

    
    System.out.print("Enter the number of kilograms you want to buy (e.g., 2.5): ");
    double weightInKg = scanner.nextDouble();

  
    double totalCost = pricePerKg * weightInKg;

    
    double discount = totalCost * 0.1;

    
    double finalAmount = totalCost - discount;

  
    System.out.println("The total cost before discount is: $" + totalCost);
    System.out.println("The discount amount (10%) is: $" + discount);
    System.out.println("The final amount you have to pay is: $" + finalAmount);
  }
}