package org.felix.learning.assignment1.problem2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Felix on 2017-07-26.
 */

public class EmployeeServiceTest {

    public static void main(String[] args) {
        // Initiates employee service implementation
        EmployeeService employeeService = new EmployeeServiceImpl();

        // Generates a List of Employees
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee("Albert", 25, 50000, Employee.Position.DEVELOPER);
        Employee employee2 = new Employee("Bob", 35, 80000, Employee.Position.MANAGER);
        Employee employee3 = new Employee("Carl", 50, 100000, Employee.Position.SENIOR_MANAGER);
        Employee employee4 = new Employee("David", 24, 51000, Employee.Position.DEVELOPER);
        Employee employee5 = new Employee("Elvis", 27, 52000, Employee.Position.DEVELOPER);
        Employee employee6 = new Employee("Fred", 36, 81000, Employee.Position.MANAGER);
        Employee employee7 = new Employee("Gary", 63, 200000, Employee.Position.CEO);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);

        // Prints maximum salary using the getMaximumSalary method in EmployeeServiceImpl
        System.out.println(System.lineSeparator() + "The maximum salary is:");
        System.out.println(employeeService.getMaximumSalary(employeeList));

        // Prints a list of all Developers using the printByCategory method in EmployeeServiceImpl
        System.out.println(System.lineSeparator() + "List of employees with position DEVELOPER:");
        employeeService.printByCategory(employeeList, Employee.Position.DEVELOPER);

        System.out.println(System.lineSeparator() + "List of employees with name matching \"David\":");
        // Prints a list of all employees matching name David using the printByName method in EmployeeServiceImpl
        employeeService.printByName(employeeList, "David");

    }
}