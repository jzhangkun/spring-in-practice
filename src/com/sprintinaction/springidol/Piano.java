package com.sprintinaction.springidol;

/**
 * Created by jack.zhang on 7/11/2016.
 */
public class Piano implements Instrument {
    public Piano() {};
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
    public static void main(String[] args) {
        Instrument instrument = new Piano();
        instrument.play();
    }
}
