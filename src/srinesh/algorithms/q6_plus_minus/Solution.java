package srinesh.algorithms.q6_plus_minus;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        var size = arr.size();
        var posCount = 0;
        var negCount = 0;
        var zeroCount = 0;

        for (Integer val : arr) {
            if (val > 0)
                posCount++;
            else if (val < 0)
                negCount++;
            else
                zeroCount++;
        }

        System.out.println(String.format("%.6f", (float) posCount / size));
        System.out.println(String.format("%.6f", (float) negCount / size));
        System.out.println(String.format("%.6f", (float) zeroCount / size));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
