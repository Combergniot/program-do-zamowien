package com.sdajava.zamowienia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-25.
 */
public class UserInput {
public Pozycja populatePozycja (){
    Pozycja pozycja = new Pozycja(); //Tworzymy nową pozycję w menu

    Scanner in = new Scanner(System.in);

    System.out.println("Wprowadź nazwę towaru");
    pozycja.nazwaTowaru = in.nextLine();
    System.out.println("Wprowadź liczbę sztuk zamówionego towaru");
    pozycja.ileSztuk = in.nextInt();
    System.out.println("Wprowadź cenę pojedynczej sztuki towaru");
    pozycja.cena = in.nextDouble();

    return pozycja; //Zwracamy obiekt

}
}
