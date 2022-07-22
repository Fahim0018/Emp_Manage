import Employee.EmployeeDetails;

import Leave_manager.Input;
import Leave_manager.LeaveManager;

import Manager.AddEmployee;
import Manager.RemovingEmployee;
import Manager.managingLeaveRequest;
import java.time.*;
import java.time.format.DateTimeFormatter;

import CEO.CEO;
public class SystemController {
    SystemController(){
        if(Main.userInput.equals("C")){
            System.out.println("Enter your Username: ");
            String currCeoUserName = Input.sc.next();
            System.out.println("Enter your Password: ");
            String currCeoUserPass = Input.sc.next();
            int Login = 1;
            if((currCeoUserName.equals(CEO.ceoUserName))&&(currCeoUserPass.equals(CEO.ceoUserPass))) {
                do {
                    System.out.println("Select From Options Below: ");
                    System.out.println("1.Add Manager");
                    System.out.println("2.Show Manager Details");
                    System.out.println("3.Show Employee Under Managers");
                    System.out.println("4. LogOut and Exit The Console");
                    int userOption = Input.sc.nextInt();
                    switch (userOption) {
                        case 1: {
                            System.out.println("Enter Manager Name: ");
                            String currManName = Input.sc.next();
                            System.out.println("Enter Manager ID: ");
                            int currManID = Input.sc.nextInt();
                            new CEO().addManager(currManID, currManName);

                            break;
                        }
                        case 2: {
                            new displayEmployeeDetails().showManager();
                            break;
                        }
                        case 3: {
                            new displayEmployeeDetails().showEmployeeUnderManger();
                            break;
                        }
                        case 4: {
                            Main.secondExitCode = 0;
                            Login=0;
                            break;

                        }

                        default: {
                            System.out.println("Enter Valid Option!!");
                            break;
                        }


                    }
                }while(Login!=0);
            }
            else {
                System.out.println("Enter Valid UserName or Password!!!");
                Main.secondExitCode=0;
            }


        }

        else if(Main.userInput.equals("M")){
            System.out.println("Select from options below: ");
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Managing Leave Requests");
            System.out.println("4. Show AllEmployee details");
            System.out.println("5. Exit The console");
            int userOption = Input.sc.nextInt();
            switch (userOption){
                case 1:{
                   try { // add Employee

                       System.out.println("Enter your ID Number: ");
                       int currManID = Input.sc.nextInt();

                       System.out.print("Enter the Name of Employee: ");
                       String currEmpName = Input.sc.next();
                       System.out.print("Enter the Employee Id: ");
                       int currEmpId = Input.sc.nextInt();
                       int currEmpManagerId = currManID;
                       System.out.print("Enter the no. of Casual leaves Taken: ");
                       int currCasualLeave = Input.sc.nextInt();
                       System.out.print("Enter the no. of Annual leave taken: ");
                       int currAnnualLeave = Input.sc.nextInt();
                       System.out.print("Enter the no. of Medical Leave taken: ");
                       int currMedicalLeave = Input.sc.nextInt();
                       System.out.print("Enter the no. of Leaves Remaining: ");
                       int currRemainLeave = Input.sc.nextInt();
                       System.out.print("Enter the leave Status: ");
                       String currLeaveStatus = Input.sc.next();
                       LocalDateTime currDate = LocalDateTime.now();
                       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy  E H:m a");
                       String currentDate = currDate.format(formatter);

                       EmployeeDetails currEmp = new EmployeeDetails(currEmpName,currEmpId,currEmpManagerId,currCasualLeave,currAnnualLeave,currMedicalLeave,currRemainLeave,currLeaveStatus,currentDate);
                       new AddEmployee(currEmpId,currEmp);
                       break;
                   }catch (Exception e){
                       e.printStackTrace();
                       System.out.println("Try again with  valid input");
                       Main.secondExitCode =0;
                       break;
                   }



                }
                case 2:{
                    // delete employee
                    System.out.println("Enter the Employee Id of the employee to be removed"); int currEmpId = Input.sc.nextInt();
                    new RemovingEmployee(currEmpId);
                    break;

                }
                case 3:{
                    // managing leave request
                    new managingLeaveRequest();
                    break;


                }
                case 4:{
                    //Show Employee details
                        displayEmployeeDetails displayDetails = new displayEmployeeDetails();
                        System.out.println("Choose your Option");
                        System.out.println("1.All employees details");
                        System.out.println("2.Single employee details");
                        int n = Input.sc.nextInt();
                        if(n==1) {
                            displayDetails.showAllEmp();
                        }
                        else if(n==2){
                            displayDetails.displaySingleEmployeeDetails();
                        }
                        else{
                            System.out.println("Enter Valid Option!!!!");
                        }
                        break;
                }
                case 5:{
                    Main.secondExitCode =0;
                    break;
                }

                default:{
                    System.out.println("Enter Valid Option!!");
                    break;
                }
            }


        } else if (Main.userInput.equals("E")) {
            System.out.println("1. Apply for leave");
            System.out.println("2. Show remaining leaves");
            System.out.println("3. Check Applied leave Reports");
            System.out.println("4. Exit");
            int userOption = Input.sc.nextInt();
            switch (userOption){
                case 1:{
                        //apply for leave
                    new LeaveManager().checkLeave();
                    break;
                }
                case 2:{
                         //Leave Details
                    new LeaveDetails();
                    break;
                }
                case 3:{
                      //leave status
                    new LeaveStatus();
                    break;
                }
                case 4:{
                    Main.secondExitCode =0;
                    break;

                }
                default:{
                    System.out.println("Enter Valid Option!!");
                    break;
                }


            }


        }
    }
}
