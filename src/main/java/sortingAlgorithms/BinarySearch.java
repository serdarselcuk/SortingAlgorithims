package sortingAlgorithms;

import java.util.Arrays;

public class BinarySearch {

    static int[] arr = {1,2,3,4,5,6,7,8,9};

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
//        System.out.println(Arrays.binarySearch(arr,12));
//        System.out.println(searchBinary(arr,13));


    }

    static int searchBinary(int left, int right, int num){

        if (left>=right){
            return -1;
        }

        int mid = ((right-left)/2)+left;
        int pivot = arr[mid];

        if(num==pivot){
            return mid;
        }

        else if(num>pivot){
            return searchBinary(mid,right,num);
        }

        else {
            return searchBinary(left,mid,num);
        }

    }

    static int searchBinary(int[] arr, int num){


        int left = 0;
        int right = arr.length;

        int mid = ((right-left)/2)+left;
        int pivot = arr[mid];

        if(num==pivot){
            return mid;
        }

        else if(num>pivot){
            return searchBinary(mid,right,num);
        }

        else {
            return searchBinary(left,mid,num);
        }

    }


}
