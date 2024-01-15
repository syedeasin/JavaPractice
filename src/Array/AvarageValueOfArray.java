package Array;

public class AvarageValueOfArray {
    public static void main(String[] args) {
        int[] array1 = {12,13};
        double sum = 0;
        for(int num:array1)
        {
            sum = sum+num;
        }
        System.out.println("Avarage of array1:" +(sum/2));
    }
}
