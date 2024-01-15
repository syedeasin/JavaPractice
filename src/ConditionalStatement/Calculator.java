package ConditionalStatement;

import ExceptionHandling.Login;

public class Calculator {
    public static void main(String[] args) {
        Login login = new Login();

        int total = login.sum(12,15);
        System.out.println(total);

    }
}
