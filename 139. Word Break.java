import java.util.List;

class Solution {
    public boolean wordBreak(String str, List<String> wordDict) {
        boolean[] dp = new boolean[str.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(str.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[str.length()];
    }
}
