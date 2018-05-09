package com.mateusz_famulski;

import java.util.Scanner;

public class Logic {

    private Scanner skaner = new Scanner(System.in);

    /**
     * Metoda pobiera od użytkownika dane ile elementów będzie sumowanych,
     * instrukcja warunkowa określa max ilość wartości do podania na 15,
     * przy czym zabezpieczono metodę przez wprowadzeniem zbyt niskiej wartości.
     * Następnie wykonywana jest metoda sum();
     */
    public void result () {
        double pickNumber;

        do {
            System.out.println("Ile elementów chcesz zsumować ?");
            pickNumber = userNumberInput();
            if (pickNumber>15){
                System.out.println("Wprowadzono zbyt wyoką wartość !");
            } else if (pickNumber<=1){
                System.out.println("Wprowadzono zbyt niską wartość !");
            }
        } while (pickNumber>15||pickNumber<=1);
        sum(pickNumber);
    }

    /**
     * Metoda odbierająca wprowadzoną przez użytkownika wartość liczbową, sprawdzana jest poprawność wprowadzonych danych.
     * @return liczba wprowadzona przez użytkownika
     */
    private double userNumberInput() {
        boolean isNumberOk;
        double userNumber=0;
        do {
            try {
                userNumber = skaner.nextDouble() * 1;
                isNumberOk=false;
            } catch (Exception e) {
                System.out.println("Wprowadzono niepoprawne dane !");
                skaner.nextLine();
                System.out.println("Spróbuj ponownie: ");
                isNumberOk=true;
            }
        } while (isNumberOk);
        return userNumber;
        }

    /**
     * Metoda odbiera i sumuje wartości wpisane przez użytkownika oraz wyświetla wynik
     * @param x użytkownik podaje ile wartości poda do sumowania
     */
    private void sum (double x) {
        int howManyLeft = (int) x;
        double sumOfElements=0;
        String elements="";
        double currentElement;
        for (int i=1; i<=x;i++){
            System.out.println("Wprowadź liczbę "+i+" z "+howManyLeft);
            currentElement=userNumberInput();
            sumOfElements+=currentElement;
            elements+=currentElement+", ";
        }
        System.out.println("\nWprowadzono następujące wartości: "+elements+"\nSuma ww wartości wynosi: "+sumOfElements);
    }

    /**
     * Metoda wyświetla menu tekstowe w którym użytkownik decyduje o zakończeniu programu lub dokonaniu kolejnego sumowania.
     * @return true or false które umieszczone będzie w pętli do - while w powyższym celu.
     */
    public boolean quitOrNot () {
        System.out.println("\nCo teraz robimy ?\n1 - muszę jeszcze coś zsumować :)\nInny znak - na razie mam dość ale jeszcze tu wrócę !");
        String choice = skaner.next();
        if (choice.equals("1")){
            return true;
        } else {
            System.out.println("Żegnam :(");
            skaner.close();
            return false;
        }
    }
    }