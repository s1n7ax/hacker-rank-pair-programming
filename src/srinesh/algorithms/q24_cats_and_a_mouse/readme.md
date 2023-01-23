# [Electronics Shop](https://www.hackerrank.com/challenges/electronics-shop/problem)

## Rust

```rust
```

## Java

```java
static String catAndMouse(int x, int y, int z) {
    int catADistance = Math.abs(z - x);
    int catBDistances = Math.abs(z - y);
    
    if(catADistance == catBDistances) {
        return "Mouse C";
    } else if(catADistance < catBDistances) {
        return "Cat A";
    } else {
        return "Cat B";
    }
}
```
