package Basic;

import java.util.Scanner;

public class Sum_Of_Two_Numbers {
    public static void main(String[] args) {
        int firstNumber, secondNumber, totalNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        firstNumber = scanner.nextInt();

        System.out.println("Enter 2nd Number: ");
        secondNumber = scanner.nextInt();

        totalNumber = firstNumber+secondNumber;
        System.out.println("Total: "+ totalNumber);
    }
}
