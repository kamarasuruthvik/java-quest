package org.example;

import org.example.interfaces.Guitar;
import org.example.interfaces.Piano;
import org.example.interfaces.Instrument;
import org.example.interfaces.Playable;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Instrument g = new Guitar();
        g.tune();
        g.play();

        Instrument p = new Piano();
        g.tune();
        p.play();
    }
}