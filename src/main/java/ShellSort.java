public class ShellSort {


    static int intArray[] = {4,6,3,2,1,9,7};

    static final int MAX =  intArray.length;

    static void printline(int count) {
        int i;

        for(i = 0;i < count-1;i++) {
            System.out.printf("=");
        }

        System.out.printf("=\n");
    }  // just printing line "======================="

    static void display() {
        int i;
        System.out.printf("[");

        // navigate through all items
        for(i = 0;i < MAX;i++) {
            System.out.printf("%d ",intArray[i]);
        }

        System.out.printf("]\n");
    }  // for displaying the array

    static void shellSort() {
        int inner, outer;
        int valueToInsert;
        int interval = 1;
        int elements = MAX;
        int i = 0;

        while(interval <= elements/3) {
            interval = interval*3 +1;
        }

        while(interval > 0) {
            System.out.printf("iteration %d#:",i);
            display();

            for(outer = interval; outer < elements; outer++) {
                valueToInsert = intArray[outer];
                inner = outer;

                while(inner > interval -1 && intArray[inner - interval]
                        >= valueToInsert) {
                    intArray[inner] = intArray[inner - interval];
                    inner -=interval;
                    System.out.printf(" item moved :%d\n",intArray[inner]);
                }

                intArray[inner] = valueToInsert;
                System.out.printf(" item inserted :%d, at position :%d\n",valueToInsert,inner);
            }

            interval = (interval -1) /3;
            i++;
        }
    }

    public static void main(String[] args) {

        System.out.printf("Input Array: ");
        display();
        printline(50);
        shellSort();
        System.out.printf("Output Array: ");
        display();
        printline(50);

    }
}
