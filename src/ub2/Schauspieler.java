package ub2;

public class Schauspieler {
    public String name;
    public Integer osc;

    public Schauspieler(String name, Integer osc) {
        this.name = name;
        this.osc = osc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOsc() {
        return osc;
    }

    public void setOsc(Integer osc) {
        this.osc = osc;
    }
}
