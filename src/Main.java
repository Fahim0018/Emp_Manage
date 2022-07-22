import Leave_manager.*;
import Manager.Manager;

public class Main {
    public static int firstExitCode =1;
    public static int secondExitCode =1;
    public static String userInput;

    public static void main(String[] args) {
        while(firstExitCode ==1) {
            System.out.println("Type C if you are CEO");
            System.out.println("Type M if you are Manager" );
            System.out.println("Type E if you are Employee");
            System.out.println("Type 1 to exit");
            userInput= Input.sc.next();
            secondExitCode=1;
            if(userInput.equals("1")){
                break;
            }
            while (secondExitCode != 0) {
                SystemController systemController = new SystemController();
            }
        }



    }
}