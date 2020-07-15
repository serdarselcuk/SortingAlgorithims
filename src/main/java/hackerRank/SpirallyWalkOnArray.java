package hackerRank;

public class SpirallyWalkOnArray {

    static int vertical, horizontal,  start_vert,  end_vert, start_horiz, end_horiz;

    public static void main(String[] args) {

        int[][] arr1 = {
                        {1 ,2 ,3 ,4 ,5 },
                        {6 ,7 ,8 ,9 ,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25}
                    };

        int[][] arr2 = {
                        {1 ,2 ,3 ,4 },
                        {5, 6 ,7 ,8 },
                        {9 ,10,11,12},
                        {13,14,15,16}
                    };

        int[][] arr3 ={
                        {1 ,2 ,3 },
                        {4 ,5, 6 },
                        {7 ,8 ,9 }
                    };

        int[][] test = arr1;// you can chose test arr from here
        int start = 0, end =test.length-1; // you can decide start end points

        vertical = start;
        horizontal = start;
        start_vert = start;
        end_vert = end;
        start_horiz = start_vert;
        end_horiz = end;

        method(test);

    }



    public static void method(int[][] arr ) {

        System.out.println(arr[vertical][horizontal]);
//      top left side of square
        if (vertical <= start_vert && !(horizontal >= end_horiz)) {
            horizontal++;
            if (horizontal == end_horiz) end_horiz--;
            method(arr);
        }
//      top right side of square
        else if (!(vertical >= end_vert) && horizontal >= end_horiz) {
            vertical++;
            if (vertical == end_vert) end_vert--;
            method(arr);
        }
//      right bottom of square
        else if (vertical >= end_vert && !(horizontal <= start_horiz)) {
            horizontal--;
            if (horizontal == start_horiz) start_horiz++;
            method(arr);
        }
//      left bottom of square
        else if (!(vertical <= start_vert) && horizontal <= start_horiz) {
            vertical--;
            if (horizontal == start_vert) start_vert++;
            method(arr);
        }

    }
}
