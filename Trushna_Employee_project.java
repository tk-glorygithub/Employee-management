package kaware;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
   private int Attendence;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.Attendence= Attendence;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
    public int getAttendence() {
    	return Attendence;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class  Trushna_Employee_project {
    private static List<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("*_________________ T.K SOFTWARES WELCOMES YOU ALL ____________________*");
        System.out.println("Welcome to the Employee Management System!");

        while(true) {
            System.out.println("click 1 to view all employees");
            System.out.println("click 2 to add an employee");
            System.out.println("click 3 to update an employee's salary");
            System.out.println("click 4 to delete an employee");
            System.out.println("click 5 to mark your Attendence");
            System.out.println("click 6 to exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewEmployees();
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    updateSalary();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
               EmoloyeesAttendence();
               break;
                case 6:
                    System.out.println("exit details!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void viewEmployees() {
        System.out.println("Here are all the 3000 employees in the system:");

        for(Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Department: " + employee.getDepartment() + ", Salary: " + employee.getSalary() + " Attendence :"+ employee.getAttendence());
        }
    }

    private static void addEmployee() {
        System.out.println("Enter the employee's name:");
        String name = scanner.next();

        System.out.println("Enter the employee's department:");
        String department = scanner.next();

        System.out.println("Enter the employee's salary:");
        double salary = scanner.nextDouble();
        
        System.out.println("Enter total working Days of Employee");
        int Attendence = scanner.nextInt();

        int id = employees.size() + 1;

        Employee employee = new Employee(id, name, department, salary);

        employees.add(employee);

        System.out.println(" New Employee added!");
    }

    private static void updateSalary() {
        System.out.println("Enter the ID of the employee you want to update:");
        int id = scanner.nextInt();

        System.out.println("Enter the new salary for the employee:");
        double salary = scanner.nextDouble();

        for(Employee employee : employees) {
            if(employee.getId() == id) {
                employee.setSalary(salary);
                System.out.println("Employee's salary updated!");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    private static void deleteEmployee() {
        System.out.println("Give Employees ID,which is Expected to be delete :");
        		
        int id = scanner.nextInt();

        for(int i=0; i<employees.size(); i++) {
            if(employees.get(i).getId() == id) {
                employees.remove(i);
                System.out.println("Previous Employee deleted!");
               return;
            }
        }

        System.out.println("Sorry Employee not found.");
    }
    public static void  EmoloyeesAttendence() {
    	System.out.println("Total working Days in this month");
    	//int  id = scanner.nextInt();
    	int Attendence = scanner.nextInt();
    		System.out.println(" your were present "+ " " + Attendence+ " days" );
    	}
    
}

