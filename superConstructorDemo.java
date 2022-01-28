//Using Super keyword for invoking Constructor in Base class
class demoSuperBase{
    String message;
    demoSuperBase(){
        message = "Hello World in Base class from Constructor";
        System.out.println(message); //Prints message from Base class
    }
}
class demoSuperDerived extends demoSuperBase {
    String message = "Hello World in Derived class";
    demoSuperDerived(){ //Constructor of Derived class
        super(); //Calling Constructor of base class using super
    }
    void printMessage() {
        System.out.println(message);//Prints message from Derived class
    }
}
public class superConstructorDemo {
    public static void main(String args[]) {
        demoSuperDerived obj = new demoSuperDerived();
        obj.printMessage();
    }
}
