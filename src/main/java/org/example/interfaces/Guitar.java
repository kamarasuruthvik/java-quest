package org.example.interfaces;

public class Guitar extends Instrument implements Playable {
    @Override
    public void play(){
        System.out.println("Playing guitar!");
    }

}
