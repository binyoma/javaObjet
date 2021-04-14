package com.afpa;

public class Cercle extends Form{
    private double rayon;

    public  double Aire (){
        return (float) Math.PI*Math.pow(rayon,2);
    }

    public Cercle(double rayon) {
        this.rayon = rayon;
    }
}
