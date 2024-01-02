// Assignment: 4
// Author: Ram Nagid, ID: 318692779
/**
 * The employee package contains classes related to employee records.
 */
package employee;

/**
 * The LeaveRecord class represents the record of leaves taken by an employee.
 * It contains the employee ID, the total number of leaves allocated, and the number of leaves taken.
 */
public record LeaveRecord(int id, int totalLeaves, int leavesTaken) {

    /**
     * Calculates the remaining leaves based on the total number of leaves allocated and the leaves taken.
     *
     * @return the number of remaining leaves
     */
    public int getLastLeaves() {
        return totalLeaves - leavesTaken;
    }

    /**
     * Returns a string representation of the LeaveRecord object.
     *
     * @return a string representation of the LeaveRecord object
     */
    @Override
    public String toString() {
        return "LeaveRecord{" +
                "id=" + id +
                ", totalLeaves=" + totalLeaves +
                ", leavesTaken=" + leavesTaken +
                ", LastLeaves=" + getLastLeaves() +
                '}';
    }
}