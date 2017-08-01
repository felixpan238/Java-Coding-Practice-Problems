package org.felix.learning.assignment2.problem2;

import java.util.List;

/**
 * Created by Felix on 2017-07-31.
 */
public interface SkillsService {

    public void printEmployeeSkills(Employee employee);

    public void printEmployeesBySkillFilter(List<Employee> employeeList, String skill);
}
