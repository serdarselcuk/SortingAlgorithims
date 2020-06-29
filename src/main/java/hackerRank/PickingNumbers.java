package hackerRank;

import com.google.gson.internal.$Gson$Preconditions;

import java.security.Key;
import java.util.*;

public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {

        a.sort(Comparator.naturalOrder());
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Iterator<Integer>listIter = a.iterator();
        int count = 1,currentInt = 0, prevInt =listIter.next() ;

        while(listIter.hasNext()){

            currentInt = listIter.next();

            if(prevInt != currentInt ){
                map.put(prevInt,count);
                prevInt = currentInt;
                count =1;
            }else{
                count++;
            }
        }
        map.put(currentInt, count);

        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        Map.Entry<Integer, Integer> prevEnt = it.next();
        Integer longestArray = prevEnt.getValue();

        while(it.hasNext()){
            Map.Entry<Integer, Integer> current = it.next();
            int arrayLength;

            if(current.getKey() - prevEnt.getKey() <= 1 ){

                arrayLength = prevEnt.getValue()+current.getValue();
            }else{
                arrayLength = current.getValue();
            }
            longestArray = longestArray>arrayLength?longestArray:arrayLength;
            prevEnt = current;
        }
        return longestArray;
    }

    public static void main(String[] args) {
        String s ="66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66 66";

        String[] arr = s.split(" ");
        Iterator<String> it = Arrays.stream(arr).iterator();
        List<Integer>arInt = new LinkedList<Integer>();
        int num = 0;
        while(it.hasNext()){
            arInt.add(Integer.parseInt(it.next()));
            num++;
        }
        System.out.println(arInt+" in the main \n"+ pickingNumbers(arInt));

    }
}
