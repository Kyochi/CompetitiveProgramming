package codeforces482;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        long flor = in.nextLong();
        long bee = in.nextLong();
        ArrayList<ArrayList<Long>> adj = new ArrayList<>((int)n+1);
        for (int i = 0 ; i != n+1; i++) adj.add(new ArrayList<>());

        for (int i = 0 ; i != n-1 ; i++) {
            long from = in.nextLong();
            long to = in.nextLong();
            adj.get((int)from).add(to);
            adj.get((int)to).add(from);
        }
        out.print("ok");
    }
    public void dfs(ArrayList<ArrayList<Long>> adj, long from, long to, boolean isFlor) {

    }
}
