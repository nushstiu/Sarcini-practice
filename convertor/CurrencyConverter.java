package edu.step.convertor;

import java.util.Scanner;

public class CurrencyConverter {
    private double exchangeRate;

    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public void setExchangeRate(double newExchangeRate) {
        this.exchangeRate = newExchangeRate;
        System.out.println("Rata de schimb: " + newExchangeRate);
    }

    public double convertToEuro(double lei) {
        if (lei >= 0) {
            return lei / exchangeRate;
        } else {
            System.out.println("Eroare! Suma introdusă trebuie să fie pozitivă.");
            return -1;
        }
    }

    public double convertToLei(double euro) {
        if (euro >= 0) {
            return euro * exchangeRate;
        } else {
            System.out.println("Eroare! Suma introdusă trebuie să fie pozitivă.");
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter(19.8);
        int choice;

        System.out.print("Introduceți noua rată de schimb: ");
        double newRate = scanner.nextDouble();
        converter.setExchangeRate(newRate);

        System.out.print("Alegeți metoda de conversie (1- in euro, 2- in lei): ");
        choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.print("Introduceți suma în lei pentru conversie: ");
                double amountLei = scanner.nextDouble();
                double resultEuro = converter.convertToEuro(amountLei);
                if (resultEuro != -1) {
                    System.out.println("Echivalentul în euro: " + resultEuro);
                }
                break;

            case 2:
                System.out.print("Introduceți suma în euro pentru conversie: ");
                double amountEuro = scanner.nextDouble();
                double resultLei = converter.convertToLei(amountEuro);
                if (resultLei != -1) {
                    System.out.println("Echivalentul în lei: " + resultLei);
                }
                break;

                default:
                System.out.println("Opțiune invalidă.");
        }
    }
}
