package Manager;

import Employee.EmployeeDetails;

public class RemovingEmployee extends Manager{
    public RemovingEmployee(int empID){
        Emp_under.remove(Emp_under.get(empID));
        System.out.println("Successfully removed!!");
    }
}
