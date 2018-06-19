package BattleCode;

import java.util.Scanner;
import java.io.PrintWriter;

public class Tramway {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[][] mat = new int[n][n];
        int[][] dp = new int[n][n];
        for (int i = 0 ; i != n; i++) {
            for (int j = 0 ; j != n; j++) {
                mat[i][j] = in.nextInt();
            }
        }

        for (int i = 1 ; i != n; i++) {
            for (int j = 0 ; j < i; j++) {
                int m = dp[j][i-1];
                for(int k=j; k<i; ++k){
                    int x=mat[k][i];
                    if(j<k-1)
                        x += dp[j][k-1];
                    if(k+1<i-1)
                        x += dp[k+1][i-1];
                    m = x>m?x:m;
                }
                dp[j][i] = m;
            }
        }
        out.print(dp[0][n-1]);
    }
}
