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
import org.jsoup.select.Elements;

import java.util.Random;

import java.io.IOException;

public class Main {
    /**
     * Main
     * @param args args
     * @throws IOException e
     */
    public static void main (String[] args) throws IOException {

        /**
         * Url for principal scrapping
         */
        String URL ="http://online.ucn.cl/directoriotelefonicoemail/fichaGenerica/?cod=";

        /**
        id's from academics
         */
        int ini = 21;
        int end = 29730; //this is the last
        Random random = new Random(); //for delay

        /**
         * scrapping variables
         */
        Document doc;
        Element lblNombre;
        Element lblCargo;
        Element lblUnidad;
        Element lblEmail;
        Element lblTelefono;
        Element lblOficina ;
        Element lblDireccion ;

        for (int i=ini ; i <=30;i++) { //TODO: change 30 with VAR "end"
            doc = Jsoup.connect(URL+i).get();

            lblNombre =  doc.getElementById("lblNombre");
            lblCargo =  doc.getElementById("lblCargo");
            lblUnidad =  doc.getElementById("lblUnidad");
            lblEmail =  doc.getElementById("lblEmail");
            lblTelefono =  doc.getElementById("lblTelefono");
            lblOficina =  doc.getElementById("lblOficina");
            lblDireccion =  doc.getElementById("lblDireccion");

            /**
             * ignore this element if the name is void.
             */
            if (lblNombre.text().isEmpty()) {
                continue;
            }
            /**
             * Delay for secutiry
             */
            try {
                Thread.sleep(1000+random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
