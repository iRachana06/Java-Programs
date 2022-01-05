public class exceptionHandlingJava {
    public static void main(String[] args) {
        try{
            int[] numberList = {1, 2, 3};
            System.out.println("Element in List is: " +numberList[5]);
            //Code that can throw exception is placed in try block
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            //getMessage() method is used to return a detailed message of the Throwable object
        }
        finally {
            System.out.println("Try-catch block executed");
            //finally block executes after try catch block is completed
        }
        /*If exception is not handled using try-catch ,
        it causes the program to terminate abruptly
         */
     }
}