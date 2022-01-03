public class StringSplit {

    public static String[] solution(String s) {

        if (s.length() % 2 == 1) {
            s += "_";
        }

        String [] arr = new String[s.length() / 2];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = s.substring(i * 2, (i * 2) + 2);
        }

        return arr;
    }
}
