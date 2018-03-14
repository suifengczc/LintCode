package easy;

public class _420_CountAndSay {
    /**
     * @param n: the nth
     * @return: the nth sequence
     */
    public static String countAndSay(int n) {
        // write your code here
        StringBuffer sb = new StringBuffer();
        String lastString = "1";
        int index = 2;
        while (index <= n) {
            int len = lastString.length();
            int count = 1;
            if (len > 1) {
                for (int i = 0; i < len - 1; i++) {
                    if (lastString.charAt(i) == lastString.charAt(i + 1)) {
                        count++;
                        if (i == len - 2) {
                            sb.append(count);
                            sb.append(lastString.charAt(i));
                        }
                    } else {
                        sb.append(count);
                        sb.append(lastString.charAt(i));
                        count = 1;
                    }
                }
            } else {
                sb.append(1);
                sb.append(lastString.charAt(0));
            }
            lastString = sb.toString();
            sb.delete(0, sb.length());
            index++;
        }
        return lastString;
    }

    public static void main(String[] args) {
        int a = 3;
        System.out.println(countAndSay(a));
    }
}
