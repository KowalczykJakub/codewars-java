public class RailFenceCipher {

//    "WEAREDISCOVEREDFLEEATONCE", 3

//    W       E       C       R       L       T       E
//      E   R   D   S   O   E   E   F   E   A   O   C
//        A       I       V       D       E       N

//    "WECRLTEERDSOEEFEAOCAIVDEN"

    static String encode(String s, int n) {

        if (s.isEmpty())
            return "";

        char [][] arr = new char[n][s.length()];
        int additionalValue = -1;
        int verticalIndex = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            arr[verticalIndex][i] = s.charAt(i);

            if (verticalIndex == n - 1 || verticalIndex == 0)
                additionalValue *= -1;

            verticalIndex += additionalValue;
        }

        for (char[] chars : arr) {

            for (char c : chars) {

                if ((int) c != 0)
                    sb.append(c);
            }
        }

        return sb.toString();
    }

    static String decode(String s, int n) {

        if (s.isEmpty())
            return "";

        char [][] arr = new char[n][s.length()];
        int additionalValue = -1;
        int verticalIndex = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            arr[verticalIndex][i] = '@';

            if (verticalIndex == n - 1 || verticalIndex == 0)
                additionalValue *= -1;

            verticalIndex += additionalValue;
        }

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == '@') {

                    arr[i][j] = s.charAt(index);
                    index++;
                }
            }
        }

        additionalValue = -1;
        verticalIndex = 0;

        for (int i = 0; i < s.length(); i++) {

            sb.append(arr[verticalIndex][i]);

            if (verticalIndex == n - 1 || verticalIndex == 0)
                additionalValue *= -1;

            verticalIndex += additionalValue;
        }

        return sb.toString();
    }
}
