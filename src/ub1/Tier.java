package ub1;

import java.util.ArrayList;

public class Tier {
    public String name;
    public String wname;

    public Diat diat;

    public Standort standort;


    public Tier(String name, String wname, Diat diat,Standort standort)
    {
        this.name = name;
        this.wname = wname;
        this.diat = diat;
        this.standort = standort;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public Diat getDiat() {
        return diat;
    }

    public void setDiat(Diat diat) {
        this.diat = diat;
    }

    public Standort getStandort() {
        return standort;
    }

    public void setStandort(Standort standort) {
        this.standort = standort;
    }
}
