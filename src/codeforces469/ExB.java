package codeforces469;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExB {
    public static void main(String[] args) {
        int f = 0;
        int cf = 0;
        int cs = 0;
        Scanner sc = new Scanner(System.in);
        List<Integer> listf = new ArrayList<>();
        List<Integer> lists = new ArrayList<>();
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        while (l1 != 0) {
            listf.add(sc.nextInt());
            l1--;
        }
        while (l2 != 0) {
            lists.add(sc.nextInt());
            l2--;
        }
        int i = 0;
        int j = 0;
        if (listf.get(i) == lists.get(j)){
            f++;
            i++;
            j++;
        }
        if (i >= listf.size() || j >= lists.size()) {
            System.out.println(f);
            return;
        }
        cf += listf.get(i);
        cs += lists.get(j);
        while (i < listf.size() && j < lists.size()) {
            if (cs == cf) {
                f++;
                i++;
                j++;
                if (i != listf.size()) cf = listf.get(i);
                if (j != lists.size()) cs = lists.get(j);

            }
            else if (cs > cf) {
                i++;
                cf += listf.get(i);
            }
            else {
                j++;
                cs += lists.get(j);
            }
        }

        System.out.println(f);
    }
}
