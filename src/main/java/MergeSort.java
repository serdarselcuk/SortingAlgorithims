public class MergeSort {
    static int arr[] = { 10, 14, 19, 26, 27, 31, 33, 35, 42, 44, 0 };
    static int[] sortedArr = new int[11];
    static int  max = arr.length;

    public static void main(String[] args) {

        int i;

        System.out.printf("List before sorting\n");

        for(i = 0; i <= max; i++)                   // prints the arr before sorting
            System.out.printf("%d ", arr[i]);

        sort(0, max);

        System.out.printf("\nList after sorting\n");

        for(i = 0; i <= max; i++)
            System.out.printf("%d ", arr[i]);       // prints the arr after sorting

    }

    static void sort(int low, int high) {
        int mid;

        if(low < high) {

            mid = (low + high) / 2;         //finds the middle of the arr

            sort(low, mid);                 // calls recursively for the first half of arr

            sort(mid+1, high);          // calls recursively for the second half of arr

            merging(low, mid, high);        // merges

        } else {
            return;
        }
    }

    static void merging(int low, int mid, int high) {
        int l1, l2, i;

        for(l1 = low, l2 = mid + 1, i = low; l1 <= mid && l2 <= high; i++) {
            if(arr[l1] <= arr[l2])
                sortedArr[i] = arr[l1++];   //
            else
                sortedArr[i] = arr[l2++];
            System.out.println("1: " +i);
        }

        while(l1 <= mid)
            sortedArr[i++] = arr[l1++];
        System.out.println("2: "+i);

        while(l2 <= high)
            sortedArr[i++] = arr[l2++];
        System.out.println("3: "+i);

        for(i = low; i <= high; i++)
            arr[i] = sortedArr[i];
        System.out.println("4: "+i);
    }

}
