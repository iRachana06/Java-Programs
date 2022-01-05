public class switchExample {
    public static void main(String args[]){
        int val = 1;
        switch(val){
            /*one of the following statements will be executed
            only the case matching the value will execute*/
            case 1: System.out.println("You logged in as 1st user");
            break;
                            /*break statement exits you from switch loop
                  after the condition is satisfied*/
            case 2: System.out.println("You logged in as 2nd user");
            break;
            case 3: System.out.println("You logged in as 3rd user");
            break;
            default:System.out.println("Sorry Try Again");
                //Default case statement- if none got satisfied default executed
        }
    }
}
