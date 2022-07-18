# [Subarray Division](https://www.hackerrank.com/challenges/the-birthday-bar/problem)

```java
public static int birthday(List<Integer> s, int d, int m) {
    var size = s.size();

    return (int) IntStream
            .range(0, size)
            .takeWhile(index -> index + m <= size)
            .boxed()
            .map((index) -> {
                return s
                        .subList(index, index + m)
                        .stream()
                        .reduce(0, (acc, v) -> acc + v);
            })
            .map(i -> {
                return i;
            })
            .filter((i) -> i == d)
            .count();

}
```
