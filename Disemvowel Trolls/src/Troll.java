public class Troll {

    public static String disemvowel(String str) {

        String result = "";
        result = str.replaceAll("(?i)([aeiou])", "");

        return result;
    }
}
