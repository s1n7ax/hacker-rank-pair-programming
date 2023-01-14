# [Migratory Birds](https://www.hackerrank.com/challenges/migratory-birds/problem)

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
