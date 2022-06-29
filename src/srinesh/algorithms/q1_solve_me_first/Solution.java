import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        var number1 = Integer.valueOf(bufferedReader.readLine());
        var number2 = Integer.valueOf(bufferedReader.readLine());

        System.out.println(number1 + number2);

        bufferedReader.close();
    }

}
