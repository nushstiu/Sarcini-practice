package edu.step.math;

import java.util.Scanner;
import static java.lang.System.out;

public class Calculator {
    public int sum(int a, int b)
    {
        return a+b;
    }
    public double sum(double a, double b)
    {
        return a+b;
    }
    public int scad(int a, int b){
        return a-b;
    }
    public double scad(double a, double b)
    {
        return a-b;
    }
    public int inm(int a, int b){
        return a*b;
    }
    public double inm(double a, double b){
        return a*b;
    }
    public int imp(int a, int b){
        return a/b;
    }
    public double imp(double a, double b)
    {
        return a/b;
    }

    public void TablaInmultirii(int nr){
        System.out.println("Tabla inmultirii pentru " + nr + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(nr + " * " + i + " = " + (nr * i));
        }
    }

    public int sumaNr(int numar) {
        int suma = 0;
        for (int i = 0; i <= numar; i++) {
            suma += i;
        }
        return suma;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        out.println("Introduceti 2 valori int: ");
        int valInt1 = scanner.nextInt();
        int valInt2 = scanner.nextInt();
        out.println("Introduceti 2 valori double: ");
        double valDouble1 = scanner.nextDouble();
        double valDouble2 = scanner.nextDouble();
        System.out.println("Adunare (int): " + calc.sum(valInt1, valInt2));
        System.out.println("Adunare (double): " + calc.sum(valDouble1, valDouble2));
        System.out.println("Scadere (int): " + calc.scad(valInt1, valInt2));
        System.out.println("Scadere (double): " + calc.scad(valDouble1, valDouble2));
        System.out.println("Inmultire (int): " + calc.inm(valInt1, valInt2));
        System.out.println("Inmultire (double): " + calc.inm(valDouble1, valDouble2));
        System.out.println("Impartire (int): " + calc.imp(valInt1, valInt2));
        System.out.println("Impartire (double): " + calc.imp(valDouble1, valDouble2));

        out.println("Introduceti o valoare int pt tabla inmultirii: ");
        int val = scanner.nextInt();
        calc.TablaInmultirii(val);

        out.println("Introduceti o valoare int pt suma numerelor: ");
        int number = scanner.nextInt();
        calc.sumaNr(number);
    }

}
