package JavaOOPLearning;

public class ConstructorExample {
    int x;
    String  name;
//    private int age;
    protected int age;
    public ConstructorExample(int y, String z){
        x = y;
        name = z;
    }
    private int basiccalculation(int value1, int value2){
        int a = value1, b = value2;
        int sum = a+b;
        return sum;
    }

    protected int basiccalculation2(int value1, int value2){
        int a = value1, b = value2;
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        ConstructorExample constructorExample = new ConstructorExample(1200, "Easin");
        System.out.println("Give " + constructorExample.name + " " + constructorExample.x + " Taka.");

        constructorExample.age = 100;
        System.out.println(constructorExample.age);
        System.out.println(constructorExample.basiccalculation(200,800));

    }
}
