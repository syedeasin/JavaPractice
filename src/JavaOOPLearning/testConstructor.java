package JavaOOPLearning;

public class testConstructor {
    int x,y,z;
    String student;

    public testConstructor(int g){
        x = g;
    }
    public testConstructor(int g, String name){
        student = name;
        y = g;
        System.out.println(y + "\n" + student);
    }
    public static void main(String[] args) {
        testConstructor testConstructor = new testConstructor(5);
        System.out.println(testConstructor.x);
        testConstructor testConstructor1 = new testConstructor(12,"Ruhi");
        System.out.println(testConstructor);

    }

}
