package oop.labor04.lab4_3;

import oop.labor04.lab4_2.BankAccount ;
import oop.labor04.lab4_2.Customer ;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {

    private int length;
    private double[] elements;

    public MyArray(double[] elements) {
        this.elements = elements;
        this.length = this.elements.length;
    }

    public MyArray(int length) {
        this.length = length;
        elements = new double[length];
    }

    public MyArray(MyArray myArray) {
        this.elements = myArray.elements;
        this.length = myArray.length;
    }

    public MyArray(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            length = scanner.nextInt();
            elements = new double[length];

            for (int i = 0; i < length; i++) {
                elements[i] = scanner.nextDouble();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void fillRandom(double a, double b) {
        for (int i = 0; i < length; i++) {
            double rand = Math.random() * (b - a + 1) + a;
            elements[i] = rand;
        }
    }

    public double mean() {
        double mean = 0;
        for (double e : elements) {
            mean+=e;
        }
        return (mean/length);
    }

    public void sort(){
        Arrays.sort(elements);
    }

    public void print(String text){
        System.out.print('\n' + text + ": ");
        for (double d : elements){
            System.out.printf("%f  ",d);
        }
        System.out.println();
    }

    public  double stddev() {
        double avg = this.mean();
        double s = 0;
        for (int i = 0; i < this.length; i++) {
            s += Math.pow(this.elements[i] - avg, 2);
        }
        s = Math.sqrt(s / this.length);
        return s;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "length=" + length +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }


}