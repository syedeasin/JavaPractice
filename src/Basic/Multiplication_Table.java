package Basic;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        num = scanner.nextInt();

        for (int i=1;i<=num;i++)
        {
            System.out.println(num +"x"+ i+"="+num*i);
        }

    }
}
