/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeos2.pkg0;

import java.io.File;
import java.util.Scanner;

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
        Stats st = new Stats("1", "2", "3", "4", "5", "6");
        //String nombre, String apodo, String descripcion, S String tipo, Stats stat, ArrayList<Pokemon> evoluciones, String imagen
        Pokemon pik = new Pokemon("charmander", "bolt", "dsdff,fewf", "0", "raton", "33", "muy op", "apache", "fire", st, null, null);
        Pokemon pik2 = new Pokemon("bulbasaur", "bolt", "fewf", "0", "", "33", "muy op", "apache", "dsdeerer", st, null, null);
        Pokemon pik4 = new Pokemon("sd", "bolt", "ds", "0", "", "33", "muy op", "he", "fregreregergreg", st, null, null);

        Scanner sc = new Scanner(System.in);
        String sdf;
        int opc = 0;
        System.out.println("nombre:");
        sdf = sc.next();
        Archivo ds = new Archivo(sdf);
        do {
            System.out.println("1-agregar\n2-listar\n3-elim\n4-elim\n5-salida");
            opc = sc.nextInt();
            if (opc == 1) {
                ds.agregar(pik4);
                ds.agregar(pik2);
            } else if (opc == 2) {
                ds.leer();
            } else if (opc == 3) {
                ds.erase("bulbasaur");
            } else if (opc == 4) {
                ds.delete();
            }
        } while (opc != 5);
        // ds.leerAvail();
        // System.out.println(ds.delete());
    }

}
