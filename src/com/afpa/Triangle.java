package com.afpa;

public class Triangle extends Form{
    private double base;
    private double hauteur;

    public  double Aire (){
        return (double) (base*hauteur)/2;
    }

        public Triangle(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }
}
