package org.example.interfaces;

public class Piano extends Instrument implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Piano!");
    }
}