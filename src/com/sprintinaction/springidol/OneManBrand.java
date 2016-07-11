package com.sprintinaction.springidol;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by jack.zhang on 7/11/2016.
 */
public class OneManBrand implements Performer {
    public OneManBrand() {}
    public void perform() {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
    private Collection<Instrument> instruments;
    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    public static void main(String[] args) {
        OneManBrand hank = new OneManBrand();

        System.out.println("Inject with List...");
        Collection<Instrument> instruments = new ArrayList<Instrument>();
        instruments.add(new Saxphone());
        instruments.add(new Guitar());
        instruments.add(new Piano());
        hank.setInstruments(instruments);
        hank.perform();

        System.out.println("Inject with Set...");
        instruments = new HashSet<Instrument>();
        instruments.add(new Saxphone());
        instruments.add(new Piano());
        instruments.add(new Saxphone());
        hank.setInstruments(instruments);
        hank.perform();
    }
}
