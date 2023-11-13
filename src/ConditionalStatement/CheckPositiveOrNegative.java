package ConditionalStatement;

import java.util.Scanner;

public class CheckPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = sc.nextInt();

        if (number>0){
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is negative");
        }
    }
}
