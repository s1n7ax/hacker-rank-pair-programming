# [Save the Prisoner!](https://www.hackerrank.com/challenges/save-the-prisoner/problem)

## Rust

```rust
fn saveThePrisoner(prisoners: i32, candies: i32, start_pos: i32) -> i32 {
    let  value = ((start_pos - 1) + candies) % prisoners;
    if value == 0 { prisoners } else { value }
}
```
