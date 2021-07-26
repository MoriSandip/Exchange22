package com.example.exchange22_sportstokeexchangeanalysis.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Stg{
    @SerializedName("Sid")
    public String sid;
    @SerializedName("Snm")
    public String snm;
    @SerializedName("Scd")
    public String scd;
    @SerializedName("Cid")
    public String cid;
    @SerializedName("Cnm")
    public String cnm;
    @SerializedName("Csnm")
    public String csnm;
    @SerializedName("Ccd")
    public String ccd;
    @SerializedName("Ccdiso")
    public String ccdiso;
    @SerializedName("Scu")
    public int scu;
    @SerializedName("Chi")
    public int chi;
    @SerializedName("Shi")
    public int shi;
    @SerializedName("Sdn")
    public String sdn;
    @SerializedName("Sds")
    public String sds;
}

 class Sids{
    @SerializedName("8")
    public String _8;
    @SerializedName("11")
    public String _11;
    @SerializedName("12")
    public String _12;
}


 class Codebeautify  {


    @SerializedName("Stages")
    public List<Stage> stages;

   public List<Stage> getStages() {
      return stages;
   }

   public void setStages(List<Stage> stages) {
      this.stages = stages;
   }
}
class Stage{
   @SerializedName("Sid")
   public String sid;
   @SerializedName("Snm")
   public String snm;
   @SerializedName("Scd")
   public String scd;
   @SerializedName("Cid")
   public String cid;
   @SerializedName("Cnm")
   public String cnm;
   @SerializedName("Csnm")
   public String csnm;
   @SerializedName("Ccd")
   public String ccd;
   @SerializedName("Ccdiso")
   public String ccdiso;
   @SerializedName("Scu")
   public int scu;
   @SerializedName("Chi")
   public int chi;
   @SerializedName("Shi")
   public int shi;
   @SerializedName("Sdn")
   public String sdn;
   @SerializedName("Events")
   public List<Event> events;
   @SerializedName("Sds")
   public String sds;

   public String getSid() {
      return sid;
   }

   public void setSid(String sid) {
      this.sid = sid;
   }

   public String getSnm() {
      return snm;
   }

   public void setSnm(String snm) {
      this.snm = snm;
   }

   public String getScd() {
      return scd;
   }

   public void setScd(String scd) {
      this.scd = scd;
   }

   public String getCid() {
      return cid;
   }

   public void setCid(String cid) {
      this.cid = cid;
   }

   public String getCnm() {
      return cnm;
   }

   public void setCnm(String cnm) {
      this.cnm = cnm;
   }

   public String getCsnm() {
      return csnm;
   }

   public void setCsnm(String csnm) {
      this.csnm = csnm;
   }

   public String getCcd() {
      return ccd;
   }

   public void setCcd(String ccd) {
      this.ccd = ccd;
   }

   public String getCcdiso() {
      return ccdiso;
   }

   public void setCcdiso(String ccdiso) {
      this.ccdiso = ccdiso;
   }

   public int getScu() {
      return scu;
   }

   public void setScu(int scu) {
      this.scu = scu;
   }

   public int getChi() {
      return chi;
   }

   public void setChi(int chi) {
      this.chi = chi;
   }

   public int getShi() {
      return shi;
   }

   public void setShi(int shi) {
      this.shi = shi;
   }

   public String getSdn() {
      return sdn;
   }

   public void setSdn(String sdn) {
      this.sdn = sdn;
   }

   public List<Event> getEvents() {
      return events;
   }

   public void setEvents(List<Event> events) {
      this.events = events;
   }

   public String getSds() {
      return sds;
   }

   public void setSds(String sds) {
      this.sds = sds;
   }

}