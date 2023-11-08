package JavaOOPLearning;

public class CarMethod {
    public void fullThrottle(){
        System.out.println("This car is going as far as it can");
    }
    public void speed(int value){
        System.out.println("Highest Speed of this car is: " + value);
    }
    public static void main(String[] args) {
        CarMethod carMethod = new CarMethod();

        carMethod.fullThrottle();
        carMethod.speed(125);
    }
}
