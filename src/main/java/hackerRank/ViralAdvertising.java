package hackerRank;

public class ViralAdvertising {
    /*
    Day Shared Liked Cumulative
    1      5     2       2
    2      6     3       5
    3      9     4       9
    4     12     6      15
    5     18     9      24
    6     27     13     37
    7     39     19
*/


    static int viralAdvertising(int n) {
        int  day =1,
             like = 2,
             cumulative = like;
        while(day<n){
            like += like/2;
            cumulative+=like;
            day++;
        }
        return cumulative;
    }


    public static void main(String[] args) {
        System.out.println(viralAdvertising(6));

    }
}
