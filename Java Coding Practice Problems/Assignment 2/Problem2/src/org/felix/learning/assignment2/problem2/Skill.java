package org.felix.learning.assignment2.problem2;

/**
 * Created by Felix on 2017-07-31.
 */
public class Skill {
    private String name;
    private int yearsExperience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    Skill(String name, int yearsExperience){
        this.setName(name);
        this.setYearsExperience(yearsExperience);
    }


}
