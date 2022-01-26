abstract class abstractBase {
    //Abstract classes cannot be instantiated, but they can be inherited
    abstract void calc();
    //Abstract method - only declaration in base class without an implementation
}
class abstractDerived extends abstractBase {
    void calc(){
        int a = 10 , b = 20 , sum;
        sum=a+b;
        System.out.println("Sum of terms : " +sum );
    }
}
public class abstractDemo{
    public static void main(String args[]){
        abstractDerived obj = new abstractDerived();
        //we cannot create objects of abstract classes
        obj.calc();
    }
}