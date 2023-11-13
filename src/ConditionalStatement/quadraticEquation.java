package ConditionalStatement;

import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of a: ");
        a = sc.nextDouble();

        System.out.println("Enter the number of b: ");
        b = sc.nextDouble();

        System.out.println("Enter the number of c: ");
        c = sc.nextDouble();

        double result  = (b*b)-(4.0*a*c);
        if(result>0.0){
            double x1 = (-b-(Math.pow(result,0.5)/(2.0*a)));
            double x2 = (-b+(Math.pow(result,0.5)/(2.0*a)));

            System.out.println("The Roots are: "+x1+" And "+x2);

        } else if (result==0.0) {
            double x1 = -b/2*a;
            System.out.println("The Root is: "+x1);

        }else {
            System.out.println("The Equation has no real root");
        }
    }
}
