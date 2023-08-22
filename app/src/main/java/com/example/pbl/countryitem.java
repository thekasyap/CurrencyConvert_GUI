package com.example.pbl;

public class countryitem {

    String countryname;
    int countryf;

    public countryitem(String countryname,int countryf){
        this.countryname=countryname;
        this.countryf=countryf;

    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public int getCountryf() {
        return countryf;
    }

    public void setCountryf(int countryf) {
        this.countryf = countryf;
    }
}
