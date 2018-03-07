package easy;

public class _365_Count1InBinary {
    /*
     * @param num: An integer
     * @return: An integer
     */
    public int countOnes(int num) {
        // write your code here
        if (num == 0) {
            return 0;
        }
        String s = Integer.toBinaryString(num);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
