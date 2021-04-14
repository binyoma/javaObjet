package com.afpa;

import static java.lang.Math.pow;

public class Carre extends Form{
    private double cote;

    public  double Aire (){
        return (float) Math.pow(cote,2);
    }

    public Carre(double cote) {
        this.cote = cote;
    }
}
