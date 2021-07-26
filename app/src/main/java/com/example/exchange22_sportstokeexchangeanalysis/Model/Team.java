package com.example.exchange22_sportstokeexchangeanalysis.Model;

import java.util.ArrayList;

public class Team {
    private String Nm;
    private String ID;
    private float tbd;
    ArrayList< Object > EL = new ArrayList < Object > ();
    private float Gd;

    public String getNm() {
        return Nm;
    }

    public void setNm(String nm) {
        Nm = nm;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public float getTbd() {
        return tbd;
    }

    public void setTbd(float tbd) {
        this.tbd = tbd;
    }

    public ArrayList<Object> getEL() {
        return EL;
    }

    public void setEL(ArrayList<Object> EL) {
        this.EL = EL;
    }

    public float getGd() {
        return Gd;
    }

    public void setGd(float gd) {
        Gd = gd;
    }
}
