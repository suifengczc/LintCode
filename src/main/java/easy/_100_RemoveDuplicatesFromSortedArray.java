package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _100_RemoveDuplicatesFromSortedArray {
    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length <= 1) {
            return nums.length;
        }
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }
        for (Integer key : map.keySet()) {
            nums[index++] = key;
        }
        return map.size();
    }
}
