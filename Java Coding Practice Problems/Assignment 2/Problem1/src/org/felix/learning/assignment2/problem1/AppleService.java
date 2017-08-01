package org.felix.learning.assignment2.problem1;

import java.util.List;

/**
 * Created by Felix on 2017-07-31.
 */
public interface AppleService {

    public void getApplesByGeneralFilter(List<Apple> appleList, String searchFilter);
    public void getApplesByAttributeFilter(List<Apple> appleList, String attribute, String searchFilter);

}
