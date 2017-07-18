package org.felix.learning.assignment1.problem1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felix on 2017-07-12.
 */
public class TestApple {

    //- Main apple test functions ---------------------------------------------------------------------------------------
    public static void main(String[] args) {

        // Generates a List of Apples
        List<Apple> appleList = Arrays.asList(
                new Apple("red", 10, "Gala"),
                new Apple("red", 7, "Fuji"),
                new Apple("green", 8, "Granny Smith"),
                new Apple("red", 4, "Honeycrisp"),
                new Apple("yellow", 6, "Golden Delicious"),
                new Apple("red", 2, "Cortland"),
                new Apple("yellow", 7, "Crispin"),
                new Apple("red", 7, "Red Delicious")
        );

        // Prints a list of Apples
        System.out.println(System.lineSeparator() + "The full list of Apples is:");
        appleList.parallelStream().forEach(Apple::printAppleProperties);

        // Prints a list of Apples where color matches search filter
        System.out.println(System.lineSeparator() + "The list of Apples is with the color yellow is:");
        String searchFilter = "yellow";
        appleList.parallelStream()
                .filter(apple -> apple.getColor() == searchFilter)
                .forEach(Apple::printAppleProperties);

        // Sorts a list of Apples by color, then prints the resulting list
        System.out.println(System.lineSeparator() + "Here is the list of Apples sorted by color:");
        appleList.stream() //Don't use parallelStream while sorting
                .sorted((apple1, apple2) -> apple1.getColor().compareTo(apple2.getColor()))
                .forEach(Apple::printAppleProperties);

    }


}
