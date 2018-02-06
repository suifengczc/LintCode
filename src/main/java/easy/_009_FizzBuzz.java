package easy;

import java.util.ArrayList;
import java.util.List;

public class _009_FizzBuzz {
    public List<String> fizzBuzz(int n) {
        // write your code here
        List<String> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                a.add("fizz buzz");
            } else if (i % 3 == 0) {
                a.add("fizz");
            } else if (i % 5 == 0) {
                a.add("buzz");
            } else {
                a.add(i + "");
            }
        }
        return a;
    }
}
