package Leave_manager;
import Employee.EmployeeDetails;
import  Manager.*;

public class LeaveManager {


    // allowable casual leaves
    public static final int cLeave = 7;
    // allowable annual leaves
    public static final int aLeave = 10;
    // allowable medical leaves
    public static final int mLeave = 15;



    public class localReq{
        public int lDay ;
        public String lType;

        public  localReq(int lDay, String lType) {
            this.lDay = lDay;
            this.lType = lType;
        }
    }


    public LeaveApplication leaveApp = new LeaveApplication();

    localReq req= new localReq(leaveApp.leaveDays,leaveApp.leaveType);

    public void checkLeave(){
        new LeaveRequest(leaveApp.empKey,req);
    }
}
