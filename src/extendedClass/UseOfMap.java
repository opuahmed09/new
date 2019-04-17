package extendedClass;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseOfMap {

    public static void main(String[] args) {


        List<String> cityOFUSA = new ArrayList<String>();

        cityOFUSA.add("New York");
        cityOFUSA.add("Florida");
        cityOFUSA.add("California");
        cityOFUSA.add("new Mexico");
        cityOFUSA.add("taxes");

        List<String> cityOfFrance = new ArrayList<String>();

        cityOfFrance.add("Paris");
        cityOfFrance.add("city1");
        cityOfFrance.add("city2");
        cityOfFrance.add("city3");

        List<String> cityOfSpain = new ArrayList<String>();

        cityOfSpain.add("Madrid");
        cityOfSpain.add("barcelona");
        cityOfSpain.add("A,Madrid");


        Map<Integer, List<String>> map = new LinkedHashMap<>();
        map.put(1, cityOFUSA);
        map.put(2, cityOfFrance);
        map.put(3, cityOfSpain);


        for (Map.Entry<Integer, List<String>> city : map.entrySet()) {
            System.out.println(" ->  " + city.getValue());
        }

        ///  System.out.println(map.get(3));


    }


}
