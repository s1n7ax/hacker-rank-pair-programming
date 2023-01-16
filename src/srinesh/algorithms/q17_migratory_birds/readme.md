# [Migratory Birds](https://www.hackerrank.com/challenges/migratory-birds/problem)

```rust
fn migratoryBirds(arr: &[i32]) -> i32 {
    arr.iter()
        .fold(HashMap::<i32, i32>::new(), |mut acc, &v| {
            *acc.entry(v).or_default() += 1;
            acc
        })
        .into_iter()
        .max_by(|e1, e2| {
            if e1.1 > e2.1 {
                Greater
            } else if e1.1 < e2.1 {
                Less
            } else if e1.0 < e2.0 {
                Greater
            } else {
                Less
            }
        })
        .expect("")
        .0
}
```

```java
public static int migratoryBirds(List<Integer> arr) {
    return arr
        .stream()
        .collect(Collectors.groupingBy(k -> k, Collectors.counting()))
        .entrySet()
        .stream()
        .sorted((e1, e2) -> {
            if(e1.getValue() < e2.getValue()) {
                return 1;
            } else if(e1.getValue() > e2.getValue()) {
                return -1;
            }

            return e1.getKey() < e2.getKey() ? -1 : 1;
        })
        .findFirst()
        .get()
        .getKey();}
```
