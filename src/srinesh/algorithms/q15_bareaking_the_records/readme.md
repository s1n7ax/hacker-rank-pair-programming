# [Breaking the Records](https://www.hackerrank.com/challenges/between-two-sets/problemhttps://www.hackerrank.com/challenges/between-two-sets/problemhttps://www.hackerrank.com/challenges/between-two-sets/problemhttps://www.hackerrank.com/challenges/between-two-sets/problem)

```java
public static List<Integer> breakingRecords(List<Integer> scores) {
    var mostPointCount = 0;
    var leastPointCount = 0;
    var mostPoints = scores.get(0);
    var leastPoints = mostPoints;

    for (var score : scores) {
        if (score < leastPoints) {
            leastPointCount++;
            leastPoints = score;
        }

        if (score > mostPoints) {
            mostPointCount++;
            mostPoints = score;
        }
    }

    return Arrays.asList(mostPointCount, leastPointCount);
}
```
