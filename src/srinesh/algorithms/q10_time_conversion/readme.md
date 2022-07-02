# [Time Conversion](https://www.hackerrank.com/challenges/time-conversion/problem)

```java
public static String timeConversion(String s) {
    var time = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa"));
    return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
}
```
