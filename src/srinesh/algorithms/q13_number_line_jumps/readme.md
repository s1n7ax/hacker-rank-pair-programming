# [Number Line Jumps](https://www.hackerrank.com/challenges/kangaroo/problem)

```java
public static String kangaroo(int x1, int v1, int x2, int v2) {
    /*
     * Assume the number of jumps are "n"
     * x + (v * n) = distance
     * will return the distance of a kangaroo for a given number of "n"
     *
     * """You have to figure out a way to get both kangaroos at
     * the same location at the same time as part of the show."""
     *
     * So, for both kangaroos, the "n" & "distance" is equal.
     * Assuming the both kangaroos will meet at the same location, following
     * equation is true.
     *
     * x1 + (v1 * n) = x2 + (v2 * n) ------> subtract x2 from both side
     *
     * x1 - x2 + (v1 * n) = (v2 * n) ------> subtract (v1 * n) from both side
     *
     * x1 - x2 = n(v1 - v2)
     *
     * So, (x1 - x2) should be a multiplication of "n" times (v1 - v2),
     * meaning (x1 - x2) % (v1 - v2) == 0
     */
    var xdiff = (x1 - x2);
    var vdiff = (v2 - v1);

    /*
     * However, these values could be negative values
     * For example,
     * (1) xdiff = -4; vdiff = -1
     * (2) xdiff = -4; vdiff = 1
     * (3) xdiff = 4; vdiff = -1
     *
     * Here, the (1) is fine because
     * """
     * you are given two kangaroos on a number line ready to jumps
     * in the positive direction (i.e, toward positive infinity)
     * """
     * So,
     * xdiff == vdiff * n
     * -4 == -1 * 4 <---- a positive value
     *
     * But,
     * -4 == 1 * -4 <---- a negative value
     * 4 == -1 * -4 <---- a negative value
     *
     * Hens returning NO on different signs
     */
    if (Math.signum(xdiff) != Math.signum(vdiff))
        return "NO";

    return xdiff % vdiff == 0 ? "YES" : "NO";
}
```
