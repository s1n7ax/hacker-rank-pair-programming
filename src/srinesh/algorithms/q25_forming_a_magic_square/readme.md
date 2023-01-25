# [Forming a Magic Square](https://www.hackerrank.com/challenges/magic-square-forming/problem)

## Rust

```rust
```

## Java

```java
public static int formingMagicSquare(List<List<Integer>> s) {
    int[][][] validMatrices = {
            {
                    { 8, 1, 6 },
                    { 3, 5, 7 },
                    { 4, 9, 2 }
            },
            {
                    { 6, 1, 8 },
                    { 7, 5, 3 },
                    { 2, 9, 4 }
            },
            {
                    { 4, 3, 8 },
                    { 9, 5, 1 },
                    { 2, 7, 6 }
            },
            {
                    { 2, 7, 6 },
                    { 9, 5, 1 },
                    { 4, 3, 8 }
            },
            {
                    { 2, 9, 4 },
                    { 7, 5, 3 },
                    { 6, 1, 8 }
            },
            {
                    { 4, 9, 2 },
                    { 3, 5, 7 },
                    { 8, 1, 6 }
            },
            {
                    { 6, 7, 2 },
                    { 1, 5, 9 },
                    { 8, 3, 4 }
            },
            {
                    { 8, 3, 4 },
                    { 1, 5, 9 },
                    { 6, 7, 2 }
            }
    };

    int minCost = Integer.MAX_VALUE;

    for (int [][] vMatrix: validMatrices) {
        int currCost = 0;
        for(int x = 0; x < 3; x++) {
            for(int y = 0; y < 3; y++) {
                currCost += Math.abs(vMatrix[x][y] - s.get(x).get(y));
            }
        }

        if(minCost > currCost) {
            minCost = currCost;
        }
    }

    return minCost;
}
```
