package labor11_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] data = line.split(" ");
        for (int i = 0; i < data.length; i++) {
            try {
                double f = Double.parseDouble(data[i]);
                sum += f;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sum: "+sum);
    }

}
