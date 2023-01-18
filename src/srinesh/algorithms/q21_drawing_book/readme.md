# [Drawing Book](https://www.hackerrank.com/challenges/drawing-book/problem)

## Rust

```rust
fn pageCount(n: i32, p: i32) -> i32 {
    let first_to_last = (p - p % 2) / 2;
    let last_to_first = ((n - p) + (p % 2)) / 2;
    
    cmp::min(first_to_last, last_to_first)
}
```

## Java

```java
public static int pageCount(int n, int p) {
    var first_to_last = (p - p % 2) / 2;
    var last_to_first = ((n - p) + p % 2) / 2;
    
    return Math.min(first_to_last, last_to_first);
}
```
