package Array;

public class sumOfArrayValues {
    public static void main(String[] args) {
        int[] array1 = {12,20};
        int sum = 0;
        for (int num : array1)
        {
            sum = sum+num;
        }
        System.out.println("Sum of the Array:" + sum);
    }
}
