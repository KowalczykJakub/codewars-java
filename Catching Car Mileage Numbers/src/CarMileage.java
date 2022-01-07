import java.util.regex.Pattern;

public class CarMileage {

    public static boolean isFollowedByAllZeros(int number) {

        return Pattern.matches("[1-9]0+", String.valueOf(number));
    }

    public static boolean isEveryDigitIsTheSame(int number) {

        int digit = number % 10;

        while (number > 0) {

            if (number % 10 != digit)
                return false;

            number = number / 10;
        }

        return true;
    }

    public static boolean isSequenticalIncrementing(int number) {

        String pattern = "1234567890";

        return pattern.contains(String.valueOf(number));
    }

    public static boolean isSequenticalDecrementing(int number) {

        String pattern = "9876543210";

        return pattern.contains(String.valueOf(number));
    }

    public static boolean isPalindrome(int number) {

        return String.valueOf(number).equals(new StringBuilder(String.valueOf(number)).reverse().toString());
    }

    private static boolean isAwesomePhrase(int number, int[] awesomePhrases) {

        for (int awesomePhrase : awesomePhrases) {

            if (number == awesomePhrase) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAnyRuleCorrect(int number, int[] awesomePhrases) {

        return isFollowedByAllZeros(number) ||
                isEveryDigitIsTheSame(number) ||
                isSequenticalIncrementing(number) ||
                isSequenticalDecrementing(number) ||
                isPalindrome(number) ||
                isAwesomePhrase(number, awesomePhrases);
    }

    // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

    public static int isInteresting(int number, int[] awesomePhrases) {

        if (number < 98)
            return 0;

        if (number > 99 && isAnyRuleCorrect(number, awesomePhrases))
            return 2;

        if (isAnyRuleCorrect(number + 1, awesomePhrases) ||
                isAnyRuleCorrect(number + 2, awesomePhrases)) {

            return 1;
        }

        return 0;
    }
}
