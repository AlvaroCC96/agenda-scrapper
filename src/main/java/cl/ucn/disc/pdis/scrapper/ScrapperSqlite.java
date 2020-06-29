/*
 * Copyright (c) 2020. This is only for education, do not use in production. GG
 *
 * Alvaro Lucas Castillo Calabacero
 * alvarolucascc96@gmail.com
 */

package cl.ucn.disc.pdis.scrapper;


import cl.ucn.disc.pdis.scrapper.BD.Academic;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class ScrapperSqlite {

    /**
     * The Logger
     */
    public static Logger logger = LoggerFactory.getLogger(ScrapperSqlite.class);

    /**
     * Url to scrapping
     */
    final String URL = "http://online.ucn.cl/directoriotelefonicoemail/fichaGenerica/?cod=";

    /**
     * scrapping variables
     */
    Document doc;
    String name;
    String position;
    String unit;
    String email;
    String phone;
    String office;
    String address;

    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    /**
     * get academic with scrapping
     *
     * @param id
     * @return
     */
    private Academic scrapping(int id) {
        try {
            this.doc = Jsoup.connect(URL + id).get();
            name = doc.getElementById("lblNombre").text();
            position = doc.getElementById("lblCargo").text();
            unit = doc.getElementById("lblUnidad").text();
            email = doc.getElementById("lblEmail").text();
            phone = doc.getElementById("lblTelefono").text();
            office = doc.getElementById("lblOficina").text();
            address = doc.getElementById("lblDireccion").text();

            /**
             * Micro-optimization
             */
            if (!name.isEmpty()) {
                Academic academic = new Academic(id, name, position, unit, email, phone, office, address);
                logger.debug("Academic: " + academic.toString());
                return academic;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
