package JavaOOPLearning;

public class StaticAndPublicMethod {
    public void method1(){
        System.out.println("This is a Public Method, that need to create object for method calling");
    }
    static void method2(){
        System.out.println("This is a Static Method which can call without creating any Object");
    }

    public static void main(String[] args) {
        method2();

        StaticAndPublicMethod staticAndPublicMethod = new StaticAndPublicMethod();
        staticAndPublicMethod.method1();
    }
}
