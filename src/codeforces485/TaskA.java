package codeforces485;

import java.util.*;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        Map<String, String> map2 = new HashMap<>();
        map2.put("Power", "");
        map2.put("Time", "");
        map2.put("Space", "");
        map2.put("Soul", "");
        map2.put("Reality", "");
        map2.put("Mind", "");
        int a = in.nextInt();
        if (a != 0) {
            while (in.hasNext()) {
                String s = in.next();
                if (s.equals("red")) map2.put("Reality", "Reality");
                else if (s.equals("purple")) map2.put("Power", "Power");
                else if (s.equals("green")) map2.put("Time", "Time");
                else if (s.equals("blue")) map2.put("Space", "Space");
                else if (s.equals("orange")) map2.put("Soul", "Soul");
                else if (s.equals("yellow")) map2.put("Mind", "Mind");
            }
        }
        List<String> li = new ArrayList<>();
        for (Map.Entry<String, String> en : map2.entrySet()) {
            if (en.getValue().equals("")) li.add(en.getKey());
        }
        out.println(li.size());
        for (String str : li) {
            out.println(str);
        }
    }
}
