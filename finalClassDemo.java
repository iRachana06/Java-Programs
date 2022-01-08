final class ClassDemo {
    void display(){
        System.out.println("This is Demo of using Final Method");
    }
}
public class finalClassDemo extends ClassDemo {
    void display(){
        System.out.println("This is statement from Inherited class");
    }
                /* As ClassDemo is a Final class, it cant be Inherited
        Remove final keyowrd in line 1 otherwise this program will throw Compile time Error*/

    public static void main(String args[]){
        finalClassDemo obj= new finalClassDemo();
        obj.display();
    }
}