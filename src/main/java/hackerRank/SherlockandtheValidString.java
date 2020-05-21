package hackerRank;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.jar.JarOutputStream;

public class SherlockandtheValidString {
    private static final Scanner scanner = new Scanner(System.in);

        // Complete the isValid function below.
        static String isValid(String s) {
            s =s.toLowerCase();
            LinkedHashMap<Integer, Integer>map = new LinkedHashMap<>();

            for(int i = 0; i < s.length(); i++){
                int ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
            Collection<Integer>values =map.values();
            int maxVal = Collections.max(values);  // the max frequency of string
            int minVal = Collections.min(values);   // the min frequency of string
            int distinctValues = (int)values.stream().distinct().count(); // the count of distinct values

            if(
                    distinctValues==1 //if string has no other distinct frequency "valid"(aabbcc)
                ||
                    (

                    Collections.frequency(values,minVal) ==1    // if there is 2 different frequency of string but min is only
                    && distinctValues==2
                    && minVal==1
                    )
                ||
                    (
                    Collections.frequency(values,maxVal) == 1
                    &&maxVal-minVal == 1  //   dif between max and min shouldn't be more than 1
                    && distinctValues==2
                    )
            ){

                return "YES";

            }

            return "NO";

        }



    public static void main(String[] args) {

        String s = scanner.nextLine();

        String result = isValid(s);

        scanner.close();
        System.out.println(result);

    }
}
