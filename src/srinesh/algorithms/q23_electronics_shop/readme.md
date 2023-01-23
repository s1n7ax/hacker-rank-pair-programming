# [Electronics Shop](https://www.hackerrank.com/challenges/electronics-shop/problem)

## Rust

```rust
```

## Java

```java
static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    return Arrays
        .stream(keyboards)
        .flatMap(
            k -> Arrays
                .stream(drives)
                .map(d -> (k + d) > b ? -1 : (k + d))
                
        )
        .max()
        .orElse(-1);
}
```
