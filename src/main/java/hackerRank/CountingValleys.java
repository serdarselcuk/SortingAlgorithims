package hackerRank;

import java.util.Iterator;

public class CountingValleys {

    static int countingValleys(int n, String s) {

        Iterator<Integer>it = s.chars().iterator();
        int altitude = 0, valleyCount = 0;

        while(it.hasNext()){

            int step = it.next();

            if(step=='U') {
                altitude++;
                if (altitude == 0) valleyCount++;
            }
            else altitude--;
        }
        return valleyCount;
    }

    public static void main(String[] args) {
        System.out.println(countingValleys(8,"UUDDUDDDUDUUDDDUUU"));
    }
}
