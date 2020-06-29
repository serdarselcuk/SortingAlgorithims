package hackerRank;

import java.util.ArrayList;

public class BeautifulDaysattheMovies {
    static int beautifulDays(int i, int j, int k) {

        ArrayList<Integer> list= new ArrayList<>();
        for(int num = i; num <= j; num ++){
            if(Math.abs(num -reversed(num))%k==0) list.add(num);
        }
        return list.size();

    }
    public static int reversed(int n){
        int result = 0;
        while(n>0){

            int num = n%10;
            result= result *10 + num;
            n = n/10;
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
