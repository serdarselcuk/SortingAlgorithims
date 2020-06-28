package hackerRank;

import java.util.*;

public class AnagramsInsString {

    static int sherlockAndAnagrams(String s) {

        Map<String, Integer>control=new HashMap<>();

        for(int startPoint = 0; startPoint<s.length(); startPoint++){
            for(int leng_st = 1; leng_st+startPoint <= s.length(); leng_st++){
                char[] subStrArr = s.substring(startPoint,startPoint+leng_st).toCharArray();
                Arrays.sort(subStrArr);// to make char of string sorted identically (it will be needed for comparing)
                String subStr = new String(subStrArr);// i convert it to a String an array will be compared by hashCode in the map
                Integer num  = control.putIfAbsent(subStr,0);
                if(num != null) control.replace(subStr, num, num+1);
            }
        }

        Iterator<Integer>iter = control.values().iterator();
        int count = 0;
        while (iter.hasNext()){
            int num = iter.next();
            //if there is 3 "k" there will be 3+2+1= 6 different possible anagrams
            while(num>0){
                count += num--;
            }
        }
        return count;
    }


    public static void main(String[] args) {


        System.out.println(sherlockAndAnagrams("kkkk"));

    }
}
