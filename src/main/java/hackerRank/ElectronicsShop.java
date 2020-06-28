package hackerRank;

import java.util.*;

public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Set<Integer> list = new HashSet<>();
        for (int kb :
                keyboards) {
            if(kb<=b) {
                for (int usbDrv :
                        drives) {
                    if (kb + usbDrv <= b)
                        list.add(kb + usbDrv);
                }
            }
        }

        return list.stream().max(Comparator.naturalOrder()).orElse(-1);
    }

    public static void main(String[] args) {
        int[] keyboards= {5,10,23};
//        Arrays.stream(a).max().orElse(-1);
        int[] drives = {8,2};
        Set<Integer> list = new HashSet<Integer>();
        for (int kb :
                keyboards) {
            if(kb<=100) {
                for (int usbDrv :
                        drives) {
                    if (kb + usbDrv <= 100)
                        list.add(kb + usbDrv);
                }
            }
        }



//        System.out.println(getMoneySpent(a,b,15));
    }
}
