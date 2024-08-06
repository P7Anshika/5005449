package Exercise4;

public class EmployeeManager {
    private Employee[] employees;
    private int size;

    // Constructor
    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add an employee
    public void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size++] = employee;
        } else {
            System.out.println("Array is full.");
        }
    }

    // Search for an employee by ID
    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse and display all employees
    public void displayEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete an employee by ID
    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                // Shift elements left
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;  // Avoid memory leak
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        EmployeeManager em = new EmployeeManager(10);

        em.addEmployee(new Employee(1, "Alice", "Manager", 90000));
        em.addEmployee(new Employee(2, "Bob", "Developer", 75000));

        System.out.println("All Employees:");
        em.displayEmployees();

        System.out.println("Searching for employee with ID 1:");
        System.out.println(em.searchEmployee(1));

        System.out.println("Deleting employee with ID 2.");
       
    }
}