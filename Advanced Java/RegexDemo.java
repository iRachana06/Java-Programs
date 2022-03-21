//Searching strings in Java using Regex package in Java
import java.util.regex.*;
public class RegexDemo{
    public static void main(String args[]){
        //Method 1 - Using Compile, Matcher and Matches methods

        Pattern p1 = Pattern.compile(".a"); //Using '.' allows single character in beginning
        Matcher m1 = p1.matcher("Java");
        boolean check1 = m1.matches();
        if(check1 == false) {
            System.out.println("Word should end with s and have max length 2");
        }
        Pattern p2 = Pattern.compile(".*a");//Using '.*' allows any number of characters
        Matcher m2 = p2.matcher("Java");
        boolean check2 = m2.matches();
        System.out.println("Pattern Match:" +check2);

        //Method 2- Using Compile and Matcher methods
        boolean check3=Pattern.compile(".*a").matcher("Java").matches();
        System.out.println("Pattern Match:" +check3);

        //Method 3 - Using Matches method of Pattern class
        boolean check4 = Pattern.matches(".*a", "Java");
        System.out.println("Pattern Match:" +check4);
    }
}
