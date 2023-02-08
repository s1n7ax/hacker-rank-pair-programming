# [Climbing the Leaderboard](https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem)

## Java

```java
public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    int ri = 0;
    int pi = player.size() - 1;

    var playerRanks = Arrays.asList(new Integer[player.size()]);
    var prevScore = ranked.get(0);
    var currRank = 1;

    for(; pi > -1; pi--) {
        for(; ri < ranked.size() && player.get(pi) < ranked.get(ri); ri++) {
            if(prevScore > ranked.get(ri)) currRank++;

            prevScore = ranked.get(ri);
        }

        if(ri == 0) {
            playerRanks.set(pi, currRank);
        } else {
            playerRanks.set(pi, currRank + 1);
        }
    }

    return playerRanks;
}
```
