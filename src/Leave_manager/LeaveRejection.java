package Leave_manager;

import Employee.EmployeeDetails;

public class LeaveRejection {
    public LeaveRejection(EmployeeDetails emp){

        emp.leaveStatus = "Rejected";
        System.out.println("Leave Status: "+ emp.leaveStatus);
    }
}
