package org.felix.learning.assignment2.problem1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felix on 2017-07-31.
 */
public class TestAppleService {
    public static void main(String[] args) {

        //Initiates apple service
        AppleService appleService = new AppleServiceImpl();

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

        //Prints out the result of a general search filter.
        String filter = " gAlA"; //Test if the attribute will trim and acts non case sensitive.
        System.out.println(System.lineSeparator() + "Search results for \"" + filter + "\":");
        appleService.getApplesByGeneralFilter(appleList, filter);

        //Prints out the result of a attribute specific search filter.
        String attributeFilter = "7 "; //Test if the attribute will trim
        String attribute = "wEiGht"; //Test if the filter is non case sensitive.
        System.out.println(System.lineSeparator() + "Search results for \"" + attributeFilter + "\" in \"" + attribute + "\":");
        appleService.getApplesByAttributeFilter(appleList, attribute, attributeFilter);
    }
}
