//Super keyword can be used in 3 scenarios:
// 1. Used to refer instance variable in the immediate parent class
class baseClass{
    String message="Hello World in Base class";
}
class deriveClass extends baseClass{
    String message="Hello World in Derived class";
    void printMessage(){
        System.out.println(message); //prints message from Derived class
        System.out.println(super.message);
        //Using super keyword to access message from Base class
    }
}
public class superKeywordDemo {
    public static void main(String args[]) {
        deriveClass obj = new deriveClass();
        obj.printMessage();
    }
}