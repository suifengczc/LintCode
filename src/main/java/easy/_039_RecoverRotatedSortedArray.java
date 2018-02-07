package easy;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;

public class _039_RecoverRotatedSortedArray {
    /*
     * @param nums: An integer array
     * @return: nothing
     */
    public static void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        if (nums.size() == 0) {
            return;
        }
        int maxIndex = 0;
        int max = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) >= max) {
                max = nums.get(i);
                maxIndex = i;
            } else {
                break;
            }
        }
        if (maxIndex == nums.size() - 1) {
            return;
        }
        for (int i = 0; i <= maxIndex; i++) {
            nums.add(nums.get(0));
            nums.remove(0);
        }
        System.out.println(nums);
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(1);
        a.add(-1);
        a.add(1);
        a.add(1);
        recoverRotatedSortedArray(a);
    }
}
