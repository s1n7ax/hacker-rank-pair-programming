# [Designer PDF Viewer](https://www.hackerrank.com/challenges/designer-pdf-viewer/problem)

## Rust

```rust
fn angryProfessor(k: i32, a: &[i32]) -> String {
    let count = a
        .into_iter()
        .filter(|&time| {time <= &0})
        .count();

    if (count as i32) >= k {"NO".to_string()} else {"YES".to_string()}
}
```
