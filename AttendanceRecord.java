// Assignment: 4
// Author: Ram Nagid, ID: 318692779
package employee;
/**

 The AttendanceRecord class represents the attendance record of an employee.

 It contains the employee ID, the total number of working days, and the number of days present.
 */
public record AttendanceRecord(int id, double totalWorkingDays, double daysPresent) {

    /**

     Calculates the percentage of days present based on the total number of working days.
     @return the percentage of days present
     */
    public double daysPresentPercentage() {
        return (daysPresent / totalWorkingDays) * 100;
    }
    /**

     Returns a string representation of the AttendanceRecord object.
     @return a string representation of the AttendanceRecord object
     */
    @Override
    public String toString() {
        return "AttendanceRecord{" +
                "id=" + id +
                ", totalWorkingDays=" + totalWorkingDays +
                ", daysPresent=" + daysPresent +
                ", daysPresentPercentage=" + daysPresentPercentage() +
                '}';
    }
}