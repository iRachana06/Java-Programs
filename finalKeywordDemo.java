public class finalKeywordDemo {
    //Final Keyword in Java - Used in 3 Separate contexts
    //1.Final Variables- Prevent changing value of a variable/create constants
    //2. Final Methods- Prevent Overriding a Method
    //3. Final Classes- Prevent Inheritance
    public static void main(String args[]){
        //Demo on Final Variables

        final String str="Welcome to TechIEQ";

        //str="TechIEQ"; //This statement will throw error
        //As str is a final variable so we cant reassign the value

        System.out.println("String is: "+str);
    }
}
