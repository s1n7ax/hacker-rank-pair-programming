import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        var sorted = arr
                .stream()
                .parallel()
                .sorted()
                .collect(Collectors.toList());

        long min = sorted
                .stream()
                .parallel()
                .limit(4)
                .collect(Collectors.summingLong(Integer::intValue));

        long max = sorted
                .stream()
                .parallel()
                .skip(1)
                .collect(Collectors.summingLong(Integer::intValue));

        System.out.printf("%s %s", min, max);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
