package easy;

public class _128_HashFunction {
    /*
     * @param key: A string you should hash
     * @param HASH_SIZE: An integer
     * @return: An integer
     */
    public static int hashCode(char[] key, int HASH_SIZE) {
        // write your code here
        long result = 0L;
        for (int i = 0; i < key.length; i++) {
            result = (result * 33 + key[i]) % HASH_SIZE;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        String a = "abcd";
        hashCode(a.toCharArray(), 100);
    }
}
