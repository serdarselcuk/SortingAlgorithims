package hackerRank;

import java.util.*;

public class parseToDouble {


    public static void main(String[] args) {

        List<Integer>a=new ArrayList<>(Arrays.asList(2));
        List<Integer>b=new ArrayList<>(Arrays.asList(20, 30, 12));
        System.out.println(getTotalX(a,b));

    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here         2 4             16 32 48
        a.sort(Comparator.naturalOrder());
        b.sort(Comparator.naturalOrder());

        int start = a.get(a.size()-1),//4
                stop = b.get(0),//16
                res=0,
                num = start,//4
                multiply = 1;


        while(num <= stop ){

            num *= multiply;//4

            boolean result = false;

            for(int i =0; i<a.size(); i++){
                result = num%a.get(i) == 0;
                if(result){ //4%2 true

                }else{
                    break;
                }
            }

            if (result){//true
                for(int i =0; i<b.size(); i++){

                    result = b.get(i) % num == 0;// 16 % 4 ==0 true

                    if(result){

                    }else{
                        break;
                    }
                }
            }

            if(result) {
                res++;
                System.out.println(num);
            }

            multiply++;

        }
        return res;
    }

}



