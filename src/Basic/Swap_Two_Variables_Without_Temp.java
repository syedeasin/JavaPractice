package Basic;

import java.util.Scanner;

public class Swap_Two_Variables_Without_Temp {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter Second number: ");
        num2 = scanner.nextInt();

        num1 = num1+num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swap, First Number: "+num1);
        System.out.println("After Swap, Second Number: "+num2);
    }
}
