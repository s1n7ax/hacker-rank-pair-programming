# [Counting Valleys](https://www.hackerrank.com/challenges/counting-valleys/problem)

## Rust

```rust
```

## Java

```java
public static int countingValleys(int steps, String path) {
    var stepList = path
        .chars()
        .map(c -> c == 'U'? 1 : -1)
        .boxed()
        .collect(Collectors.toList());

    var point = 0;
    var valleyCount = 0;

    for(int i: stepList){
        var prev_point = point;
        point += i;

        if(prev_point == 0 && point == -1) {
            valleyCount++;
        }
    }
    
    return valleyCount;
}
```
