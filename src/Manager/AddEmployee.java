package Manager;

import Employee.EmployeeDetails;

public  class AddEmployee extends Manager{
    public AddEmployee(int empID, EmployeeDetails emp){
        Emp_under.put(empID,emp);
        tot_Employee.put(empID,emp);

    }
}
