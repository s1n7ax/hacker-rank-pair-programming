# [Picking Numbers](https://www.hackerrank.com/challenges/picking-numbers/problem)

## Rust

```rust
```

## Java

```java
public static int pickingNumbers(List<Integer> a) {
    // my girlfriend told me not to sort the list :-/
    var set = new HashSet<>(a);
    var max = 0;
    for(int i: set) {
        int currMax = 0;
        int currLowCount = 0;
        int currPlusCount = 0;
        for(int j: a) {
            if(j - i == 0 || j - i == -1) {
                currLowCount += 1;
            } 
            
            if (j - i == 0 || j - i == 1) {
                currPlusCount += 1;
            }
        }
        
        currMax = Math.max(currLowCount, currPlusCount);
        max = Math.max(currMax, max);
    }
    
    return max;
}
```
