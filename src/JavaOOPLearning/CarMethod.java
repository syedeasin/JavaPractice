package JavaOOPLearning;

public class CarMethod {
    public void fullThrottle(){
        System.out.println("This car is going as far as it can");
    }
    static void students(){
        System.out.println("There are no new Students");
    }
    public void speed(int value){
        System.out.println("Highest Speed of this car is: " + value);
    }
    public static void main(String[] args) {
        CarMethod carMethod = new CarMethod();

        carMethod.fullThrottle();
        carMethod.speed(125);
        students();

        ConstructorExample constructorExample = new ConstructorExample(1,"easin");
//        System.out.println(constructorExample.basiccalculation(12,8)); //Due to the private modifier of basicCalculation method, we can't access it from outside classses
        System.out.println(constructorExample.basiccalculation2(12,8)); //Protected Method works on same packages and subclasses

        constructorExample.age = 100;
        System.out.println(constructorExample.age);
    }
}
