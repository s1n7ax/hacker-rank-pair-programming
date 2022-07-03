# [Apple and Orange](https://www.hackerrank.com/challenges/apple-and-orange/problem)

```java
public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples,
        List<Integer> oranges) {
    Predicate<Integer> isInHouseRange = (location) -> location >= s && location <= t;

    var appleCount = apples
            .stream()
            .parallel()
            .map(distanceFromA -> distanceFromA + a)
            .filter(isInHouseRange)
            .count();

    var orangesCount = oranges
            .stream()
            .parallel()
            .map(distanceFromB -> distanceFromB + b)
            .filter(isInHouseRange)
            .count();

    System.out.println(appleCount);
    System.out.println(orangesCount);
}
```
