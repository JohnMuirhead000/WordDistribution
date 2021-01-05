import java.util.*;

public class Build {
    public static HashMap<String, Integer> BuildHash(String[] splited){

        HashMap<String, Integer> result = new HashMap<>();

            for (int i = 0; i < splited.length; i++) {

                if (!result.containsKey(splited[i])) {
                    result.put(splited[i], 1);
                } else {
                    result.put(splited[i], result.get(splited[i]) + 1);
                }
            }
        return result;
    }

    //This method is to sort the HashMap (got from youtube video) and put it into a LinkedList
    public static List<Map.Entry<String, Integer>>sort(HashMap<String, Integer> unsorted){


        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(unsorted.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        return list;
    }
}
