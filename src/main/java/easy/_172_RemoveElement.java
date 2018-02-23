package easy;

public class _172_RemoveElement {
    /*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public static int removeElement(int[] A, int elem) {
        // write your code here
        int index = 0;
        int sameCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != elem) {
                A[index++] = A[i];
            } else {
                sameCount++;
            }
        }
        return A.length-sameCount;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(removeElement(a, 5));
    }
}
