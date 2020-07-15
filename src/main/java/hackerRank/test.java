package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static long countPairs(List<Integer> arr) {
        // Write your code here
        long count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {

                if(isRoot(arr.get(i)&arr.get(j))){
//                    System.out.println(arr.get(i)+ " "+arr.get(j));
                    count++;
                }else{
//                    System.out.println("not "+ i +" "+j+" "+ Math.sqrt(arr.get(i)&arr.get(j)));
                }
            }
        }
        return count;

    }
    static  boolean isRoot(double num){
        if(num == 0 )return false;
        if(num == 1) return true;
        if(!isInteger(""+num)) return false;
        return isRoot(num/2);
    }
    static boolean isInteger(String num){
        if(!num.contains(".")) return true;
        else {
            String[] nums = num.split("\\.");
            return Long.parseLong(nums[nums.length-1])==0;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.addAll(Arrays.asList(10,7,2,8,3));

        System.out.println(countPairs(arr));
//        arr.forEach(p-> System.out.println( Math.sqrt(p)  ));


    }
}

