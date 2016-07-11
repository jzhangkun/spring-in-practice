package com.sprintinaction.springidol;

/**
 * Created by jack.zhang on 7/11/2016.
 */
public class Saxphone implements Instrument {
    public Saxphone() {};
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
    public static void main(String[] args) {
        Instrument instrument = new Saxphone();
        instrument.play();
    }
}
