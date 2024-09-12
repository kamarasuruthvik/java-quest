package org.example.interfaces;

public class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Piano!");
    }
}