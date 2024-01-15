package JavaOOPLearning;

public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle cycle1 = new Bicycle();

        cycle1.changeCadence(15);
        cycle1.changeGear(5);
        cycle1.speedUp(10);
        cycle1.applyBrakes(1);

        cycle1.printStates();
    }
}
