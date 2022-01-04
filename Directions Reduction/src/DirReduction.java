import java.util.Arrays;

public class DirReduction {

    public static String[] dirReduc(String[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if ((arr[i].equals("NORTH") && arr[i + 1].equals("SOUTH")) ||
                    (arr[i].equals("SOUTH") && arr[i + 1].equals("NORTH")) ||
                    (arr[i].equals("WEST") && arr[i + 1].equals("EAST")) ||
                    (arr[i].equals("EAST") && arr[i + 1].equals("WEST"))) {

                arr[i] = "";
                arr[i + 1] = "";
            }
        }

        String [] resultArr = Arrays.stream(arr)
                .filter(e -> !e.equals(""))
                .toArray(String[]::new);

        if (resultArr.length == arr.length)
            return resultArr;

        return dirReduc(resultArr);
    }
}