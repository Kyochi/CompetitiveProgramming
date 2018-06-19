package codeforces484;

import java.util.*;
import java.io.PrintWriter;

public class TaskB {
    public class Row {
        public int num;
        public int pl = 0;
        public int weig = 0;
        public Row(int n, int w) { num = n; weig = w;}
    }
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        TreeMap<Row, Integer> tree = new TreeMap<>(Comparator.comparing((Row r)->r.pl).thenComparing(p->p.weig));

        for (int i = 0; i != n ; i++) {
            Row p = new Row(i+1, in.nextInt());
            tree.put(p, i+1);
        }
        String str = in.next();
        for (int i = 0 ; i != str.length() ; i++) {
            if (str.charAt(i) == '0') {
                Map.Entry<Row, Integer> r = tree.pollFirstEntry();
                Row p = r.getKey();
                p.pl += 1;
                out.print(p.num + " ");
                tree.put(p, p.num);
            }
            else {
                Map.Entry<Row, Integer> r = tree.pollLastEntry();
                Row p = r.getKey();
                p.pl += 1;
                out.print(p.num + " ");
                tree.put(p, p.num);
            }
        }
    }
}
