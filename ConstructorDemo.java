public class ConstructorDemo {
    int length, breadth; //variables in class
    ConstructorDemo(){
        //Constructor of class- To initialize values- Name same as class name
        //Similar to other methods in a class
        //But doesnt have return type
        length=10;
        breadth=20;
    }
    public void area(){
        int areaval=length*breadth;
        System.out.println("Area of rectangle is: "+areaval);
    }
    public static void main(String args[]){
        ConstructorDemo obj=new ConstructorDemo();
        //Constructor is called when an instance of an object is created
        obj.area(); //calling area method
    }
}
