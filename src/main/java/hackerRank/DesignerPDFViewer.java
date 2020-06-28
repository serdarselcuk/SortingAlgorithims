package hackerRank;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DesignerPDFViewer {

    static int designerPdfViewer(int[] h, String word) {
        Iterator<Integer> it= word.chars().iterator();
        int max = 0;
        while(it.hasNext()){
            int num = it.next()-97;
            max = max > h[num] ? max:h[num];
        }

        return max*word.length();
    }

    public static void main(String[] args) {
        String s = "1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5";
        String[] arr = s.split(" ");
        Iterator<String> it = Arrays.stream(arr).iterator();
        int[] arInt = new int[arr.length];
        int num = 0;
        while(it.hasNext()){
            arInt[num] = Integer.parseInt(it.next());
            num++;
        }
        System.out.println(designerPdfViewer(arInt,"abc"));
    }
}
