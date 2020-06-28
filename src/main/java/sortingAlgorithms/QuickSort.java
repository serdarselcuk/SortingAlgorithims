package sortingAlgorithms;

public class QuickSort {

    static int intArray[] = {4,6,3,2,1,9,7,4,6,3,2,1,9,7,4,6,3,2,1,9,7,4,6,3,2,1,9,7,4,6,3,2,1,9,7};
    static final int  MAX =  intArray.length;


    static void printline(int count) {
        int i;

        for(i = 0;i < count-1;i++) {
            System.out.printf("=");
        }

        System.out.printf("=\n");
    }

    static void display() {
        int i;
        System.out.printf("[");

        // navigate through all items
        for(i = 0;i < MAX;i++) {
            System.out.printf("%d ",intArray[i]);
        }

        System.out.printf("]\n");
    }

    static void swap(int num1, int num2) {
        int temp = intArray[num1];
        intArray[num1] = intArray[num2];
        intArray[num2] = temp;
    }

    static int partition(int left, int right, int pivot) {
        int leftPointer = left -1;
        int rightPointer = right;

        while(true) {
            while(intArray[++leftPointer] < pivot) {    //it will stop if num  is bigger than pivot on the left side
                //do nothing
            }

            while(rightPointer > 0 && intArray[--rightPointer] > pivot) {   // it will point the num smaller than pivot on the right side
                //do nothing
            }

            if(leftPointer >= rightPointer) {       //if left pointer pass to the right side loop will breake
                break;
            } else {
                System.out.printf(" item swapped :%d,%d\n", intArray[leftPointer],intArray[rightPointer]);
                swap(leftPointer,rightPointer);         // pointers are on the nums which are belongs to other side, so SWAP!
            }
        }

        System.out.printf(" pivot swapped :%d,%d\n", intArray[leftPointer],intArray[right]);
        swap(leftPointer,right);        //takes the pivot to the middle of the list
        System.out.printf("Updated Array: ");
        display();
        return leftPointer;
    }

    static void quickSort(int left, int right) {
        if(right-left <= 0) {
            return;
        } else {
            int pivot = intArray[right];
            System.out.println("pivot selected as: "+ pivot);
            int partitionPoint = partition(left, right, pivot);
            quickSort(left,partitionPoint-1);      //     recursively ordering the list by participaing half of it
            quickSort(partitionPoint+1,right);
        }
    }

    public static void main(String[] args) {
        System.out.printf("Input Array: ");
        display();
        printline(50);
        quickSort(0,MAX-1);
        System.out.printf("Output Array: ");
        display();
        printline(50);
















    }
}

