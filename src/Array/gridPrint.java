package Array;

import java.util.Arrays;

public class gridPrint {
    public static void main(String[] args) {
        String[][] array1 = new String[8][3];
        String x = "-";

        for (int i = 0; i<array1.length;i++)
        {
            for (int j = 0; j<array1[0].length; j++)
            {
                array1[i][j] = x;
                System.out.print(array1[i][j]);
            }
            System.out.println("");
        }
    }
}
