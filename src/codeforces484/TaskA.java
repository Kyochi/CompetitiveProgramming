package codeforces484;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String s = in.next();
        if (s.equals("0")) {
            out.print("No");
        } else if (s.contains("11")) {
            out.print("No");
        } else if (s.contains("000")) {
            out.print("No");
        }
        else if (s.startsWith("00") || s.endsWith("00")) {
            out.print("No");
        }
        else {
            out.print("Yes");
        }
    }
}
