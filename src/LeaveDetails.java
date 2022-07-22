import Employee.EmployeeDetails;
import Leave_manager.*;
import Manager.*;
public class LeaveDetails {
    public LeaveDetails(){
        System.out.println("Enter the employee Id: ");
        int currEmpId = Input.sc.nextInt();
        EmployeeDetails currEmp = Manager.Emp_under.get(currEmpId);
        EmployeeDetails.showLeaveDetails(currEmp);
    }
}
