import Employee.EmployeeDetails;
import Leave_manager.*;
import Manager.*;
public class LeaveStatus {
    public LeaveStatus(){


        System.out.println("Enter the employee Id: ");
        int currEmpId = Input.sc.nextInt();
        EmployeeDetails currEmp = Manager.Emp_under.get(currEmpId);
        EmployeeDetails.checkLeaveStatus(currEmp);

    }
}
