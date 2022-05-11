package labor11_2;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String NeptunId, firstname, lastname;
        int credits, birthyear, birthmonth, birthday;
        try (Scanner scanner = new Scanner(new File("student.csv"))) {
            try (FileWriter writer = new FileWriter("warnings.csv")) {

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] data = line.split(",");
                    try {
                        if (data.length != 7) {
                            throw new Exception("INCOMPLETE LINE");
                        }
                        NeptunId = data[0].trim();
                        firstname = data[1].trim();
                        lastname = data[2].trim();
                        credits = Integer.parseInt(data[3].trim());
                        birthyear = Integer.parseInt(data[4].trim());
                        birthmonth = Integer.parseInt(data[5].trim());
                        birthday = Integer.parseInt(data[6].trim());

                        if (birthday < 1 || birthday > 31)
                            throw new Exception("INVALID DATE");
                        if (birthmonth < 1 || birthmonth > 12)
                            throw new Exception("INVALID DATE");
                        if (birthyear < 1900 || birthyear >= 3000)
                            throw new Exception("INVALID DATE");
                        if (credits < 30) {
                            writer.write(line+"\n");
                        }


                    } catch (NumberFormatException e) {
                        System.out.println("NUMBER FORMAT EXCEPTION : " + line);
                    } catch (Exception e) {
                        System.out.println(e.getMessage() + " : " + line);
                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
