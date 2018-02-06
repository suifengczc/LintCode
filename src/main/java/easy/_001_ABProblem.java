package easy;

public class _001_ABProblem {

    public int aplusb(int a, int b) {
        while (b!=0){
            int c = a^b;
            int d = (a&b)<<1;
            a = c;
            b = d;
        }
        return a;
    }
}
