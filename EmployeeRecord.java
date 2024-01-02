// Assignment: 4
// Author: Ram Nagid, ID: 318692779
/**
 * The employee package contains classes related to employee records.
 */
package employee;
/**

 The EmployeeRecord class represents the record of an employee.

 It contains the employee ID, name, age, department, and designation.
 */
public record EmployeeRecord(int id, String name, int age, String department, String designation) {
    /**

     Returns a string representation of the EmployeeRecord object.
     @return a string representation of the EmployeeRecord object
     */
    @Override
    public String toString() {
        return "EmployeeRecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
