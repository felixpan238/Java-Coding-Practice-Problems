package org.felix.learning.assignment1.problem2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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
        findHighestPaidEmpoyee(employeeList).printEmployeeProperties();

        //Prints out a list of all MANAGERs using Lambdas
        System.out.println(System.lineSeparator() + "The following employees are all the Managers:");
        Employee.Position searchFilter = Employee.Position.MANAGER;
        employeeList.parallelStream()
                .filter(employee -> employee.getPosition() == searchFilter)
                .forEach(Employee::printEmployeeProperties);

        //Finds and prints Employee from a List from a given name
        System.out.println ();
        System.out.println ("Search result for name David:");
        findEmployeeByName(employeeList, "David").printEmployeeProperties();

        //Sorts and prints out an Employee list alphabetically by name
//        sortEmployeeAlphbeticallyByName(employeeList);
//        printEmployeeList(employeeList);

    }

    //- Function to print List of Employees ----------------------------------------------------------------------------
    private static void printEmployeeList(List<Employee> employeeList){
        for (Employee employee : employeeList){
            System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge() + ", Salary: " +
                    employee.getSalary() + ", Position: " + employee.getPosition());
        }
    }

    //- Function to return the highest paid Employee Object ------------------------------------------------------------
    private static Employee findHighestPaidEmpoyee(List<Employee> employeeList){
        Employee highestPaidEmployee = employeeList.get(0);
        for (Employee employee : employeeList){
            if(employee.getSalary() > highestPaidEmployee.getSalary()){
                highestPaidEmployee = employee;
            }
        }
        return highestPaidEmployee;
    }

    //- Function to print all Employees from a list that meet a condition ----------------------------------------------
    private static void performAllEmployeesByCondition(List<Employee> employeeList, Predicate<Employee> condition, Consumer<Employee> consumer){
        for (Employee employee : employeeList){
            if(condition.test(employee)) {
                consumer.accept(employee);
            }
        }
    }

    //- Function to find an Employee from a List by a given name -------------------------------------------------------
    private static Employee findEmployeeByName(List<Employee> employeeList, String searchName){
        for (Employee employee : employeeList){
            if(employee.getName() == searchName) {
                Employee foundEmployee = employee;
                return foundEmployee;
            }
        }
        return null;
    }

    //- Function to sort Employees List by name -------------------------------------------------------------------------
    private static void sortEmployeeAlphbeticallyByName(List<Employee> employeeList){
        Collections.sort(employeeList, new Comparator<Employee>(){
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        });
        Collections.sort(employeeList, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));
    }

}
