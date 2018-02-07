package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition of Interval:
 * public classs Interval {
 * int start, end;
 * Interval(int start, int end) {
 * this.start = start;
 * this.end = end;
 * }
 */

public class _030_InsertInterval {
    /*
     * @param intervals: Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>();
        if(intervals.size() == 0){
            result.add(newInterval);
            return result;
        }
        int idx = 0;
        while (idx < intervals.size() && intervals.get(idx).start < newInterval.start) {
            idx++;
        }
        intervals.add(idx, newInterval);
        Interval last = intervals.get(0);
        result.add(last);
        for (int i = 1; i < intervals.size(); i++) {
            Interval it = intervals.get(i);
            if (last.end < it.start) {
                result.add(it);
                last = it;
            }else{
                last.end = Math.max(last.end, it.end);
            }
        }
        return result;
    }

    static class Interval {
        int start, end;
        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        List<Interval> a = new ArrayList<>();
        a.add(new Interval(1, 5));
        a.add(new Interval(8, 9));
        insert(a, new Interval(2, 3));
    }
}
