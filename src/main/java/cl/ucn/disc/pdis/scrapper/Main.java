/*
 * Copyright (c) 2020. This is only for education, do not use in production. GG
 *
 * Alvaro Lucas Castillo Calabacero
 * alvarolucascc96@gmail.com
 */

package cl.ucn.disc.pdis.scrapper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.util.Random;

import java.io.IOException;

public class Main {
    /**
     * Main
     * @param args
     * @throws IOException
     */
    public static void main (String[] args) throws IOException {

        /*int delta = 50;
        int ini = 29663-50;
        int fin = 29663+50;
        Random r = new Random();
        for (int i = ini; i<=fin;i++){

            Document doc = Jsoup.connect("http://online.ucn.cl/directoriotelefonicoemail/fichaGenerica/?cod="+i).get();
            Element lblNombre =  doc.getElementById("lblNombre");
            Element lblCargo =  doc.getElementById("lblCargo");

            System.out.println("Nombre: "+lblNombre.text());
            System.out.println("Cargo: "+lblCargo.text());

            try {
                Thread.sleep(1000+r.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
    }

}
