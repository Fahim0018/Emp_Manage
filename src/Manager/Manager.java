package Manager;
import Employee.*;
import java.util.HashMap;

public class Manager {
    //Adding Manager details
    protected String managerName;
    protected int managerID;



    public static HashMap<Integer, EmployeeDetails> tot_Employee = new HashMap<>();


    //Initializing HashMap to add Employee under manager
     public static HashMap<Integer, EmployeeDetails> Emp_under = new HashMap<>();
}
