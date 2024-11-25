import java.util.Scanner;
public class IT24103897Lab3Q1
{
public static void main(String[] args)
{
double pricePerkg,quantityKg,totalAmount;
Scanner input = new Scanner(System.in);

System.out.println("Enter the price of 1kg of rice: ");
pricePerkg = input.nextDouble();

System.out.println("Enter the number of kilograms you want to buy: ");
quantityKg = input.nextDouble();


totalAmount = pricePerkg*quantityKg;
System.out.printf("The total amount is : %.2f\n ",totalAmount);

}
}