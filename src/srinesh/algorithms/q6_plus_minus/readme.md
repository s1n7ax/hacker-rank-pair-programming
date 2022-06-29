# [Plus Minus](https://www.hackerrank.com/challenges/plus-minus/problem)

```java
public static void plusMinus(List<Integer> arr) {
    var size = arr.size();
    var posCount = 0;
    var negCount = 0;
    var zeroCount = 0;

    for (Integer val : arr) {
        if(val > 0) posCount++;
        else if(val < 0) negCount++;
        else zeroCount++;
    }

    System.out.println(String.format("%.6f", (float)posCount / size));
    System.out.println(String.format("%.6f", (float)negCount / size));
    System.out.println(String.format("%.6f", (float)zeroCount / size));
}
```