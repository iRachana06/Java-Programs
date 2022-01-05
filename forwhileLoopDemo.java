public class forwhileLoopDemo {
    public static void main(String args[]){
        int i=0;
        System.out.println("For loop demonstration");
        for(i=0;i<5;i++){
            System.out.println("Value of i is : "+i);
        } //Demonstrating for loop

        System.out.println("While loop demonstration");
        while(i>0){
            //Demonstrating while loop - checking condition
            System.out.println("Value of i is : "+i);
            i--; //decrementing value of i until it's 0
        }
    }
}
