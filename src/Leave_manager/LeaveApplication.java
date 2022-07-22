package Leave_manager;

public class LeaveApplication {


    public  String name;
    public int empKey;
    public  String leaveType;
    public  int leaveDays;



    public LeaveApplication(){
        try {
            System.out.print("Name : ");
            name = Input.sc.next();

            System.out.print("Enter your Id : ");
            empKey = Input.sc.nextInt();

            System.out.print("Leave Type (casual/annual/medical) : ");
            leaveType = Input.sc.next();

            System.out.print("Leave Days : ");
            leaveDays = Input.sc.nextInt();

//            System.out.println("Enter the Leave Starting date(dd/mm/yyyy): ");
//            startingDate= Input.sc.next();
//
//            System.out.println("Enter the Leave Ending date(dd/mm/yyyy): ");
//            endingDate = Input.sc.next();




        }catch (Exception e){
            e.printStackTrace();
        }




    }
}
