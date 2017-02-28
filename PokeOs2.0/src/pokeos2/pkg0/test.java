/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeos2.pkg0;

/**
 *
 * @author Juan O'Hara
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stats st = new Stats(1, 2, 3, 4, 5, 6);
        Pokemon pik = new Pokemon("charmander", "bolt", "dsdff,fewf", 0, "raton", 0, "muy op", "apache", st, null, null);
        pik.setTipos("fuego", null);
        Pokemon pik2 = new Pokemon("squirtle", "bolt", "dsdff,fewef,fewf", 0, "raton", 0, "muy op", "apache", st, null, null);
        pik2.setTipos("agua", null);
        Pokemon pik3 = new Pokemon("golem", "bolt", "fewf", 0, "raton", 0, "muy op", "apache", st, null, null);
        pik3.setTipos("roca", null);
        Pokemon pik4 = new Pokemon("bulbasaur", "bolt", "fewf", 0, "raton", 0, "muy op", "apache", st, null, null);
        pik4.setTipos("hierva", null);
        Archivo ds = new Archivo();
        ds.agregar(pik);
        ds.agregar(pik2);
        ds.agregar(pik3);
        ds.agregar(pik4);
        ds.leer();
        ds.erase(3);
        ds.erase(0);
        ds.erase(2);
        System.out.println("-------");
        ds.leer();
        ds.leerAvail();
        System.out.println(ds.delete());
    }

}
