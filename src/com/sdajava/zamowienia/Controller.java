package com.sdajava.zamowienia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-02-25.
 */
public class Controller {

    public UserInput userInput = new UserInput();
    public List<Pozycja> positionlist = new ArrayList<>();

    public void addPosition() {
        System.out.println("Program doda nową pozycję zamówienia");
        Pozycja poz1 = userInput.populatePozycja();
        positionlist.add(poz1);
    }

    public void showPositions() {
        System.out.println("Program wyświetli wszystkie pozycje zamówienia");
        for (Pozycja p : positionlist) {
            System.out.println(p.nazwaTowaru + " " + p.ileSztuk + " szt. po " + p.cena + " zł/szt.\n" +
            "Razem " + p.ileSztuk * p.cena + " zł");
        }
    }


        public void obliczWartosc() {
            for (Pozycja p : positionlist) {
                System.out.println("Wartość zamówienia wynosi " + p.ileSztuk * p.cena + " zł");
            }
        }
        public void sprawdzCzyZamowilesPiwo (){ //Bawimy się dalej
            positionlist.forEach(s -> System.out.println(s.nazwaTowaru));
        }




/* double value = 123.213
System.out.printf = ("Value: %2f", value);
 */


}
