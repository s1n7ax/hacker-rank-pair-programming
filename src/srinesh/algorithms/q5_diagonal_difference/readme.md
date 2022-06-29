# [Diagonal Difference](https://www.hackerrank.com/challenges/diagonal-difference/problem)

```java
public static int diagonalDifference(List<List<Integer>> arr) {
    var d1 = 0;
    var d2 = 0;
    var size = arr.size();

    for (int i = 0; i < size; i++) {
        d1 += arr.get(i).get(i);
        d2 += arr.get(size - 1 - i).get(i);
    }

    return d1 > d2? d1 - d2: d1 < d2? d2 - d1: 0;
}
```
