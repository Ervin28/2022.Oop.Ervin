package oop.labor04.lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void readFilePrintItsLineNumbered( String fileName ){
        try (Scanner scanner = new Scanner( new File(fileName))){
            int db=1;
           while(scanner.hasNextLine()){
               String line =scanner.nextLine();
               System.out.println(db+ " "+line);
               db++;

           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        readFilePrintItsLineNumbered("lab4_1_input.txt");

        ArrayList<Person> people = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("lab4_1_input.csv"))) {
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] s = line.split(",");
                String firstName = s[0].trim();
                String lastName = s[1].trim();
                int birthYear = Integer.parseInt(s[2].trim());
                people.add(new Person(firstName,lastName,birthYear));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (Person person: people){
            System.out.println(person.toString());
        }
    }

}