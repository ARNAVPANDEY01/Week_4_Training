//Q-2
// Find Frequency of Elements
//Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
//Example:
//Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.
package ListInterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfElements {
    public static Map<String, Integer> countfrequency(List<String> list) {
        Map<String, Integer> frequencymap = new HashMap<>();

        for (String item : list) {
            frequencymap.put(item, frequencymap.getOrDefault(item, 0) + 1);
        }

        return frequencymap;
    }

    public static void main(String[]args){
        List<String> item = Arrays.asList("Apple", "Banana", "Apple", "Mango");

        Map<String, Integer> frequencymap = countfrequency(item);

        System.out.println("Frequency Of Elements:" + frequencymap);
    }
}
