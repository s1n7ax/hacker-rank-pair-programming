# [Between Two Sets](https://www.hackerrank.com/challenges/between-two-sets/problem)

```java
public static int getTotalX(List<Integer> a, List<Integer> b) {
    /*
     * The question is, assume there is a number "x".
     * (1) All elements in the first array should be a factor of "x"
     * ex:
     * first_arr = [2, 4]
     *
     * IF x is 6
     * - 6 % 2 == 0 <- TRUE
     * - 6 % 4 == 0 <- FALSE
     *
     * So, 6 shouldn't be a valid answer
     *
     * IF x is 4
     * - 4 % 2 == 0 <- TRUE
     * - 4 % 4 == 0 <- TRUE
     *
     * So, 8 could be a possible answer
     *
     * (2) "x" should be a factor of all elements in the second array
     *
     * second_arr = [24, 36]
     *
     * IF x is 4
     *
     * 24 % 4 == 0 <- TRUE
     * 36 % 4 == 0 <- TRUE
     * 
     * So, 4 is one of the value of the final count
     */

    var maxA = Collections.max(a);
    var maxB = Collections.min(b);

    return (int) Stream
            .iterate(maxA, acc -> acc + maxA)
            .takeWhile(i -> i <= maxB)
            .parallel()
            .filter(i -> a.stream().parallel().allMatch(ele -> i % ele == 0))
            .filter(i -> b.stream().parallel().allMatch(ele -> ele % i == 0))
            .count();
}
```
