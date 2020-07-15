package hackerRank;

public class getFirstNonRepeatingCharacter {

    // Same algorithm with hashmap - O(n) time complexity, 26 space complexity
    private static char getFirstNonRepeatingCharacter3(String abc) {

        int[] car_counts = new int['z'-'A'+1];  // create an array for alphabet

        for(char c : abc.toCharArray()) car_counts[c-'A']++; //change the position to the 1 if you got the char

        for(char c : abc.toCharArray()) {
            if(car_counts[c-'A']==1) return c; //check characters if it is unique
        }
        return  ' ';
    }

    public static void main(String[] args) {
        char p =getFirstNonRepeatingCharacter3("sAerdarsz");
        System.out.println(p);
    }
}
