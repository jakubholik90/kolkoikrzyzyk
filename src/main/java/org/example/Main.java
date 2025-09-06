package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean runApp = true;
        boolean ruchJeszczeDoZrobienia = true;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        String player1sybmol = "x";
        String player2symbol = "o";

        Tablica tablica = new Tablica();
        int poleToWrite = 0;


        System.out.println("""
                            witaj w grze
                        KOLKO I KRZYZYK
                            by jakubek
                            2025!
                        * * * * * * * * """);

        System.out.println("podaj imie 1. gracza (" + player1sybmol +")");
        String player1name = scanner.nextLine();
        System.out.println("podaj imie 2. gracza (" + player2symbol +")");
        String player2name = scanner.nextLine();

        int gameRound = 1;
        int activePlayer = random.nextInt(0,2)%2+1;
        String activePlayerName = "";
        String activePlayerSymbol = "";
        if (activePlayer == 1) {
            activePlayer = 2;
            activePlayerName = player2name;
            activePlayerSymbol = player2symbol;
        } else if (activePlayer == 2) {
            activePlayer = 1;
            activePlayerName = player1name;
            activePlayerSymbol = player1sybmol;
        }


        while (runApp) {

            // info poczatkowe
            System.out.println("\nto jest runda: " + gameRound);
            System.out.println("teraz gra: " + activePlayerName + " (" + activePlayerSymbol + ")");

            // wyswietlenie aktualnego stanu
            System.out.println("aktualny stan");
            tablica.displayTablica();

            // wybor ruchu uzytkownika
            while (ruchJeszczeDoZrobienia) {
                System.out.println("podaj pole do wypelnienia");
                poleToWrite = Integer.parseInt(scanner.nextLine());
                if (tablica.writeTablica(poleToWrite,activePlayerSymbol)) {
                    ruchJeszczeDoZrobienia = false;
                    System.out.println("ok.");
                } else {
                    System.out.println("niepoprawny numer pola. podaj jeszcze raz.");
                }
            }

            // sprawdzenie czy koniec gry
            if (tablica.tablicaChecker123() ||
                    tablica.tablicaChecker456() ||
                    tablica.tablicaChecker789() ||
                    tablica.tablicaChecker147() ||
                    tablica.tablicaChecker258() ||
                    tablica.tablicaChecker369() ||
                    tablica.tablicaChecker159() ||
                    tablica.tablicaChecker753()) {
                System.out.println("KONIEC GRY!");
                tablica.displayTablica();
                System.out.println("wygrywa: " + activePlayerName + " (" + activePlayerSymbol + "). GRATULACJE!");
                runApp = false;
            }

            // przygotowanie do nastepnej kolejki
            if (runApp) {
                gameRound++;

                if (activePlayer == 1) {
                    activePlayer = 2;
                    activePlayerName = player2name;
                    activePlayerSymbol = player2symbol;
                } else if (activePlayer == 2) {
                    activePlayer = 1;
                    activePlayerName = player1name;
                    activePlayerSymbol = player1sybmol;
                }

                ruchJeszczeDoZrobienia = true;

                if (gameRound == 10) {
                    System.out.println("REMIS! gra nierozstrzygnieta");
                    runApp = false;
                }
            }


        }
    }
}