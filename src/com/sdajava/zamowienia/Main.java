package com.sdajava.zamowienia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean optionflag = true;
        int option;

        Scanner in = new Scanner(System.in);

        // menu

        Controller controller = new Controller();
        Pozycja pozycja = new Pozycja();

        while (optionflag) {

            System.out.println("Program do obsługi zamówień\n" +
                    "1. Dodaj nową pozycję do zamówienia \n" +
                    "2. Wyświetl wszystkie pozycje zamówienia \n" +
                    "3. Zrealizuj zamówienie \n" +
                    "4. Sprawdź czy w zamówieniu było Piwo \n" +
                    "5. Wyjście z programu");


            option = in.nextInt();

            switch (option) {
                case 1:
                    controller.addPosition();
                    break;
                case 2:
                    controller.showPositions();
                    break;
                case 3:
                    controller.obliczWartosc();
                    break;
                case 4:
                    controller.sprawdzCzyZamowilesPiwo();
                case 5:
                    System.exit(0);

                default:
                    optionflag = false;
            }
        }

        }

    }








