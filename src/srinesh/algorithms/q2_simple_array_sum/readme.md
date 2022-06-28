# [Simple Array Sum](https://www.hackerrank.com/challenges/simple-array-sum/problem)

```java
public static int simpleArraySum(List<Integer> ar) {
    return ar.stream().reduce(0, (acc, value) -> acc + value);
}
```