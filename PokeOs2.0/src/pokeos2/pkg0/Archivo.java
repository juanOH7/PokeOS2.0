/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeos2.pkg0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan O'Hara
 */
public class Archivo {

    private final char delimR = '#';
    private final char delimC = '|';
    private File archivo, elim;
    private PrioQueue availist;

    public Archivo() {
        archivo = new File("pokem.txt");
        elim = new File("elim.txt");
        availist = new PrioQueue();
    }

    public void agregar(Pokemon registro) {
        try {
            FileWriter wf;
            if (availist.isEmpty()) {
                wf = new FileWriter(archivo, true);
                BufferedWriter bf = new BufferedWriter(wf);
                bf.write(registro.nombre + delimC);
                bf.write(registro.apodo + delimC);
                bf.write(registro.descripcion + delimC);
                bf.write(String.valueOf(registro.altura) + delimC);
                bf.write(registro.categoria + delimC);
                bf.write(String.valueOf(registro.peso) + delimC);
                bf.write(registro.habilidades + delimC);
                bf.write(registro.genero + delimC);
                if (registro.tipos[1] != null) {
                    bf.write(registro.tipos[0] + delimC);
                    bf.write(registro.tipos[1] + delimC);
                } else {
                    bf.write(registro.tipos[0] + delimC);
                }
                bf.write(String.valueOf(registro.stat.hp) + delimC);
                bf.write(String.valueOf(registro.stat.atk) + delimC);
                bf.write(String.valueOf(registro.stat.Def) + delimC);
                bf.write(String.valueOf(registro.stat.spcatk) + delimC);
                bf.write(String.valueOf(registro.stat.spcdef) + delimC);
                bf.write(String.valueOf(registro.stat.speed) + delimC);
                if (registro.evoluciones != null) {
                    bf.write(registro.evoluciones.nombre + delimC);
                } else {
                    bf.write("null" + delimC);
                }
                bf.write("numIMg" + delimC);
                bf.write(delimR);
                bf.flush();
                bf.close();
            }
        } catch (Exception e) {
        }
    }

    public void leer() {
        try {
            ArrayList<String> lid = new ArrayList<>();
            Scanner reader = new Scanner(archivo);
            reader.useDelimiter(String.valueOf(delimR));
            int i = 0;
            while (reader.hasNext()) {
                //lid.add(reader.next());

                String temp = reader.next();
                if (!temp.contains("*")) {
                    System.out.println(temp);
                }
            }
            /*
            while (i != lid.size()) {
                String f[] = lid.get(i).split("\\|");
                int d = 0;
                while (d != f.length) {
                    System.out.print(f[d] +" ");
                    d++;
                }
                System.out.println("");
                i++;
            }*/
            reader.close();
        } catch (Exception e) {
        }
    }

    public void erase(int pos) {
        try {
            FileWriter fw = new FileWriter(elim);
            BufferedWriter bf = new BufferedWriter(fw);
            RandomAccessFile wf = new RandomAccessFile(archivo, "rw");
            Scanner reader = new Scanner(archivo);
            reader.useDelimiter(String.valueOf(delimR));
            int cont = 0, longd = 0;
            String tmp;
            while (reader.hasNext() && cont < pos) {
                longd += reader.next().length();
                cont++;
            }
            availist.insert(pos, reader.next().length());
            for (int i = 1; i <= availist.size(); i++) {
                bf.write(availist.get(i).toString() + "\n");
            }
            longd += cont;
            wf.seek(longd);
            wf.writeChars("*");
            reader.close();
            bf.flush();
            bf.close();
            wf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean delete() {
        return archivo.delete();
    }

    public void leerAvail() {
        int size = availist.size();
        for (int i = 0; i < size; i++) {
            System.out.println(availist.dequeue());
        }
    }
}
