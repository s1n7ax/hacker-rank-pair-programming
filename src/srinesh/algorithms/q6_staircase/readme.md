# [Staircase](https://www.hackerrank.com/challenges/staircase/problem)

```java
public static void staircase(int n) {
    for (int i = 0; i < n; i++) {
        var str = "#".repeat(i + 1);
        var template = String.format("%%%ds\n", n);
        System.out.printf(template, str);
    }
}
```