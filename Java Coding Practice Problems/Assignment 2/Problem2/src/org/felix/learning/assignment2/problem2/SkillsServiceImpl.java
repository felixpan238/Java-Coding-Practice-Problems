package org.felix.learning.assignment2.problem2;

import java.util.List;

/**
 * Created by Felix on 2017-07-31.
 */
public class SkillsServiceImpl implements SkillsService {

    //- Function to print the skills list of a given employee ----------------------------------------------------------
    public void printEmployeeSkills(Employee employee) {
        System.out.print("Skills: ");
        employee.getSkillsList().parallelStream().forEach(skill -> System.out.print(skill.getName() + ", "));
        System.out.println();
    }

    //- Function to print all the employees with a given skill ---------------------------------------------------------
    public void printEmployeesBySkillFilter(List<Employee> employeeList, String skillFilter) {
        for (Employee employee : employeeList){
            employee.getSkillsList().parallelStream()
                    .filter(skill -> skill.getName().equals(skillFilter))
                    .forEach(Employee -> employee.printEmployeeProperties());
        }
    }
}
