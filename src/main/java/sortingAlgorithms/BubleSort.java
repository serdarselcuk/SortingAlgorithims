package sortingAlgorithms;

import java.util.Arrays;

public class BubleSort {
    static boolean swapped;
    static int intArray[] = {4,6,3,2,1,9,7,5,3,8,4,2,1,1,1};
    static final int  MAX =  intArray.length;

    public static void main(String[] args) {

        sort();
        System.out.println(Arrays.toString(intArray));
    }
    
    static void sort(){

        for (int j = MAX; j > 0; j--) { // in every iteration since the biggest num will go to the last position J can be decresed
            swapped = false;    //    swapped starts as false since  if there will be any swap it will provide to continue to loop
            for (int i = 0; i < j-1; i++) {

                swapped = swap(i);      // provides the swap if the bigger num is on the left side
            }
            if (!swapped){  // if there is NOT any SWAPPING you can breake loop earlyier
                break;
            }
        }
    }
    static boolean swap(int i){

        if (intArray[i] > intArray[i + 1]) {
            int temp = intArray[i];
            intArray[i] = intArray[i + 1];
            intArray[i + 1] = temp;
            return true;
        }
        return swapped;
    }
}
