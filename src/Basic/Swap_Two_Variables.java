package Basic;

import java.util.Scanner;

public class Swap_Two_Variables {
    public static void main(String[] args) {
        int num1, num2, swap;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first Number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the first Number: ");
        num2 = scanner.nextInt();

        swap = num1;
        num1 = num2;
        num2 = swap;

        System.out.println("After Swap, First Number: "+ num1);
        System.out.println("After Swap, Second Number: "+ num2);

    }
}
