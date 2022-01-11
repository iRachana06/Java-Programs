import java.io.*;
public class FactorialDemo {
    static int factorial(int n){ //This method will be called recursively
        if (n == 0)
            return 1; //If value of n reaches 0, return value as 1
        else
            return(n * factorial(n-1));
    /*If n is not 0, find (n-1), call factorial function with n-1 as argument
    and multiply n to it Eg: if n=4, 4*factorial(3), 4*3*factorial(2) and so on*/
    }
    public static void main(String args[]) throws IOException{
        int i,num,result;
        System.out.println("Enter the Number to find factorial : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num=Integer.parseInt(br.readLine());
        result = factorial(num);
        System.out.println("Factorial of "+num+" is: "+result);
    }

}