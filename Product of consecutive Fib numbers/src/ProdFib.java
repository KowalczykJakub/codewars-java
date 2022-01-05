public class ProdFib {

    public static long[] productFib(long prod) {

        long prev = 0;
        long curr = 1;
        long [] arr = new long[3];

        while (prev * curr <= prod) {

            if (prev * curr == prod) {

                arr[0] = prev;
                arr[1] = curr;
                arr[2] = 1;

                return arr;
            }

            curr = prev + curr;
            prev = curr - prev;
        }

        arr[0] = prev;
        arr[1] = curr;
        arr[2] = 0;

        return arr;
    }
}
