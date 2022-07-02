import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        var pattern = Pattern.compile("^(\\d+):(\\d+):(\\d+)(\\w+)$");
        var matcher = pattern.matcher(s);

        if (matcher.find()) {
            var hour = Integer.valueOf(matcher.group(1));
            var min = Integer.valueOf(matcher.group(2));
            var sec = Integer.valueOf(matcher.group(3));
            var amPm = matcher.group(4);

            if (amPm.equals("PM"))
                if (hour != 12)
                    hour = 12 + hour;

            if (amPm.equals("AM"))
                if (hour == 12)
                    hour = 0;

            return String.format("%02d:%02d:%02d", hour, min, sec);
        }

        throw new RuntimeException("Something went wrong");
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
