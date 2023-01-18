# [Bill Division](https://www.hackerrank.com/challenges/bon-appetit/problem)

## Rust

```rust
fn bonAppetit(bill: &[i32], k: i32, b: i32) {
    let split_tot: i32 = bill
    .iter()
    .enumerate()
    .filter(|(i, &v)| if *i == k as usize { false } else { true })
    .map(|(_i, &v)| v)
    .sum();

    let half = split_tot / 2;

    if half == b { print!("Bon Appetit"); }
    else { print!("{}", b - half) };
}
```

## Java

```java
```
