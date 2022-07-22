import CEO.CEO;
import Employee.EmployeeDetails;
import Leave_manager.*;
import Manager.*;

import java.util.Map;
import java.util.HashMap;

public class displayEmployeeDetails {
       public void displaySingleEmployeeDetails(){
           System.out.println("Enter the employee ID: ");
           int currEmpId = Input.sc.nextInt();
           EmployeeDetails currEmp = Manager.Emp_under.get(currEmpId);
           EmployeeDetails.showEmployee(currEmp);
       }
       public void showAllEmp(){
           for(Map.Entry<Integer,EmployeeDetails> entry:Manager.Emp_under.entrySet()){
               int currEmpKey = entry.getKey();
               EmployeeDetails currEmp = entry.getValue();
               EmployeeDetails.showEmployee(currEmp);

           }
       }
       public void showEmployeeUnderManger(){
           System.out.println("Enter the Manager Id: ");
           int currManagerID = Input.sc.nextInt();
           for(Map.Entry<Integer,EmployeeDetails> entry:Manager.Emp_under.entrySet()) {
               int currEmpKey = entry.getKey();
               EmployeeDetails currEmp = entry.getValue();
               if(currEmp.employeeManagerID==currManagerID) {
                   EmployeeDetails.showEmployee(currEmp);
               }

           }

       }

       public void showManager(){
           for(Map.Entry<Integer,String> entry: CEO.Manger_Details.entrySet()){
               int currManID = entry.getKey();
               String currManName = entry.getValue();
               System.out.println("Manager Name: "+ currManName+" | "+"Manager ID: "+currManID);
           }

       }
}
