//Using super keyword to invoke Parent class Method
class demoBaseClass{
    void printMessage() {
        String message = "Hello World in Base class";
        System.out.println(message); //prints message from Base class
    }
}
class demoDeriveClass extends demoBaseClass {
    void printMessage(){
        String message="Hello World in Derived class";
        System.out.println(message);//prints message from Derived class
        super.printMessage();
    }
}
public class superMethodDemo {
    public static void main(String args[]) {
        deriveClass obj = new deriveClass();
        obj.printMessage();
    }
}
