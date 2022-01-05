public class objectDemo {
    public void method1(){
        //Created a method in class
        System.out.println("Calling Method 1");
    }
    public void method2(){
        //method2 in class objectDemo
        System.out.println("Calling Method 2");
    }
    public static void main(String args[]){
        objectDemo obj=new objectDemo();
        //Created a object of class objectDemo
        //Using object created, call methods-method1 and method2 in class
        obj.method1();
        obj.method2();
    }
}