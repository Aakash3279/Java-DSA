public class StringConversion {
    public static void String_Conversion(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];

        for(int i = 1;i<n+1;i++){
            for(int j = 1;j<m+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }
        int lcs = dp[n][m];

        int deletions = n - lcs;
        int insertions = m - lcs;

        System.out.println("Number of deletions = " + deletions);
        System.out.println("Number of insertions = " + insertions);

    }
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "aceg";
        String_Conversion(str1,str2);
    }
}
