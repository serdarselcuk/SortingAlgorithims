package hackerRank;

import java.net.URL;
import java.util.Scanner;

//hackerrank Java 1D Array (Part 2)


public class Java1DArray {
    static int leap1;
    static int[] game1;

    public static boolean canWin(int leap, int[] game) {

        game1 = game;
        leap1 = leap;
        return reWin(0);
    }

    public static boolean reWin(int position){
        if(position>=game1.length-1) return  position > game1.length-1 || game1[position]== 0;
        else if(game1[position]!= 0) return false;
        else return reWin(position+1)||reWin(position+leap1);
    }

    public void main(String[] args) {

        URL a = getClass().getClassLoader().getResource("");
//        int leap =  4;
//        int game[] = {0,0,1,1,0,1,0};
//        System.out.println( (canWin(leap, game)) ? "YES" : "NO" );

//        game has all 0 and leap is 0
//        game has 1 length of "1" leap is 0
//        game has all 1 out of first leap is > n
//        1 length is 2 leap is 1

    }

}
