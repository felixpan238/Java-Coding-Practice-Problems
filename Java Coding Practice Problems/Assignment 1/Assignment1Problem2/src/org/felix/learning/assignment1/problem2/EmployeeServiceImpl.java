package org.felix.learning.assignment1.problem2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Created by Felix on 2017-07-26.
 */

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public double getMaximumSalary(List<Employee> employees) {
        long maximumSalary = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() > maximumSalary){
                maximumSalary = employee.getSalary();
            }
        }
        return maximumSalary;
    }

    @Override
    public void printByCategory(List<Employee> employees, Employee.Position position) {
        employees.parallelStream()
                .filter(employee -> employee.getPosition() == position)
                .forEach(Employee::printEmployeeProperties);
    }

    @Override
    public void printByName(List<Employee> employees, String name) {
        employees.parallelStream()
                .filter(employee -> employee.getName() == name)
                .forEach(Employee::printEmployeeProperties);
    }
}