package codeforces469;

import java.util.Scanner;

public class ExA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int a = sc.nextInt();

        int c = 0;
        c = Math.min(l,r) * 2;
        if (Math.abs(l-r) <= a) {
            c+= Math.abs(l-r)*2;
            a-= Math.abs(l-r);
        }
        else {
            c+= a*2;
            a=0;
        }
        c += (a/2)*2;

        System.out.println(""+(c));
    }
}
