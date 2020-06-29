package hackerRank;

public class UtopianTree {
    /*
    * The Utopian Tree goes through 2 cycles of growth every year.
    * Each spring,
             it doubles in height.
    * Each summer,
             its height increases by 1 meter.
    Period  Height
    0                1        PLANTED
    1 (1st spring)   2        SPRING  (2**1)
    2     +1         3        SUMMER
    3 (2th spring)   6        SPRING  (2**2)+(2**1)
    4     +1         7        SUMMER
    5 (3th spring)   14       SPRING  (2**3)+(2**2)+(2**1)
    6     +1         15       SUMMER
    7 (4th spring)   30       SPRING  (2**4)+(2**3)+(2**2)+(2**1)


    (7+1)/2=4 SPRING--> 1-2-4-8-16 (2**4)
    (7-1)/2=3 SUMMER--> 1-2-3 (3*1)
    ODD-> 3 EVEN->2 SPRING FOLLOWING 0 + (1) + (1 + 2 )+ (1 + 2 + 4) : (3*2**0)+(2*2**1)+(1*2**2)
                                    1+
    * Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after  growth cycles?
    *
    *TESTS:
    * 0  CYCLE
    * 1  CYCLE
    * 30 CYCLE
    * 31 CYCLE
    * 59 CYCLE
    * 60 CYCLE
    *
    *  It should return the integer height of the tree after the input number of growth cycles.
    */


    /**
     Period           Height
     0                1        PLANTED
     1 (1st spring)   2        SPRING  (2**1)                       =2
     2     +1         3        SUMMER
     3 (2th spring)   6        SPRING  (2**2)+(2**1)                =6
     4     +1         7        SUMMER
     5 (3th spring)   14       SPRING  (2**3)+(2**2)+(2**1)         =14
     6     +1         15       SUMMER
     7 (4th spring)   30       SPRING  (2**4)+(2**3)+(2**2)+(2**1)  =30
     */

    static int utopianTree(int n) {
        int spring = (n+1)/2, result =0
        , summerEffect = n%2==0?1:0; //if n is even then there must be +1 for the last summer season

        for (int i = spring; i > 0 ; i--) {
            result += Math.pow(2,i);
        }
        return (int) (result+summerEffect);
    }

    public static void main(String[] args) {
        System.out.println(utopianTree(8));
    }
}
