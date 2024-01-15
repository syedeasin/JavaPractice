package Array;

import java.util.Arrays;

public class newCode {
    public static void main(String[] args) {
        int[] arr = {5, 4543, 41, 341, 546, 12};
        int bigNum, smallNum, x = 0, y = 0;
        bigNum = 0;
        smallNum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    bigNum = arr[i];
                    x = i;
                } else if (arr[i] < j) {
                    smallNum = arr[i];
                    y = i;
                }
            }
        }
        if (x > y) {
            System.out.println("Not Profitable");
        } else {
            System.out.println("Profitable");
        }

    }
}