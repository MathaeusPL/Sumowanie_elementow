package com.mateusz_famulski;


/**
 * Program oblicza sumę z szeregu wprowadzonych przez użytkownika liczb. Wprowadzono  ograniczenie do max 15 wprowadzonych wartości.
 * Projekt zawiera się w dwóch klasach Main oraz Logic.
 *  Program testowany na poprawnych danych wejściowych nie ujawnił błędów.Zastosowano obsługę wyjątków w przypadku
 *  wprowadzenia przez użytkownika błędnego rodzaju danych. Przetestowano program przy błędnych danych - program dobrze obsługuje błędy.
 *  Program pisany w IntelliJ IDEA na Windows 10. Wersja javy "1.8.0_144".
 *
 *  @author Mateusz Famulski
 *  @version 0.1
 */

public class Main {

    public static void main(String[] args) {
        Logic logic = new Logic();
        System.out.println("Witaj, ten program sumuje podane przez użytkownika wartości (zgodnie z założeniem można podać max do 15 wartości)\n");

        // pętla wykonywania działań do czasu wyboru zakończenia programu przez użytkownika
        do {
            logic.result();
        } while (logic.quitOrNot());
    }

}