// Assignment: 4
// Author: Ram Nagid, ID: 318692779
/**
 * The employee package contains classes related to employee records.
 */
package employee;
/**

 The PayrollRecord class represents the payroll record of an employee.

 It contains the employee ID, salary, bonus, and tax deductions.
 */
public record PayrollRecord(int id, int salary, int bonus, int tax) {

    /**

     Calculates the final salary after deducting the tax from the salary and adding the bonus.
     @return the final salary
     */
    @Override
    public int salary() {
        return (salary + bonus) - tax;
    }
    /**

     Returns a string representation of the PayrollRecord object.
     @return a string representation of the PayrollRecord object
     */
    @Override
    public String toString() {
        return "PayrollRecord{" +
                "id=" + id +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", tax=" + tax +
                ", final salary=" + salary() +
                '}';
    }
}