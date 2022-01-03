public class Max {

    public static int sequence(int[] arr) {

        int sum = 0;
        int resultSum = 0;

        for (int i : arr) {
            sum = Math.max(0, sum + i);
            resultSum = Math.max(sum, resultSum);
        }

        return resultSum;
    }
}
