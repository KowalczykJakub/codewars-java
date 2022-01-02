public class Maskify {

    public static String maskify(String str) {

        if (str.length() <= 4) {
            return str;
        }

        String string = "";

        for (int i = 0; i < str.length() - 4; i++) {

            string += "#";
        }

        return string + str.substring(str.length() - 4);

    }
}
