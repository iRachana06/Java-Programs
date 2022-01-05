class Vehicle{ //Base Class
    void basemethod(){
        System.out.println("Base Vehicle class");
    }
}
class Car extends Vehicle{//Inherited Class - use extends Keyword
    void inheritedMethod(){
        System.out.println("Inherited Car class");
    }
}
public class inheritanceDemo {
    public static void main(String args[]){
        Car obj=new Car(); //inside public class, create object of Inherited class
        obj.basemethod();
        obj.inheritedMethod();
    }
}