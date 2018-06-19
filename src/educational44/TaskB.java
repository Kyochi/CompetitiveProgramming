package educational44;

import java.math.BigInteger;
import java.util.BitSet;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] map = new int[m];
        boolean canBe = false;
        String[] mapStr = new String[n];
        int j = 0;
        while (in.hasNext()) {
            mapStr[j] = in.next();
            for (int i = 0; i != m; i++) {
                if (mapStr[j].charAt(i) == '1') {
                    map[i]++;
                }
            }
            j++;

        }
        for (int a = 0; a != n; a++) {
            boolean everyLampsOfThisSwitchAreUseless = true;
            for (int k = 0; k != m; k++) {
                if ((mapStr[a].charAt(k) == '1' && map[k] == 1 )) {
                    everyLampsOfThisSwitchAreUseless = false;
                }
            }
            if(everyLampsOfThisSwitchAreUseless) {
                out.print("YES");
                canBe = true;
                break;
            }
        }

        if (!canBe)out.print("NO");


    }
}
