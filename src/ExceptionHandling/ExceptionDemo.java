package ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        int result = 0;
        try {
            result = divide(a,b);
        }
        catch (ArithmeticException easin)
        {
            System.out.println("You can't Divide " + a + " by " + b);
        }
        System.out.println(result);
    }
    private static int divide(int a, int b)
    {
        return a/b;
    }
}
