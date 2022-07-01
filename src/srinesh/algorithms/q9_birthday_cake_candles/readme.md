# [Birthday Cake Candles](https://www.hackerrank.com/challenges/birthday-cake-candles/problem)

```java
public static int birthdayCakeCandles(List<Integer> candles) {
    var max = 0;
    var count = 0;

    for (int candle : candles) {
        if (candle > max) {
            max = candle;
            count = 1;
        } else if (candle == max) {
            count++;
        }
    }

    return count;
}
```