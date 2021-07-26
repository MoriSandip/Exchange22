package com.example.exchange22_sportstokeexchangeanalysis.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Demo {

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

        /// EVNT

    @SerializedName("Eid")
    public String eid;
    @SerializedName("Eps")
    public String eps;
    @SerializedName("Esid")
    public int esid;
    @SerializedName("EpsL")
    public String epsL;
    @SerializedName("Epr")
    public int epr;
    @SerializedName("Ecov")
    public int ecov;
    @SerializedName("ErnInf")
    public String ernInf;
    @SerializedName("Et")
    public int et;
    @SerializedName("EtTx")
    public String etTx;
    @SerializedName("T1")
    public List<T1> t1;
    @SerializedName("T2")
    public List<T2> t2;
    @SerializedName("IncsX")
    public int incsX;
    @SerializedName("ComX")
    public int comX;
    @SerializedName("LuX")
    public int luX;
    @SerializedName("StatX")
    public int statX;
    @SerializedName("SubsX")
    public int subsX;
    @SerializedName("SDFowX")
    public int sDFowX;
    @SerializedName("SDInnX")
    public int sDInnX;
    @SerializedName("Esd")
    public Object esd;
    @SerializedName("Ese")
    public Object ese;
    @SerializedName("Exd")
    public int exd;
    @SerializedName("LuUT")
    public long luUT;
    @SerializedName("Eds")
    public int eds;
    @SerializedName("Edf")
    public int edf;
    @SerializedName("EO")
    public int eO;
    @SerializedName("ECo")
    public String eCo;
    @SerializedName("TPa")
    public int tPa;
    @SerializedName("TCho")
    public int tCho;
    @SerializedName("Eact")
    public int eact;
    @SerializedName("Stg")
    public Stg stg;
    @SerializedName("Ehid")
    public int ehid;
    @SerializedName("Sids")
    public Sids sids;
    @SerializedName("Pid")
    public int pid;
    @SerializedName("Spid")
    public int spid;
    @SerializedName("Tr1C1")
    public int tr1C1;
    @SerializedName("Tr2C1")
    public int tr2C1;
    @SerializedName("Tr1CW1")
    public int tr1CW1;
    @SerializedName("Tr2CW1")
    public int tr2CW1;
    @SerializedName("Tr1CO1")
    public double tr1CO1;
    @SerializedName("Tr2CO1")
    public int tr2CO1;
    @SerializedName("Ebat")
    public int ebat;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public int getEsid() {
        return esid;
    }

    public void setEsid(int esid) {
        this.esid = esid;
    }

    public String getEpsL() {
        return epsL;
    }

    public void setEpsL(String epsL) {
        this.epsL = epsL;
    }

    public int getEpr() {
        return epr;
    }

    public void setEpr(int epr) {
        this.epr = epr;
    }

    public int getEcov() {
        return ecov;
    }

    public void setEcov(int ecov) {
        this.ecov = ecov;
    }

    public String getErnInf() {
        return ernInf;
    }

    public void setErnInf(String ernInf) {
        this.ernInf = ernInf;
    }

    public int getEt() {
        return et;
    }

    public void setEt(int et) {
        this.et = et;
    }

    public String getEtTx() {
        return etTx;
    }

    public void setEtTx(String etTx) {
        this.etTx = etTx;
    }

    public List<T1> getT1() {
        return t1;
    }

    public void setT1(List<T1> t1) {
        this.t1 = t1;
    }

    public List<T2> getT2() {
        return t2;
    }

    public void setT2(List<T2> t2) {
        this.t2 = t2;
    }

    public int getIncsX() {
        return incsX;
    }

    public void setIncsX(int incsX) {
        this.incsX = incsX;
    }

    public int getComX() {
        return comX;
    }

    public void setComX(int comX) {
        this.comX = comX;
    }

    public int getLuX() {
        return luX;
    }

    public void setLuX(int luX) {
        this.luX = luX;
    }

    public int getStatX() {
        return statX;
    }

    public void setStatX(int statX) {
        this.statX = statX;
    }

    public int getSubsX() {
        return subsX;
    }

    public void setSubsX(int subsX) {
        this.subsX = subsX;
    }

    public int getsDFowX() {
        return sDFowX;
    }

    public void setsDFowX(int sDFowX) {
        this.sDFowX = sDFowX;
    }

    public int getsDInnX() {
        return sDInnX;
    }

    public void setsDInnX(int sDInnX) {
        this.sDInnX = sDInnX;
    }

    public Object getEsd() {
        return esd;
    }

    public void setEsd(Object esd) {
        this.esd = esd;
    }

    public Object getEse() {
        return ese;
    }

    public void setEse(Object ese) {
        this.ese = ese;
    }

    public int getExd() {
        return exd;
    }

    public void setExd(int exd) {
        this.exd = exd;
    }

    public long getLuUT() {
        return luUT;
    }

    public void setLuUT(long luUT) {
        this.luUT = luUT;
    }

    public int getEds() {
        return eds;
    }

    public void setEds(int eds) {
        this.eds = eds;
    }

    public int getEdf() {
        return edf;
    }

    public void setEdf(int edf) {
        this.edf = edf;
    }

    public int geteO() {
        return eO;
    }

    public void seteO(int eO) {
        this.eO = eO;
    }

    public String geteCo() {
        return eCo;
    }

    public void seteCo(String eCo) {
        this.eCo = eCo;
    }

    public int gettPa() {
        return tPa;
    }

    public void settPa(int tPa) {
        this.tPa = tPa;
    }

    public int gettCho() {
        return tCho;
    }

    public void settCho(int tCho) {
        this.tCho = tCho;
    }

    public int getEact() {
        return eact;
    }

    public void setEact(int eact) {
        this.eact = eact;
    }

    public Stg getStg() {
        return stg;
    }

    public void setStg(Stg stg) {
        this.stg = stg;
    }

    public int getEhid() {
        return ehid;
    }

    public void setEhid(int ehid) {
        this.ehid = ehid;
    }

    public Sids getSids() {
        return sids;
    }

    public void setSids(Sids sids) {
        this.sids = sids;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getSpid() {
        return spid;
    }

    public void setSpid(int spid) {
        this.spid = spid;
    }

    public int getTr1C1() {
        return tr1C1;
    }

    public void setTr1C1(int tr1C1) {
        this.tr1C1 = tr1C1;
    }

    public int getTr2C1() {
        return tr2C1;
    }

    public void setTr2C1(int tr2C1) {
        this.tr2C1 = tr2C1;
    }

    public int getTr1CW1() {
        return tr1CW1;
    }

    public void setTr1CW1(int tr1CW1) {
        this.tr1CW1 = tr1CW1;
    }

    public int getTr2CW1() {
        return tr2CW1;
    }

    public void setTr2CW1(int tr2CW1) {
        this.tr2CW1 = tr2CW1;
    }

    public double getTr1CO1() {
        return tr1CO1;
    }

    public void setTr1CO1(double tr1CO1) {
        this.tr1CO1 = tr1CO1;
    }

    public int getTr2CO1() {
        return tr2CO1;
    }

    public void setTr2CO1(int tr2CO1) {
        this.tr2CO1 = tr2CO1;
    }

    public int getEbat() {
        return ebat;
    }

    public void setEbat(int ebat) {
        this.ebat = ebat;
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
