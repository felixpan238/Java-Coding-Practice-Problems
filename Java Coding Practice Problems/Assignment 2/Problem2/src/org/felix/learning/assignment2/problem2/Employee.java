package org.felix.learning.assignment2.problem2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Felix on 2017-07-31.
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
    private List<Skill> skillsList = new ArrayList<Skill>();


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

    public List<Skill> getSkillsList() {return skillsList;}

    public void setSkillsList(List<Skill> skillsList) {this.skillsList = skillsList;}



    //- Employee constructors ------------------------------------------------------------------------------------------
    public Employee (String name, int age, long salary, Position position){
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
        this.setPosition(position);
    }

    public Employee (String name, int age, long salary, Position position, List<Skill> skillsList){
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
        this.setPosition(position);
        this.setSkillsList(skillsList);
    }

    public Employee (String name, int age, long salary, Position position, Skill... skills){
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
        this.setPosition(position);
        for (Skill skill : skills){
            this.addSkill(skill);
        }
    }

    //- Function to print the properties of a given employee -----------------------------------------------------------
    public void printEmployeeProperties(){
        System.out.println("Name: " + this.getName() + ", Age: " + this.getAge() + ", Salary: " + this.getSalary() + ", Position: " + this.getPosition());
    }


    public void addSkill(Skill skill){
        this.skillsList.add(skill);
    }




}
