package JavaOOPLearning;

public class BasicExample {

    int x = 10;
    public static void main(String[] args) {
        BasicExample basicExample1 = new BasicExample();
        BasicExample basicExample2 = new BasicExample();

        basicExample1.x = 120;
        basicExample2.x = 240;

        System.out.println(basicExample1.x);
        System.out.println(basicExample2.x);

    }
}