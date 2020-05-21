package hackerRank;

public class dayOfTheProgrammer {

    public static void main(String[] args) {
        int[] years ={1700,1800,1900,1917,1918,1919,2000};
        for (int year :
                years) {
            System.out.println("year : "+ year);
            dayof(year);
        }


    }
    static void dayof(int year){

        int russianDivisor = year % 100 == 0 ? 400: 4;
        Boolean isLeap=(year>1918)?(year%4==0):
                (year<1918)?(year%russianDivisor==0):
                        null;
        int f = isLeap==null?-15:isLeap?-1:-2;
        System.out.println("year: ="+ year +"is Leap "
                +isLeap+"february takes->"+f);
        int[] daysInMounts = {1,f, 1,0,1,0,1,1,0,1,0,1};
        int daysSum = 0;
        String result ="";
        for(int i =1 ; i<=12; i++){
            daysSum += daysInMounts[i-1];
            if(256-(i*30)+daysSum < 30){
                String mounth = (i+1)<10? "0"+(i+1):""+(i+1);
                result = ( 256 - ((i*30)+daysSum))+"."+mounth+"."+year;
                break;
            }
        }
        System.out.println( result);

    }

}
