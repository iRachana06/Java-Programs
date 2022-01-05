public class DemoIfElse1 {
    public static void main(String args[]){
        int marks = 85;
        if(marks<40){ //check if marks is less than 40
            System.out.println("Fail");
        }
        else if(marks>=40 && marks<75) //check if marks is between 40 to 75
        {
            System.out.println("Pass"); //&& operator used to connect both conditions
        }
        else if(marks>=75 && marks<90) //check if marks is between 75 to 90
        {
            System.out.println("Pass with Distinction");
        }
        else //If all the above conditions fail
        {
            System.out.println("Pass with Distinction - Outstanding");
        }
    }
}
