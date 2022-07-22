package Manager;
import Leave_manager.*;
import Employee.*;

public class managingLeaveRequest {
    public managingLeaveRequest(){
        System.out.println("Enter you ID Once Again: ");
        int currManID = Input.sc.nextInt();
        //Showing ALL requests
        for(Integer requestedEmpId:LeaveRequest.employeeID){
            LeaveManager.localReq empReq = LeaveRequest.reqLeave.get(requestedEmpId);
            EmployeeDetails empL = Manager.Emp_under.get(requestedEmpId);
            if(empL.employeeManagerID==currManID) {
                System.out.println("Employee Id: " + requestedEmpId + " | " + "Leave Type: " + empReq.lType + " | " + "Requested Leave Days: " + empReq.lDay + " | " + "Leave already taken -- " + " Casual Leave: " + empL.casualLeave + " " + "Annual Leave: " + empL.annualLeave + " " + "Medical Leave: " + empL.medicalLeave +" | "+"Balance Leave: "+empL.remainingLeave );
            }
        }

        //Approving or Rejection selected Requested
        int getOut= 1;
        while(getOut!=0) {
            System.out.print("Enter the Employee Id number to manage leave request: ");
            int reqEmp = Input.sc.nextInt();

            EmployeeDetails empL = Manager.Emp_under.get(reqEmp);
            LeaveManager.localReq empReq = LeaveRequest.reqLeave.get(reqEmp);


            System.out.println("Employee Id: "+ reqEmp+" | "+ "Leave Type: "+ empReq.lType+" | " + "Leave Taken : "+ empReq.lDay + " | "+"Leave already taken -- "+" Casual Leave: "+ empL.casualLeave + " "+ "Annual Leave: "+empL.annualLeave+" "+"Medical Leave: "+empL.medicalLeave +" | "+"Balance Leave: "+empL.remainingLeave);


            System.out.println("Type Y to Approve Request and N to Reject Request: ");
            String userDecision = Input.sc.next();
            if(userDecision.equals("Y")){
                if (empReq.lType.equals("casual") && empL.casualLeave + empReq.lDay < LeaveManager.cLeave) {
                    empL.casualLeave += empReq.lDay;
                    empL.remainingLeave -= empReq.lDay;
                    LeaveApproval leaveApproval= new LeaveApproval(empL);
                }
                if(empReq.lType.equals("annual") && empL.annualLeave+empReq.lDay<LeaveManager.aLeave){
                    empL.annualLeave +=empReq.lDay;
                    empL.remainingLeave-= empReq.lDay;
                    LeaveApproval leaveApproval= new LeaveApproval(empL);
                }
                if(empReq.lType.equals("medical") && empL.medicalLeave+empReq.lDay<LeaveManager.mLeave){
                    empL.medicalLeave +=empReq.lDay;
                    empL.remainingLeave-= empReq.lDay;
                    LeaveApproval leaveApproval= new LeaveApproval(empL);
                }
                LeaveRequest.reqLeave.remove(reqEmp);
            } else if (userDecision.equals("N")) {
                LeaveRejection leaveRejection= new LeaveRejection(empL);
            }else {
                System.out.println("Enter Valid Input!!");
            }




            System.out.println("Enter 0 to Exit and 1 to Continue: ");
            int userChoice = Input.sc.nextInt();
            if(userChoice==0){
                getOut=0;
            }
            else{
                getOut=1;
            }

        }






    }

}
