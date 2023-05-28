package Array;

import java.util.Scanner;

public class findSpecificValue {
    public static void main(String[] args) {
        int[] array1 = {1234, 2023, 34144, 1234, 3456, 4537};
        Scanner sc = new Scanner(System.in);
        int specificValue = sc.nextInt();

//        Solve 1
        int x = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == specificValue) {
                x = 5;
                break;
            }
        }
        if (x == 5) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //Solve 2
        System.out.println(contains(array1, specificValue));
    }

    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (n == item) {
                return true;

            }

        }
        return false;
    }
}