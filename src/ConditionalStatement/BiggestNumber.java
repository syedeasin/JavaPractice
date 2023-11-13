package ConditionalStatement;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        int number1,number2,number3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number: ");
        number1 = sc.nextInt();

        System.out.println("Enter the 2nd Number: ");
        number2 = sc.nextInt();

        System.out.println("Enter the 3rd Number: ");
        number3 = sc.nextInt();

        //Solution 1
//        int max = Math.max(number1,number2);
//        max = Math.max(max,number3);
//        System.out.println("Biggest Number Between three : " + max);

        //Solution 2
        if (number1>number2)
        {
            if (number1>number3){
                System.out.println(number1+" is the biggest Number");
            }
        }if (number2>number1) {
            if (number2>number3){
                System.out.println(number2+" is the biggest Number");
            }
        }
        if (number3>number1)
        {
            if (number3>number2){
                System.out.println(number3+" is the biggest Number");
            }
        }
    }
}
