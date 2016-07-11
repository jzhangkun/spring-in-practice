package com.sprintinaction.springidol;
//import javax.sound.midi.Instrument;

/**
 * Created by jack.zhang on 7/11/2016.
 */
public class Instrumentalist implements Performer {
    public Instrumentalist () {};
    public void perform() {
        System.out.print("playing " + song + ": ");
        instrument.play();
    }
    private String song;
    public void setSong (String song) {
        this.song = song;
    }
    private Instrument instrument;
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    // Simulator in main
    // will be translated into Bean
    public static void main(String[] args) {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setInstrument(new Saxphone());
        kenny.setSong("Jingle Bells");
        kenny.perform();
    }
}
