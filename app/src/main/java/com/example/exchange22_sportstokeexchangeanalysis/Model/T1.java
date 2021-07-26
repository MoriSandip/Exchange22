package com.example.exchange22_sportstokeexchangeanalysis.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class T1 {
    @SerializedName("Nm")
    public String nm;
    @SerializedName("ID")
    public String iD;
    public int tbd;
    @SerializedName("EL")
    public List<Object> eL;
    @SerializedName("Gd")
    public int gd;

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public int getTbd() {
        return tbd;
    }

    public void setTbd(int tbd) {
        this.tbd = tbd;
    }

    public List<Object> geteL() {
        return eL;
    }

    public void seteL(List<Object> eL) {
        this.eL = eL;
    }

    public int getGd() {
        return gd;
    }

    public void setGd(int gd) {
        this.gd = gd;
    }
}
