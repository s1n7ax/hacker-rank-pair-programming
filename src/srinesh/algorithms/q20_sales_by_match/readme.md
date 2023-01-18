# [Sales by Match](https://www.hackerrank.com/challenges/sock-merchant/problem)

## Rust

```rust
fn sockMerchant(n: i32, ar: &[i32]) -> i32 {
    ar
        .iter()
        .fold(HashMap::<i32, i32>::new(), |mut map, &ele| {
            *map.entry(ele).or_default() += 1;
            map
        })
        .into_iter()
        .map(|(_, v)| v / 2)
        .sum()
}
```

## Java

```java
public static int sockMerchant(int n, List<Integer> ar) {
    return ar
        .stream()
        .collect(Collectors.groupingBy(k -> k, Collectors.counting()))
        .entrySet()
        .stream()
        .map(e -> e.getValue().intValue() / 2)
        .mapToInt(Integer::intValue)
        .sum();
}
```
