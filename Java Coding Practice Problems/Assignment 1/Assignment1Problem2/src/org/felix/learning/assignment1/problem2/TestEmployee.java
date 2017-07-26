package org.felix.learning.assignment1.problem2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.lang.Long;

/**
 * Created by Felix on 2017-07-12.
 */
public class TestEmployee {

    //- Main apple test functions --------------------------------------------------------------------------------------
    public static void main(String[] args) {

        //- Generates variables to run tests ---------------------------------------------------------------------------
        // Creates an instance of object Employee
        Employee employee1 = new Employee("TestEmployee", 25, 50000, Employee.Position.DEVELOPER);


        // Generates a List of Employees
        List<Employee> employeeList = Arrays.asList(
                new Employee("Albert", 25, 50000, Employee.Position.DEVELOPER),
                new Employee("Bob", 35, 80000, Employee.Position.MANAGER),
                new Employee("Carl", 50, 100000, Employee.Position.SENIOR_MANAGER),
                new Employee("David", 24, 51000, Employee.Position.DEVELOPER),
                new Employee("Elvis", 27, 52000, Employee.Position.DEVELOPER),
                new Employee("Fred", 36, 81000, Employee.Position.MANAGER),
                new Employee("Gary", 63, 200000, Employee.Position.CEO)
        );

        //- Test calls -------------------------------------------------------------------------------------------------
        //Finds and prints the Employee with the highest salary
        System.out.println ();
        System.out.println ("The highest paid employee is:");
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return Long.compare(employee2.getSalary(), employee1.getSalary());
            }
        });
        employeeList.get(0).printEmployeeProperties();

        //Prints out a list of all MANAGERs
        System.out.println(System.lineSeparator() + "The following employees are all the Managers:");
        Employee.Position searchPosition = Employee.Position.MANAGER;
        printService(employeeList, employee -> employee.getPosition() == searchPosition);

        // Does what the line above does without the use of printService below
//        employeeList.parallelStream()
//                .filter(employee -> employee.getPosition() == searchPosition)
//                .forEach(Employee::printEmployeeProperties);

        //Finds and prints Employee from a List from a given name
        System.out.println ();
        System.out.println ("Search result for name David:");
        String searchName = "David";
        printService(employeeList, employee -> employee.getName() == searchName);

        // Does what the line above does without the use of printService below
//        employeeList.parallelStream()
//                .filter(employee -> employee.getName() == searchName)
//                .forEach(Employee::printEmployeeProperties);
    }

    //- Function to print List of Employees ----------------------------------------------------------------------------
    private static void printEmployeeList(List<Employee> employeeList){
        for (Employee employee : employeeList){
            System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge() + ", Salary: " +
                    employee.getSalary() + ", Position: " + employee.getPosition());
        }
    }

    private static void printService(List<Employee> employeeList, EmployeeService service){
        for (Employee employee : employeeList){
            if (service.service(employee)){
                employee.printEmployeeProperties();
            }
        }
    }

    // - Interface for EmployeeService Lambas --------------------------------------------------------------------------
    public interface EmployeeService {
        Boolean service(Employee employee);
    }
}
