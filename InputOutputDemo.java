import java.io.*;
public class InputOutputDemo {
        public static void main(String args[]) throws IOException {
            int num1,num2,sum;
            String name;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //BufferedReader is class used to read the text from a character-based input stream
            //Reading 2 Integers from keyboard
            System.out.println("Enter 1st number to add : ");
            num1=Integer.parseInt(br.readLine());
            System.out.println("Enter 2nd number to add : ");
            num2=Integer.parseInt(br.readLine());
            sum=num1+num2;
            System.out.println("Sum is : "+sum);
            //Reading new string from keyboard
            System.out.println("Enter your name: ");
            name=br.readLine();
            System.out.println("Welcome : "+name);
        }
    }
