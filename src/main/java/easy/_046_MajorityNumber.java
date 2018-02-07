package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _046_MajorityNumber {
    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public static int majorityNumber(List<Integer> nums) {
        // write your code here
        Map<Integer, Integer> count = new HashMap<>();
        int max = 0;
        int num = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (count.containsKey(nums.get(i))) {
                int value = count.get(nums.get(i));
                count.put(nums.get(i), value + 1);
                if (max <= value) {
                    max = value;
                    num = nums.get(i);
                }
            } else {
                count.put(nums.get(i), 1);
            }
        }
        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        //1,1,1,1,2,2,2
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(2);
        majorityNumber(a);
    }
}
