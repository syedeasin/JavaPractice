package Basic;

import java.util.Scanner;

public class Product_Of_Two_Numbers {
    public static void main(String[] args) {
        int firstNumber, secondNumber, Product;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter first Number: ");
        secondNumber = scanner.nextInt();

        Product = firstNumber * secondNumber;
        System.out.println("Product: "+Product);

    }
}
