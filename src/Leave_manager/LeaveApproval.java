package Leave_manager;
import Employee.*;
import Manager.*;

public class LeaveApproval {


    public  LeaveApproval(EmployeeDetails emp){
        emp.leaveStatus="Approved";

        System.out.println("Leave Status: " + emp.leaveStatus);
    }
}
