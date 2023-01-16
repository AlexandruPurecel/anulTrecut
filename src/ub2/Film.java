package ub2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Film {
    public String titel;
    public Typ typ;
    public ArrayList<Schauspieler> schauspielers;

    public Film(String titel, Typ typ) {
        this.titel = titel;
        this.typ = typ;
        this.schauspielers = new ArrayList<Schauspieler>();
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public Typ getTyp() {
        return typ;
    }

    public void setTyp(Typ typ) {
        this.typ = typ;
    }

    public ArrayList<Schauspieler> getSchauspielers() {
        return schauspielers;
    }

    public void setSchauspielers(ArrayList<Schauspieler> schauspielers) {
        this.schauspielers = schauspielers;
    }

    public void addSch(Schauspieler schauspieler) {
        schauspielers.add(schauspieler);
    }

    public void deleteFilm(Schauspieler schauspieler) {
        schauspielers.remove(schauspieler);
    }

    public void updateFilm(Schauspieler old, Schauspieler news) {
        int index = schauspielers.indexOf(old);
        schauspielers.set(index, news);
    }

    public void top(){
        List<Schauspieler> schauspielers1 = schauspielers.stream().sorted(Comparator.comparing(Schauspieler::getOsc)).collect(Collectors.toList());


    }


}


