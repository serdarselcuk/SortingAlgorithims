package hackerRank;

import com.sun.org.apache.bcel.internal.generic.ALOAD;

public class CharCount {

    public static void main(String[] args) {
        String a = "serdar";
        System.out.println(charCount(a,'r'));
    }

    public static int charCount(String a,char ch){
        int[] alphabet = new int['z'-'a'];
        for(char each : a.toCharArray()) alphabet[each-'a']++;
        return alphabet[ch-'a'];
    }
}
