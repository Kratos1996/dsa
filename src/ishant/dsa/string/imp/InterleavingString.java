package ishant.dsa.string.imp;

public class InterleavingString {
    static String s3 = "aadbbcbcac";
   // static String s3 = "aadbbbaccc";

   static int s3FinalPostion=0;
    static int s1FinalPostion=0;
    static int s2FinalPostion=0;
    static boolean  isIWorking =true;
    public static void main(String[] args) {
       // String s1 = "aabcc";
        String s1 = "aabcc";
        String s2 = "dbbca";
       // String s2 = "dbbca";
        System.out.println(isInterleave(s1,s2,s3));

    }
    public static boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length())
            return false;
        return helper(s1, s2, s3, 0, 0,new Boolean[s1.length()+1][s2.length()+1]);
    }

    public static boolean helper(String s1, String s2, String s3, int i, int j,Boolean [] [] dp) {
        if(i+j == s3.length()){
            dp[i][j]=true;
            return true;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }

        if(i < s1.length() && s3.charAt(i+j) == s1.charAt(i)) {
            boolean flag = helper(s1, s2, s3, i+1, j,dp);
            dp[i][j]=flag;
            if(flag){
                return true;
            }
        }

        if(j < s2.length() && s3.charAt(i+j) == s2.charAt(j)) {
            boolean flag = helper(s1, s2, s3, i, j+1,dp);
            dp[i][j]=flag;
            if(flag){
                return true;
            }

        }
        dp[i][j]=false;
        return false;
    }
}