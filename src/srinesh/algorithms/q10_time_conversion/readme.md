# [Time Conversion](https://www.hackerrank.com/challenges/time-conversion/problem)

## Solution 1:

```java
public static String timeConversion(String s) {
    var time = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa"));
    return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
}
```

## Solution 2

```java
public static String timeConversion(String s) {
    var pattern = Pattern.compile("^(\\d+):(\\d+):(\\d+)(\\w+)$");
    var matcher = pattern.matcher(s);

    if (matcher.find()) {
        var hour = Integer.valueOf(matcher.group(1));
        var min = Integer.valueOf(matcher.group(2));
        var sec = Integer.valueOf(matcher.group(3));
        var amPm = matcher.group(4);

        if (amPm.equals("PM"))
            if (hour != 12)
                hour = 12 + hour;

        if (amPm.equals("AM"))
            if (hour == 12)
                hour = 0;

        return String.format("%02d:%02d:%02d", hour, min, sec);
    }

    throw new RuntimeException("Something went wrong");
}
```
