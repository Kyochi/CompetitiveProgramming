package round979;

import java.util.*;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        List<Integer> winners = new ArrayList<>();
        long max = 0;
        for (int i = 0 ; i != 3 ; i++) {
            HashMap<Character, Long> map = new HashMap<>();
            String rib = in.next();
            for (int j = 0 ; j != rib.length() ; j++) {
                if (!map.containsKey(rib.charAt(j))) {
                    map.put(rib.charAt(j), new Long(1));
                }
                else map.put(rib.charAt(j), map.get(rib.charAt(j)).longValue() +1 );
            }
            long maxCol = 0;
            for (Map.Entry<Character,Long> en : map.entrySet()) {
                maxCol = Math.max(maxCol, en.getValue().longValue());
            }
            if (maxCol+n > max) {
                max = maxCol+n;
                winners = new ArrayList<>();
                winners.add(i);
            }
            else  if (maxCol+n == max) winners.add(i);
        }
        if (winners.size() > 1) {
            out.print("Draw");
        }
        else {
            switch (winners.get(0)) {
                case 0:
                    out.print("Kuro");
                    break;
                case 1:
                    out.print("Shiro");
                    break;
                case 2:
                    out.print("Katie");
                    break;
            }
        }

    }
}
