package easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _156_MergeIntervals {

    public static class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    /*
     * @param intervals: interval list.
     * @return: A new interval list.
     */
    public static List<Interval> merge(List<Interval> intervals) {
        // write your code here
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }
        /*
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });
     */
        intervals.sort(Comparator.comparing(i -> i.start));//先按照start将intervals排序，1.8使用lambda表达式
        List<Interval> result = new ArrayList<>();
        Interval last = intervals.get(0);
        result.add(last);
        for (Interval it : intervals) {
            if (last.end < it.start) {
                result.add(it);
                last = it;
            } else {
                last.end = Math.max(last.end, it.end);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Interval> a = new ArrayList<>();
        a.add(new Interval(2, 3));
        a.add(new Interval(4, 5));
        a.add(new Interval(6, 7));
        a.add(new Interval(8, 9));
        a.add(new Interval(1, 10));
        merge(a);

    }
}
