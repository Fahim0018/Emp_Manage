package Leave_manager;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class LeaveRequest {
    public static HashMap<Integer,LeaveManager.localReq> reqLeave = new HashMap<>();
    public static Queue<Integer> employeeID = new LinkedList<>();


    public LeaveRequest(int empId,LeaveManager.localReq lReq){
        reqLeave.put(empId,lReq);
        employeeID.add(empId);

    }
}
