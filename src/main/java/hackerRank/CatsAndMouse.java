package hackerRank;

public class CatsAndMouse {
    static String catAndMouse(int x, int y, int z) {

        return   Math.abs(x - z) > Math.abs(y - z)? "Cat A":
                 Math.abs(y - z) > Math.abs(x - z)? "Cat B":
                                                    "Mouse C";

    }

    public static void main(String[] args) {

    }
}
