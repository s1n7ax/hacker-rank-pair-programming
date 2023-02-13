# [Utopian Tree](https://www.hackerrank.com/challenges/utopian-tree/problem)

## Rust

```rust
(0..n + 1).fold(0, |acc, i| {
        if i % 2 == 0 {
            acc + 1
        } else {
            acc * 2
        }
    })
```
