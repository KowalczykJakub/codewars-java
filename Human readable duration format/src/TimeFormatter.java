import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {

    public static String formatDuration(int seconds) {

        if (seconds == 0)
            return "now";

        StringBuilder sb = new StringBuilder();
        List<Integer> al = new ArrayList<>();
        String [] str = {" year", " day", " hour", " minute", " second"};

        al.add(seconds / (60 * 60 * 24 * 365));
        al.add((seconds % (60 * 60 * 24 * 365)) / (60 * 60 * 24));
        al.add((seconds % (60 * 60 * 24)) / (60 * 60));
        al.add((seconds % (60 * 60)) / 60);
        al.add(seconds % 60);

        int numberOfVariablesLeft = (int) al.stream().filter(x -> x != 0).count();

        for (int i = 0; i < al.size(); i++) {

            if (al.get(i) > 0) {

                sb.append(al.get(i));
                sb.append(str[i]);

                numberOfVariablesLeft--;

                if (al.get(i) > 1)
                    sb.append("s");

                if (numberOfVariablesLeft == 1)
                    sb.append(" and ");

                if (numberOfVariablesLeft > 1)
                    sb.append(", ");
            }
        }
        return sb.toString();
    }
}
