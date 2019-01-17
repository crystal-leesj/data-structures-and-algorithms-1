package leftjoin;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class LeftJoin {

    //compare the keys
    //if keys are the same, add the  values to the left hashmap
    //case where the keys are not similar add null

    public List<List<String>> LeftJoin(Map<String, String> mapLeft, Map<String, String> mapRight) {
        //populate this list with the combined map
        List<List<String>> results = new ArrayList<>();

        for (String key : mapLeft.keySet()) {
            List<String> leftjoin = new ArrayList<>();
            //compare the keys
            if (mapRight.containsKey(key)) {
                //at that key change the value
                leftjoin.add(key);
                leftjoin.add(mapLeft.get(key));
                leftjoin.add(mapRight.get(key));
            } else {
                leftjoin.add(key);
                leftjoin.add(mapLeft.get(key));
                leftjoin.add(mapRight.get(null));
            }
            //add to results array
            results.add(leftjoin);
        }
        return results;
    }
}
