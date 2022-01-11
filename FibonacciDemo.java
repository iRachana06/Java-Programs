import java.io.*;
public class FibonacciDemo {
    //In a fibonacci series, every term is sum of previous 2 terms, starting with 0
    static int fibonacci(int n){
        if(n == 1)
            return 0; //First term in series is 0
        else if(n == 2)
            return 1; //Second term in series is 1
        else
            return fibonacci(n-2) + fibonacci(n-1);
        //From n=3 onwards, start adding previous 2 terms
    }
    public static void main(String args[]) throws IOException{
        int index;
        System.out.println("Which term of Fibonacci Series you want to Print? ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        index=Integer.parseInt(br.readLine());
        System.out.println("Term number " +index+ " in Fibonacci series is: "+fibonacci(index));
    }
}
