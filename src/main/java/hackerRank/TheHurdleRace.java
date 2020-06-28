package hackerRank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Spliterator;

public class TheHurdleRace {

    static int hurdleRace(int k, int[] height) {
        int max = Arrays.stream(height).max().orElse(-1);
        return max - k >=0?max - k:0;
    }

    public static void main(String[] args) {
        String s = "2 52 4 5 2";
        String[] arr = s.split(" ");
        Iterator<String> it = Arrays.stream(arr).iterator();
        int[] arInt = new int[arr.length];
        int num = 0;
        while(it.hasNext()){
            arInt[num] = Integer.parseInt(it.next());
            num++;
        }
        System.out.println(hurdleRace( 5,arInt ));
    }
}
