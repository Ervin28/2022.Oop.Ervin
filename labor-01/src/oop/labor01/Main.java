package oop.labor01;


public class Main {
    public static String monogram(String nev) {
        String result = "";
        String[] data = nev.split(" ");

        for (int i = 0; i < data.length; ++i) {

            result += data[i].charAt(0);
        }
        return result;

    }

    public static double maxElement(double array[]) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static byte getBit(int number, int order) {
        if (order < 0 || order > 31) {
            return -1;
        }
        return (byte) ((number >> order) & 1);
    }

    public static int countBits(long number) {
        int count = 0;
        while(number>0){
            ++count;
            number &= number-1; }
        return count;
    }

    public static void main(String[] args) {
        String nev = "Mihacsa Ervin Laszlo";
        System.out.println(monogram(nev));

        for (int i = 0; i < nev.length(); i++) {
            System.out.println(nev.charAt(i));


        }
        // System.out.println(nev + mon);
        String alma = "ALMAFA";
        for (int i = 0; i < alma.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(alma.charAt(j));

            }
            System.out.println();

        }
        String[] moni = nev.split(" ");
        String adat = "";
        for (int i = 0; i < moni.length; i++) {
            adat += moni[i].charAt(0);

        }
        System.out.println(adat);
        double x[] = {7, 1, -3, 45, 9};
        System.out.printf("MAX: %6.2f\n", maxElement(x));
        System.out.println();
        for (int i = 7; i >= 8; i--) {
            System.out.println(getBit(13, i));

        }
        System.out.println(countBits(346));


    }
}