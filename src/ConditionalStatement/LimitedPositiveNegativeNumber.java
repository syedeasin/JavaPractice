package ConditionalStatement;

import java.util.Scanner;

public class LimitedPositiveNegativeNumber {
    public static void main(String[] args) {
        float number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number value: ");
        number = sc.nextFloat();

        if(number>0)
        {
            if (number<1.0) {
                System.out.println("The number is Positive but Small");
            } else if (number>1000000.00) {
                System.out.println("The number is Positive but large");
            }
        } else if (number==0.0) {
            System.out.println("The number is Zero");
        }
        else {
            if (number<1.0) {
                System.out.println("The number is Negative but Small");
            } else if (Math.abs(number)>1000000.00) {
                System.out.println("The number is Negative but large");
            }
        }
    }
}
