package main.battlecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Chaton {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = in.nextInt();
        String s1 = in.next();
        int b = in.nextInt();
        String s2 = in.next();
        List<List<Character >> set1 = new ArrayList<>();
        List<String> ss = new ArrayList<>();
/*        for (int i = 0 ; i != s1.length() ; i++) {
            ss.add(s1.charAt(i));
        }*/
        List<Character> ss2 = new ArrayList<>();
        for (int i = 0 ; i != s2.length() ; i++) {
            ss2.add(s2.charAt(i));
        }
        //getperm(set1, new ArrayList<>(), new ArrayList<>(ss), 0);
        permutation("",s1, ss);

        int bestsco = -1;
        String bestcomb = null;

        for (String l1 : ss) {
                int score = battle(l1,s2);
                if (score >= bestsco) {
                    bestcomb = l1;
                    bestsco = score;
                }

        }
        if (bestsco > 0) System.out.print("+");
        else if (bestsco < 0) System.out.print("-");
        else System.out.print("=");

        System.out.print(bestcomb);
        System.out.println();

    }
    public static int battle(String team1, String team2){
        String t1=team1+"";
        String t2=team2+"";

        while (t1.length()>0&t2.length()>0){
            if (t1.charAt(0)==t2.charAt(0)){t1=t1.substring(1);t2=t2.substring(1);}
            else if (t1.charAt(0)=='F'&t2.charAt(0)=='P'){t2=t2.substring(1);}
            else if (t2.charAt(0)=='F'&t1.charAt(0)=='P'){t1=t1.substring(1);}
            else if (t1.charAt(0)=='F'&t2.charAt(0)=='E'){t1=t1.substring(1);}
            else if (t2.charAt(0)=='F'&t1.charAt(0)=='E'){t2=t2.substring(1);}
            else if (t2.charAt(0)=='P'&t1.charAt(0)=='E'){t1=t1.substring(1);}
            else if (t1.charAt(0)=='P'&t2.charAt(0)=='E'){t2=t2.substring(1);}
        }
        if (t1.length()>0){return 1;}
        else if (t2.length()>0){return -1;}
        return 0;
    }

    private static int battle(List<Character> set1, List<Character> set2) {
        int i = 0;
        int j = 0;
        int sco = 0;
        while (i != set1.size() &&  set2.size() != j) {
            if (set1.get(i) == 'F' && set2.get(j) == 'E') {
                sco--;
                i++;
            }
            else if (set1.get(i) == 'E' && set2.get(j) == 'P') {
                sco--;
                i++;
            }
            else if (set1.get(i) == 'P' && set2.get(j) == 'F') {
                sco--;
                i++;
            }
            else if ( set1.get(i) == set2.get(j)) {
                i++;
                j++;
            }
            else {
                j++;
                sco++;
            }
        }
        return sco;
    }

    public static void permutation(String prefix, String str, List<String> result) {
        int n = str.length();
        if (n == 0) {result.add(prefix);}
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n),result);
        }
    }
    private static void getperm(List<List<Character>> set, ArrayList<Character> ss, List<Character> str, int pos) {
        if (pos == str.size()) {
            set.add(new ArrayList<>(str));
        }
        for (int i = pos ; i != str.size() ; i++) {
            Collections.swap(str,i , pos);
            getperm(set, ss, str, i+1);
            Collections.swap(str,i , pos);
        }
    }
}
