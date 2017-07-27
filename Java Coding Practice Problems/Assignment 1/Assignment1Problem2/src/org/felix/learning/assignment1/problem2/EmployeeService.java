package org.felix.learning.assignment1.problem2;

import java.util.List;

/**
 * Created by Felix on 2017-07-26.
 */

public interface EmployeeService {
    double getMaximumSalary(List<Employee> employees);

    void printByCategory(List<Employee> employees, Employee.Position position);

    void printByName(List<Employee> employees, String name);
}
