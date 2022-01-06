import java.util.HashSet;
import java.util.Set;

public class Interval {

    public static int sumIntervals(int[][] intervals) {

        if (intervals == null)
            return 0;

        Set<Integer> set = new HashSet<>();

        for (int[] interval : intervals) {

            for (int i = interval[0]; i < interval[1]; i++) {

                set.add(i);
            }
        }
        return set.size();
    }
}

