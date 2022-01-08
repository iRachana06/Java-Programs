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
    If you uncomment lines 7-9,this program will throw Compile time Error
    Either remove final keyowrd in line 1 or comment lines 7-9*/

            public static void main(String args[]){
                finalClassDemo obj= new finalClassDemo();
                obj.display();
            }
}