package hackerRank;

import java.math.BigInteger;

public class ExtraLongFactorial {

    static void extraLongFactorials(int n) {

        BigInteger l = BigInteger.valueOf(1);
        while (n>1){
            l=l.multiply(BigInteger.valueOf(n--));
        }
        System.out.print(l);

    }

    public static void main(String[] args) {
        extraLongFactorials(25);
    }
}
