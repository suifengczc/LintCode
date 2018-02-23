package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _133_LongestWords {
    /*
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    public List<String> longestWords(String[] dictionary) {
        // write your code here
        Map<Integer, ArrayList<String>> result = new HashMap<>();
        int longest = 0;
        for (String str : dictionary) {
            int len = str.length();
            if (len >= longest) {
                longest = len;
                if (result.containsKey(len)) {
                    result.get(len).add(str);
                }else{
                    ArrayList<String> list = new ArrayList<>();
                    list.add(str);
                    result.put(len, list);
                }
            }
        }
        return result.get(longest);
    }
}
