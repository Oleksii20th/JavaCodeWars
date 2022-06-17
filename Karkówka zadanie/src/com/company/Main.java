package com.company;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("Wasington", "USA");
        map.put("London", "Anglia");
        map.put("Kyiv", "Ukraine");
        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
        String stolica;
        do {
            System.out.println("Podaj stolicę :");
            stolica = c.readLine();
            String kontynent = (String)(map.get(stolica));
            System.out.println(kontynent !=null ? kontynent : "Nie ma takiej stolicy");

        }while (!stolica.equalsIgnoreCase("koniec"));

        /*Map<String, AtlasPanstw> map = new HashMap<>();
        Map
        map.put("USA", "Anglia");
        map.put("Anglia", );
        map.put("Bialoruś",);*/

    }
}
class OpisPanstwa {
    String stolica;
    String kontynent;

    public OpisPanstwa(String stolica, String kontynent) {
        this.stolica = stolica;
        this.kontynent = kontynent;
    }

    @Override
    public String toString() {
        return "OpisPanstwa{" +
                "stolica='" + stolica + '\'' +
                ", kontynent='" + kontynent + '\'' +
                '}';
    }
}
class AtlasPanstw {
    Map<String, OpisPanstwa> MAPA = new HashMap() {
    };
   public String znajdzPanstwoPoStolicy (String stolica) throws IOException {
       do {
           Map<String, String> map = new HashMap<>();
           map.put("Wasington", "USA");
           map.put("London", "Anglia");
           map.put("Kyiv", "Ukraine");
           BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Podaj stolicę :");
           stolica = c.readLine();
           String kontynent = (String)(map.get(stolica));
           System.out.println(kontynent !=null ? kontynent : "Nie ma takiej stolicy");

       }while (!stolica.equalsIgnoreCase("koniec"));
       return stolica;
    }
    @Override
    public String toString() {
        return "AtlasPanstw{" +
                "MAPA=" + MAPA +
                '}';
    }
}

