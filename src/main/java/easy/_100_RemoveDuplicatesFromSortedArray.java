package easy;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _100_RemoveDuplicatesFromSortedArray {
    /*
     * @param nums: An ineger array
     * @return: An integer
     * solution_1 使用了额外的map，不符合题意
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

    /**
     * @param nums: An ineger array
     * @return: An integer
     * solution_1 不使用额外的开销，在当前数组中进行转换
     */
    public int solution_2(int[] nums) {
        // write your code here
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length <= 1) {
            return nums.length;
        }
        int currIndex = 0;
        int moveIndex = 1;
        while (moveIndex < nums.length) {
            while (moveIndex < nums.length && nums[currIndex] == nums[moveIndex]) {
                moveIndex++;
            }
            if (moveIndex < nums.length && nums[currIndex] != nums[moveIndex]) {
                nums[currIndex + 1] = nums[moveIndex];
                currIndex++;
                moveIndex++;
            }
        }
        return currIndex + 1;
    }
}
