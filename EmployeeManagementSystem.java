// Assignment: 4
// Author: Ram Nagid, ID: 318692779
package employee;
/**
 * Possible main check for ArrayQueue.
 */
public class EmployeeManagementSystem {
    public static void main(String []args){
        EmployeeRecord ER1= new EmployeeRecord(318692779,"Ram Nagid",24,"Computer Science","First year");
        PayrollRecord ER01= new PayrollRecord(318692779,40000,3700,7000);
        LeaveRecord ER001= new LeaveRecord(318692779,100,70);
        AttendanceRecord ER0001= new AttendanceRecord(318692779,265,210);
        System.out.println(ER1.toString());
        System.out.println(ER01.toString());
        System.out.println(ER001.toString());
        System.out.println(ER0001.toString());
        EmployeeRecord ER2= new EmployeeRecord(28511053,"Dor Nagid",20,"IDF","warfare");
        PayrollRecord ER02= new PayrollRecord(28511053,20000,5000,3000);
        LeaveRecord ER002= new LeaveRecord(28511053,34,17);
        AttendanceRecord ER0002= new AttendanceRecord(28511053,365,210);
        System.out.println("\n\n"+ER2.toString());
        System.out.println(ER02.toString());
        System.out.println(ER002.toString());
        System.out.println(ER0002.toString());
    }
}
