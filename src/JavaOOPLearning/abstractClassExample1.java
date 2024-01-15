package JavaOOPLearning;

abstract class abstractClassExample1 {
    public String fname = "Syed Easin";
    public int age = 26;
    public abstract void Study(); //Abstruct Method

}

//Subclass of abstractClassExample
class Student extends abstractClassExample1{
    public int graduationYear = 2021;
    public void Study(){
        System.out.println("Studying all day long");
    }
}