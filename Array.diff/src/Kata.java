import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {

        Arrays.sort(b);
        List<Integer> al = new ArrayList<>();
        for (int i : a) {
            if (Arrays.binarySearch(b, i) < 0)
                al.add(i);
        }

        int [] result = new int[al.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = al.get(i);
        }

        return result;
    }

}
