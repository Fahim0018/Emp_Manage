package CEO;
import Leave_manager.*;
import Manager.Manager;

import java.util.HashMap;

public class CEO extends Manager {
    public static final String ceoUserName = "fahim@gmail.com";
    public static  final String ceoUserPass="zoho123";
    public static HashMap<Integer,String> Manger_Details = new HashMap<>();


    public void addManager(int manID,String manName){
        managerName=manName;
        managerID=manID;
        Manger_Details.put(managerID,managerName);
    }


}
