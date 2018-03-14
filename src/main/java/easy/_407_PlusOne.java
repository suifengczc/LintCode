package easy;

public class _407_PlusOne {
    /**
     * @param digits: a number represented as an array of digits
     * @return: the result
     */
    public int[] plusOne(int[] digits) {
        // write your code here
        int len = digits.length;
        int plus = 1;
        int index = len - 1;
        do {
            int sum = digits[index] + plus;
            digits[index--] = sum % 10;
            plus = sum / 10;
        } while (index >= 0 && plus > 0);
        if (plus == 0) {
            return digits;
        }
        int[] result = new int[len + 1];
        result[0] = 1;
        for (int i = 1; i < len + 1; i++) {
            result[i] = digits[i - 1];
        }
        return result;
    }
}
