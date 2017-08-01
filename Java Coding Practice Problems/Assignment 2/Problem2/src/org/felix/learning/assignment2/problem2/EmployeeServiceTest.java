package org.felix.learning.assignment2.problem2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Felix on 2017-07-31.
 */
public class EmployeeServiceTest {

    public static void main(String[] args) {

        // Initiates employee service implementation
        SkillsService skillsService = new SkillsServiceImpl();

        // Generates a List of Employees
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add( new Employee("Albert", 25, 50000, Employee.Position.DEVELOPER,
                new Skill("Java", 4)));
        employeeList.add( new Employee("Bob", 35, 80000, Employee.Position.MANAGER,
                new Skill("Java", 4), new Skill("Management", 4)));
        employeeList.add( new Employee("Carl", 50, 100000, Employee.Position.SENIOR_MANAGER,
                new Skill("Java", 4), new Skill("Management", 4)));
        employeeList.add( new Employee("David", 24, 51000, Employee.Position.DEVELOPER,
                new Skill("Java", 4)));
        employeeList.add( new Employee("Elvis", 27, 52000, Employee.Position.DEVELOPER,
                new Skill("Java", 4)));
        employeeList.add( new Employee("Fred", 36, 81000, Employee.Position.MANAGER,
                new Skill("Java", 4), new Skill("Management", 4)));
        employeeList.add( new Employee("Gary", 63, 200000, Employee.Position.CEO,
                new Skill("Java", 4), new Skill("Management", 4)));

        //Prints list of skills for given employee, Note can be combined with get employee by name search in future.
        System.out.println(System.lineSeparator() + "Result of print skills list given an employee, Index 2 (Carl):");
        skillsService.printEmployeeSkills(employeeList.get(2));

        //Prints the profile of all employees that have the given skill "Management".
        System.out.println(System.lineSeparator() + "Search result for employees with skill \"Management\":");
        skillsService.printEmployeesBySkillFilter(employeeList, "Management");



    }
}