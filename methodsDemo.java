public class methodsDemo {
    public static void main(String[] args) {
        //Calling Predefined Java String Methods
        String str1="Hello";
        String str2="World";
        boolean checkval=str1.equals(str2);
        System.out.println("Is str1 equal str2 :" +checkval);
        int len=str1.length();
        System.out.println("Length of "+str1 +" is: " +len );
        //Calling Predefined Java Math Method
        System.out.println("The Random number is: " + Math.random());
        System.out.println("The square root of 100 is: " + Math.sqrt(100));
        //Calling a User-defined method
        userDefinedmethod();
    }
    public static void userDefinedmethod(){
        //created a user defined method
        System.out.println("This is a user defined method");
    }
    }
