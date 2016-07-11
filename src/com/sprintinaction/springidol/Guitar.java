package com.sprintinaction.springidol;

/**
 * Created by jack.zhang on 7/11/2016.
 */
public class Guitar implements Instrument {
    public Guitar() {};
    public void play() {
        System.out.println("SCRUM SCRUM SCRUM");
    }
    public static void main(String[] args) {
        Instrument instrument = new Guitar();
        instrument.play();
    }
}
