package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {

        System.out.println("---List Interface---");
        List <String> cities = new ArrayList<>();

        cities.add("Paris");
        cities.add("London");
        cities.add("New York");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Delhi");
        cities.add("Kolkata");

        System.out.println("City at the index of 0 :"+cities.get(0)+"\n City at the index of 1 :"+cities.get(1));

        System.out.println("Size of the Array :"+cities.size());

        System.out.println("Is array list contains : Paris"+cities.contains("Paris"));

        System.out.println("Remove the city London :" +cities.remove("London"));

        System.out.println("Remove the city in the index of 2:"+cities.remove(2));

        for (String string : cities) {
            System.out.println("Updated City List:"+string);
        }

        System.out.println("\n ---Set Interface---");
         Set<String> uniquesColors = new HashSet<>();
         uniquesColors.add("Red");
         uniquesColors.add("Blue");
         uniquesColors.add("Green");
         uniquesColors.add("Yellow");
         uniquesColors.add("Red");

         System.out.println("Current Size of the Set :"+uniquesColors.size());

         System.out.println("Checking Red Color in the Set :"+uniquesColors.contains("Red"));

         System.out.println("Remove the Red Color from the Set :"+uniquesColors.remove("Red"));

         for (String string : uniquesColors) {
            System.out.println("Updated HashSet :"+ string);
         }

         System.out.println("\n ---Map Interface---");

         Map<String,Integer> studentScores=new HashMap<>();
         studentScores.put("Raja", 78);
         studentScores.put("Rani", 50);
         studentScores.put("Raj", 98);
         studentScores.put("Ramu", 65);
         studentScores.put("Ragav", 33);
         studentScores.put("Raj", 98);

         System.out.println("Details of Raja :"+studentScores.get("Raja"));

         System.out.println("Details of Raja Checking :"+studentScores.containsKey("Raja")+studentScores.containsValue(78));

         System.out.println("Number of Entries in the Map :"+studentScores.size());

         System.out.println("Removing Ramu :"+studentScores.remove("Ramu"));

          
        for (String studentName : studentScores.keySet()) {
            System.out.println("Student Name :"+studentName);
        }

        for (Integer studentScore : studentScores.values()) {
            System.out.println("Scroes of the Student :" + studentScore);
        }

        for (Map.Entry<String,Integer> student : studentScores.entrySet()) {
         System.out.println("Student:"+student.getKey()+" Score:"+student.getValue());   
        }
    }
}
