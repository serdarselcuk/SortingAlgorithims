package hackerRank;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BribeCount {
    static int count;
    static int[]arr;

    static int minimumSwaps(int[] ar) {
        arr = ar;
        count = 0;
        int point =notOrdered();
        boolean isNotOrdered= (point == -1)?false:true;
        while(isNotOrdered){

            if (point!=-1) {
                swap(point);
                count++;
            }
            point =notOrdered();
            isNotOrdered= (point == -1)?false:true;
        }

        return count;
    }

    static void swap(int pos){
        int num = arr[pos];
        if(num-1 != pos){
            int temp =arr[pos];
            arr[pos] = arr[temp-1];
            arr[temp-1] = temp;
        }

    }

    static int notOrdered() {

        for(int i=0; i<arr.length-1; i++){

            if(arr[i]<arr[i+1]==false){
                return i;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] a = {5, 1, 2, 3, 7, 8, 6, 4};
        int[] b = {1, 2, 5, 3, 7, 8, 6, 4};
        int[] c ={1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(minimumSwaps(b));
    }



}

