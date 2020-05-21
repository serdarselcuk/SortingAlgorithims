package hackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {
        long[] graph = new long[n];

        for (int[] each :
                queries) {
            graph[each[0]-1] += each[2];
            if(each[1]<n)graph[each[1]] -= each[2];

        }
        long max = 0;
        long numInGraph =0 ;
        for (long each:graph) {
            numInGraph += each;
            if (max<numInGraph){
                max=numInGraph;
            }
        }

        return max;

    }


    public static void main(String[] args) {
        /*
10 4
2 6 8
3 5 7
1 8 1
5 9 15
        */
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {

            String[] queriesRowItems = scan.nextLine().split(" ");
            scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);
        System.out.println(result);

    }


}
