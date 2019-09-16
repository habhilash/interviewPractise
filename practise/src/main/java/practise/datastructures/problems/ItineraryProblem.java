package practise.datastructures.problems;

/*
* Given a list of tickets, find itinerary in order using the given list.
* Input:
"Chennai" -> "Banglore"
"Bombay" -> "Delhi"
"Goa"    -> "Chennai"
"Delhi"  -> "Goa"

Output:
Bombay->Delhi, Delhi->Goa, Goa->Chennai, Chennai->Banglore,

Solution Algorithm :
1) Create a HashMap of given pair of tickets.  Let the created
   HashMap be 'dataset'. Every entry of 'dataset' is of the form
   "from->to" like "Chennai" -> "Banglore"

2) Find the starting point of itinerary.
     a) Create a reverse HashMap.  Let the reverse be 'reverseMap'
        Entries of 'reverseMap' are of the form "to->form".
        Following is 'reverseMap' for above example.
        "Banglore"-> "Chennai"
        "Delhi"   -> "Bombay"
        "Chennai" -> "Goa"
        "Goa"     ->  "Delhi"

     b) Traverse 'dataset'.  For every key of dataset, check if it
        is there in 'reverseMap'.  If a key is not present, then we
        found the starting point. In the above example, "Bombay" is
        starting point.

3) Start from above found starting point and traverse the 'dataset'
   to print itinerary.
* */

import java.util.HashMap;
import java.util.Map;

public class ItineraryProblem {
    public static void main(String[] args) {
        Map<String, String> routeMap = new HashMap<>();
        routeMap.put("Chennai", "Banglore");
        routeMap.put("Bombay", "Delhi");
        routeMap.put("Goa", "Chennai");
        routeMap.put("Delhi", "Goa");

        printResult(routeMap);
    }

    private static void printResult(Map<String, String> routeMap) {
        Map<String, String> reverseMap = new HashMap<>();

        // Create reverse map
        for (Map.Entry<String, String> entry : routeMap.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }

        // Find the starting point of the itinerary
        String source = null;
        for (Map.Entry<String, String> entry : routeMap.entrySet()) {
            if ( !reverseMap.containsKey(entry.getKey()) ) {
                source = entry.getKey();
                break;
            }
        }

        if (source == null) {
            System.out.println("Invalid input");
            return;
        }

        String destination = routeMap.get(source);
        while (destination != null) {
            System.out.print(source + "->" + destination + ",");
            source = destination;
            destination = routeMap.get(destination);
        }
    }
}
