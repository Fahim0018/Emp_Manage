package Employee;


public class EmployeeDetails {
    public String empName;
    public int  empID;

    public int casualLeave ;
    public int annualLeave ;
    public int medicalLeave ;
    public int remainingLeave;
    public int employeeManagerID;
    public String leaveStatus;
    public String joiningDate;


    public EmployeeDetails(String empName, int empID, int employeeManagerID,int casualLeave, int annualLeave, int medicalLeave, int remainingLeave,String leaveStatus, String joiningDate) {
        this.empName = empName;
        this.empID = empID;
        this.employeeManagerID=employeeManagerID;
        this.casualLeave = casualLeave;
        this.annualLeave = annualLeave;
        this.medicalLeave = medicalLeave;
        this.remainingLeave= remainingLeave;
        this.leaveStatus = leaveStatus;
        this.joiningDate=joiningDate;

    }
    public static void showEmployee(EmployeeDetails emp){
        System.out.println("EmpName: "+" "+ emp.empName + " | " +"EmpID: "+" "+ emp.empID +" | " +"Manager ID: "+ emp.employeeManagerID+" | " +"Casual Leave: " + emp.casualLeave +" | " + "Annual Leave: " + emp.annualLeave +" | "+ "Medical Leave: " + emp.medicalLeave + " | " + "Remaining Leave: "+ emp.remainingLeave + " | "+"Leave Status: " + emp.leaveStatus + " | " + "Joining Date: "+ emp.joiningDate);
    }
    public static void showLeaveDetails(EmployeeDetails emp){
        System.out.println("EmpName: "+" "+ emp.empName + " | " +"EmpID: "+" "+ emp.empID +" | "+"Manager ID: "+ emp.employeeManagerID+" | " + "Casual Leave: " + emp.casualLeave +" | " + "Annual Leave: " + emp.annualLeave +" | "+ "Medical Leave: " + emp.medicalLeave + " | " + "Remaining Leave: "+ emp.remainingLeave);
    }
    public static void checkLeaveStatus(EmployeeDetails emp){
        System.out.println("Leave Status: " + emp.leaveStatus );
    }
}
