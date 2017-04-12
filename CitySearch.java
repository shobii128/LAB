/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.City;

import java.io.*;

/**
 * @author Shoaib
 */
public class CitySearch {

    private static CityDAO cityDAO = new CityDAO();

    private static void populateDB() {
        try {
            // Open the input file
            FileInputStream fstream = new FileInputStream("src/main/resources/GeoLiteCity-Location.csv");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            // Read file line by line
            String strLine;
            while ((strLine = br.readLine()) != null) {
                // Create a new city
                City city = new City();

                // TODO: Parse line to set City object
                System.out.println(strLine);

                // Persist object
                cityDAO.save(city);
            }

            // Close the input stream
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // if (this-is-the-first-run) {
            // TODO: Populate database only if this is the first execution of program
            populateDB();
        // }

        // else {
            // TODO: Add other lab tasks here
        // }

    }

}
