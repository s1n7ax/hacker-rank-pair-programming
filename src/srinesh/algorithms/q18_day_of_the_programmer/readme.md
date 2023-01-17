# [Day of the Programmer](https://www.hackerrank.com/challenges/day-of-the-programmer/problem)

## Rust

```rust
fn is_leap(year: i32) -> bool {
    if year < 1918 { year % 4 == 0 }
    else { year % 400 == 0 || year % 4 == 0 && year % 100 != 0 }
}

fn dayOfProgrammer(year: i32) -> String {
    if year == 1918 { return "26.09.1918".to_string(); };

    if is_leap(year) {
        format!("12.09.{}", year)
    } else {
        format!("13.09.{}", year)
    }
}
```

## Java

```java
public static boolean isLeap(int year) {
    if (year < 1918) { return year % 4 == 0; }
    else { return year % 400 == 0 || year % 4 == 0 && year % 100 != 0; }
}

public static String dayOfProgrammer(int year) {
    if (year == 1918) return  "26.09.1918";
    return String.format((isLeap(year) ? "12.09.%s" : "13.09.%s"), year);
}
```
