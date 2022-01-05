public class ParameterizedConstructorDemo {
    int length, breadth,area;
    ParameterizedConstructorDemo(int x,int y){
        //Created a Parameterized Constructor
        //Values to be assigned are passed on object creation
        length=x;
        breadth=y;
    }
    public void findarea(){
        area=length*breadth;
        System.out.println("Area is : "+area);
    }
    public static void main(String args[]){
        ParameterizedConstructorDemo obj=new ParameterizedConstructorDemo(20,20);
        //pass the arguments when object is created
        obj.findarea();

    }
}
