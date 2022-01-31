import java.io.*;
public class throwsDemo {
        public static void main(String args[]) throws IOException {
            int num;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter 2 numbers to add : "); //Reading 2 numbers
            num=Integer.parseInt(br.readLine());
            System.out.println("Number is : "+num);
        }
    }