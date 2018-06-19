package codeforces489;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        Map<Integer, Integer> map = new HashMap();
        int n = in.nextInt();
        int m = 0;
        for (int i = 0 ; i != n; i++) {
            int num = in.nextInt();
            if (!map.containsKey(num) && num != 0) {
                map.put(num,num);
                m++;
            }
        }
        out.print(m);
    }
}
