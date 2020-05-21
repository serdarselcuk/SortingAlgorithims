import java.util.Arrays;

public class InsertionSort {

    static int[] arr = {4,6,3,2,1,9,7};

    static  void insertion(){

        for (int i = 0; i< arr.length-1;i++){

            if(arr[i]>arr[i+1]){
                change(i);
            };
        }
    }

    static  void change(int position){

        swap(position);
        if (position>0&&arr[position-1]>arr[position]){
            change(position-1);
        }
    }
    static void swap(int position){
        int temp = arr[position];
        arr[position] = arr[position+1];
        arr[position+1] = temp;

    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));

        insertion();


        System.out.println(Arrays.toString(arr));
    }
}
