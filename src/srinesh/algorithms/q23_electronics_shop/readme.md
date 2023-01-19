# [Electronics Shop](https://www.hackerrank.com/challenges/electronics-shop/problem)

## Rust

```rust
```

## Java

```java
static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    int maxTot = -1;
    
    for(int keyboardPrice: keyboards) {
        for(int drivePrice: drives) {
            int tot = keyboardPrice + drivePrice;
            if (maxTot < tot && tot <= b) {
                maxTot = tot;
            }
        }
    }
    
    return maxTot;
}
```
