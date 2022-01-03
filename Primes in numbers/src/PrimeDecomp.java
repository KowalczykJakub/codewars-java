public class PrimeDecomp {

    public static String factors(int n) {

        int counter;
        String str = "";

        for (int i = 2; i <= n; i++) {

            counter = 0;

            while (n % i == 0) {

                n /= i;
                counter++;
            }

            if (counter > 1) {

                str += ("(" + i + "**" + counter + ")");

            } else if (counter == 1) {

                str += ("(" + i + ")");
            }
        }
        return str;
    }
}
