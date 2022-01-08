class finalDemo {
    final void display(){
        System.out.println("This is Demo of using Final Method");
    }
}
public class finalMethodDemo extends finalDemo{
//    void display(){
//        System.out.println("Comment this method to avoid error");
//    }
    /* As display is a Final method, it cant be overriding
If you uncomment lines 7-9,this program will throw Compile time Error*/
    public static void main(String args[]){
        finalMethodDemo obj= new finalMethodDemo();
        obj.display();
    }
}
