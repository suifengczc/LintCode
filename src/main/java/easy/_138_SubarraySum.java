package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _138_SubarraySum {
    /*
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public static List<Integer> subarraySum(int[] nums) {
        // write your code here
        int len = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                ans.add(map.get(sum) + 1);
                ans.add(i);
                return ans;
            }
            map.put(sum, i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 3, 4};
        System.out.println(subarraySum(a));
    }
}
