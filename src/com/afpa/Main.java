package com.afpa;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("| Instanciation Carre  de coté 4 cm      |");
        System.out.println("=========================================");

        Carre carre = new Carre(4);
        System.out.println("son aire est de "+carre.Aire()+ " cm²");


        System.out.println("=========================================");
        System.out.println("|Instanciation Cercle  de rayon 4 cm      |");
        System.out.println("=========================================");

        Cercle cercle = new Cercle(4);
        System.out.println("son aire est de "+cercle.Aire()+ " cm²");


        System.out.println("=======================================================");
        System.out.println("|  Instanciation Triangle de base et hauteur de 4cm    |");
        System.out.println("=======================================================");

        Triangle triangle =new Triangle(4,4);
        System.out.println("son aire est de "+triangle.Aire()+ " cm²");

        System.out.println("=========================================");
        System.out.println("|      Instanciation client     |");
        System.out.println("=========================================");

        Client client = new Client("Paul","Weller","Baker Street","Londres");
        Client client1 = new Client("White", "Jack","Detroit");
        Client client2 =new Client("Claypool","Les","San Fransisco");
        Client client3 =new Client("Thunders","Johnny","New York");

       ArrayList<Client> tab =new ArrayList<Client>();
        tab.add(client);
        tab.add(client1);
        tab.add(client2);
        tab.add(client2);

        String td = "| %-15s | %-15s | %-15s | %-15s |%n";

        System.out.format("+-----------------+-----------------+-----------------+-----------------+%n");
        System.out.format("| Prénom          |    Nom          |  Adresse        |   Ville         |%n");
        System.out.format("+-----------------+-----------------+-----------------+-----------------+%n");


        for (Client i : tab) {
            System.out.format(td,i.getPrenom() ,i.getNom(),
                    ( i.getAdresse() != null)?i.getAdresse():"",i.getVille());
        }

        System.out.format("+-----------------+-----------------+-----------------+-----------------+%n");

    }
}
