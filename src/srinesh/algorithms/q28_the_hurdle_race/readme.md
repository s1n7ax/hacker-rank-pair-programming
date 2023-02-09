# [The Hurdle Race](https://www.hackerrank.com/challenges/the-hurdle-race/problem)

## Java

```java
public static int hurdleRace(int k, List<Integer> height) {     
    var max = Collections.max(height);
    return k >= max ? 0 : max - k;
}
```
