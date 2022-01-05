public class thisKeywordDemo {
    int id;
    String name;
    thisKeywordDemo(int id1, String name1){
        //Here-parameters (formal arguments) and instance variables have same name
        //this keyword helps in distinguishing parameters from instance variables
        id=id1;
        name=name1; //parameter and instance variables different
        //If name of parameter is different like id1,name1, this keyword is not needed
    }
    void DisplayDetails(){
        System.out.println("Details are : ID: "+id +" Name : "+name);
    }
    public static void main(String args[]){
        thisKeywordDemo obj1=new thisKeywordDemo(101,"Nia");
        thisKeywordDemo obj2=new thisKeywordDemo(102,"Neha");
        obj1.DisplayDetails();
        obj2.DisplayDetails();
    }
} /*if parameters-formal arguments and instance variables are same
then methods invoked willnot correctly receive arguments passed */
