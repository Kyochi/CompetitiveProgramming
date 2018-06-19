package codeforces489;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long mod = 1000000007;
        long m = in.nextLong()%mod;
        long k = in.nextLong()+1;
        double min = (m*2)-1;
        double max = m*2;
        if (k<2) {
            out.print(m*2);
        }
        else {
            k--;
            double esp = min*0.5+max*0.5;
            while (k!=1) {
                min = ((esp*2)%mod)-1;
                max = ((esp*2)%mod);
                esp = min*0.5+max*0.5;
                k--;
            }
            double res = (esp*2)%mod;
            out.print((long)res);
        }
    }
}
