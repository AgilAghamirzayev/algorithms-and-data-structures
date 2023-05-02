package lists;

public class EmployeeNode {
    public Employee employee;
    public EmployeeNode next;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
