package org.felix.learning.assignment2.problem1;

import java.util.List;

/**
 * Created by Felix on 2017-07-31.
 */
public class AppleServiceImpl implements AppleService {

    // Method that prints out the result of a filter in any attribute.
    public void getApplesByGeneralFilter(List<Apple> appleList, String searchFilter){
        String filter = searchFilter.trim().toLowerCase();
        appleList.parallelStream()
                .filter(apple -> apple.getColor().trim().toLowerCase().equals(filter) ||
                        String.valueOf(apple.getWeight()).equals(filter) ||
                        apple.getVariety().trim().toLowerCase().equals(filter))
                .forEach(Apple::printAppleProperties);
    }

    // Method that prints out the result of a attribute specific search filter.
    public void getApplesByAttributeFilter(List<Apple> appleList, String attribute, String searchFilter){
        String filter = searchFilter.trim().toLowerCase();
        attribute = attribute.trim().toLowerCase();
        switch (attribute) {
            case "color":{
                appleList.parallelStream()
                        .filter(apple -> apple.getColor().trim().toLowerCase().equals(filter))
                        .forEach(Apple::printAppleProperties);
                break;
            }
            case "weight":{
                appleList.parallelStream()
                        .filter(apple -> String.valueOf(apple.getWeight()).equals(filter))
                        .forEach(Apple::printAppleProperties);
                break;
            }
            case "variety":{
                appleList.parallelStream()
                        .filter(apple -> apple.getVariety().trim().toLowerCase().equals(filter))
                        .forEach(Apple::printAppleProperties);
                break;
            }
            default:{
                System.out.println(attribute + " is not a valid attribute.");
            }

        }
    }
}
