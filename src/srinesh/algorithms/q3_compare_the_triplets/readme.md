# [Compare The Triplets](https://www.hackerrank.com/challenges/compare-the-triplets/problem)

```java
public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    var sumA = 0;
    var sumB = 0;

    for (int i = 0; i < a.size(); i++) {
        var valA = a.get(i);
        var valB = b.get(i);

        if(valA == valB)
            continue;

        if(valA > valB)
            sumA++;
            
        else
            sumB++;
    }

    return Arrays.asList(sumA, sumB);
}
```