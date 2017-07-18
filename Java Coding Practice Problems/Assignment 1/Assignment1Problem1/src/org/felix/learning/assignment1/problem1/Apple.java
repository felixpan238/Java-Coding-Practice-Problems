package org.felix.learning.assignment1.problem1;

/**
 * Created by Felix on 2017-07-12.
 */
public class Apple {
    //- Variable declarations and setters and getters ------------------------------------------------------------------
    private String color;
    private int weight;
    private String variety;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    //- Apple constructor ----------------------------------------------------------------------------------------------
    public Apple(String color, int weight, String variety){
        this.setColor(color);
        this.setWeight(weight);
        this.setVariety(variety);
    }

    //- Function to print apple's properties ---------------------------------------------------------------------------
    public void printAppleProperties(){
        System.out.println(
                "Color = " + this.getColor() + ", weight = " + this.getWeight() + ", variety = " + this.getVariety());
    }
}
