package hackerRank;

public class MakingAnagrams {

    public static void main(String[] args) {
        String a = "abc";//"showman";//"fcrxzwscanmligyxyvym";

        String b ="cde";//"woman";//"jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        int i = a.length()-1;
        String ch = "";
        while (i>=0) {
            ch = a.substring(i,i+1);
            if(b.contains(ch)){
//                int pointA = a.lastIndexOf(ch);
                int pointB = b.lastIndexOf(ch);
                b = b.substring(0, pointB)+b.substring(pointB+1);
                a = a.substring(0,i)+a.substring(i+1);
            }
            i--;
        }
        System.out.println(a +"\n"+b);
        System.out.println( a.length()+b.length());
    }
}
