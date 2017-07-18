package org.felix.learning.assignment1.problem2;

/**
 * Created by Felix on 2017-07-12.
 */
public class Employee {

    //- ENUM declared for different possible position within the company -----------------------------------------------
    public enum Position {
        CEO, SENIOR_MANAGER, MANAGER, DEVELOPER, OTHER
    }
    //- Variable declarations and setters and getters ------------------------------------------------------------------
    private String name;
    private int age;
    private long salary;
    private Position position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {this.age = age; }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    //- Employee constructor -------------------------------------------------------------------------------------------
    public Employee (String name, int age, long salary, Position position){
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
        this.setPosition(position);
    }

    //- Function to print the properties of a given employee -----------------------------------------------------------
    public void printEmployeeProperties(){
        System.out.println("Name: " + this.getName() + ", Age: " + this.getAge() + ", Salary: " + this.getSalary() + ", Position: " + this.getPosition());
    }

}
