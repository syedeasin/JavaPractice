package Basic;

import java.util.Scanner;

public class Circle_Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of Circle: ");
        double r = scanner.nextDouble();

        double perimeter = 2*Math.PI*r;
        double area = Math.PI*r*r;

        System.out.println("Circle Perimeter is: "+perimeter);
        System.out.println("Circle Area is: "+area);

    }
}
