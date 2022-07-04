# [Apple and Orange](https://www.hackerrank.com/challenges/apple-and-orange/problem)

```java
public static List<Integer> gradingStudents(List<Integer> grades) {
    return grades
            .stream()
            .parallel()
            .map((grade) -> {
                if (grade < 38)
                    return grade;

                var nextMulOf5 = ((grade / 5) + 1) * 5;

                if (nextMulOf5 - grade < 3)
                    return nextMulOf5;

                return grade;
            })
            .collect(Collectors.toList());
}
```
