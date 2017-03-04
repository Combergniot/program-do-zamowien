package com.sdajava.zamowienia;

/**
 * Created by RENT on 2017-02-25.
 */

// Konstruktor klasy Pozycja

public class Pozycja {
    public String nazwaTowaru;
    public int ileSztuk; //Liczba zamówionych sztuk
    public double cena;  // Cena pojedynczej sztuki


    public Pozycja (String nazwaTowaru, int ileSztuk, double cena) {
    this.nazwaTowaru = nazwaTowaru;
    this.ileSztuk = ileSztuk;
    this.cena = cena;

}

public Pozycja (){}

}
