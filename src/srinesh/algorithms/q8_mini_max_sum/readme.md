# [Mini-Max Sum](https://www.hackerrank.com/challenges/mini-max-sum/problem)

```java
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
```