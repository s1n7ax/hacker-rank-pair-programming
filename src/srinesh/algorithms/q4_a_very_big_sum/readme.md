# [A Very Big Sum](https://www.hackerrank.com/challenges/a-very-big-sum/problem)

```java
public static long aVeryBigSum(List<Long> ar) {
    return ar.stream().parallel().reduce(0L, (acc, v) -> acc + v);
}
```
