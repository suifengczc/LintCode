package easy;

public class _002_TrailingZeros {

    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long count = 0;
        while(n!=0){
            count += n/5;
            n = n/5;
        }
        return count;
    }
}
