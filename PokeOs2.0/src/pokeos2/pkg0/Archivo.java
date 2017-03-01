/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeos2.pkg0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan O'Hara
 */
public class Archivo {

    private final char delimR = '#';
    private final char delimC = '|';
    private File archivo, elim, header;
    private int numReg;
    private PrioQueue availist;

    public Archivo(String path) {
        Path paths = Paths.get("./" + path);
        //if directory exists?
        if (!Files.exists(paths)) {
            try {
                Files.createDirectories(paths);
            } catch (IOException e) {
                //fail to create directory
                e.printStackTrace();
            }
        }
        archivo = new File("./" + path + "/pokem.txt");
        elim = new File("./" + path + "/elim.txt");
        header = new File("./" + path + "/head.txt");
        try {
            if (header.exists()) {
                Scanner reader = new Scanner(header);
                if (reader.hasNext()) {
                    int val = Integer.valueOf(reader.next());
                    numReg = val;
                }
            } else {
                numReg = 0;
            }
            if (elim.exists()) {
                Scanner reader2 = new Scanner(elim);
                String f[] = new String[2];
                if (reader2.hasNext()) {
                    String temp = reader2.next();
                    StringBuilder temp2 = new StringBuilder(temp);
                    temp2.deleteCharAt(temp.length() - 1);
                    temp = String.valueOf(temp2);
                    f = temp.split("-");
                    availist.insert(Integer.valueOf(f[0]), Integer.valueOf(f[1]));
                }
            }
        } catch (FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }
        availist = new PrioQueue();
    }

    public Archivo() {
        archivo = new File("users.txt");
        elim = new File("elim.txt");
        header = new File("head.txt");
        try {
            if (header.exists()) {
                Scanner reader = new Scanner(header);
                if (reader.hasNext()) {
                    int val = Integer.valueOf(reader.next());
                    numReg = val;
                }
            } else {
                numReg = 0;
            }
            if (elim.exists()) {
                Scanner reader2 = new Scanner(elim);
                String f[] = new String[2];
                if (reader2.hasNext()) {
                    String temp = reader2.next();
                    StringBuilder temp2 = new StringBuilder(temp);
                    temp2.deleteCharAt(temp.length() - 1);
                    temp = String.valueOf(temp2);
                    f = temp.split("-");
                    availist.insert(Integer.valueOf(f[0]), Integer.valueOf(f[1]));
                }
            }
        } catch (FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }
        availist = new PrioQueue();
    }

    public void agregar(Pokemon registro) {
        try {
            FileWriter wf;
            String temp = "";
            temp += registro.nombre + delimC;
            temp += (registro.apodo + delimC);
            temp += (registro.descripcion + delimC);
            temp += (String.valueOf(registro.altura) + delimC);
            temp += (registro.categoria + delimC);
            temp += (String.valueOf(registro.peso) + delimC);
            temp += (registro.habilidades + delimC);
            temp += (registro.genero + delimC);
            if (registro.tipos[1] != null) {
                temp += (registro.tipos[0] + delimC);
                temp += (registro.tipos[1] + delimC);
            } else {
                temp += (registro.tipos[0] + delimC);
            }
            temp += (String.valueOf(registro.stat.hp) + delimC);
            temp += (String.valueOf(registro.stat.atk) + delimC);
            temp += (String.valueOf(registro.stat.Def) + delimC);
            temp += (String.valueOf(registro.stat.spcatk) + delimC);
            temp += (String.valueOf(registro.stat.spcdef) + delimC);
            temp += (String.valueOf(registro.stat.speed) + delimC);
            if (registro.evoluciones != null) {
                temp += (registro.evoluciones.nombre + delimC);
            } else {
                temp += ("null" + delimC);
            }
            temp += ("numIMg" + delimC);
            temp += (String.valueOf(delimR));
            boolean noSpace = false;
            int tam = temp.length() - 1;
            noSpace = tam > availist.peek();
            if (availist.isEmpty() || noSpace) {
                wf = new FileWriter(archivo, true);
                BufferedWriter bf = new BufferedWriter(wf);
                FileWriter wf2 = new FileWriter(header);
                BufferedWriter bf2 = new BufferedWriter(wf2);
                bf.write(temp);
                numReg++;
                bf2.write(String.valueOf(numReg));
                bf2.flush();
                bf2.close();
                bf.flush();
                bf.close();
            } else {
                RandomAccessFile ra = new RandomAccessFile(archivo, "rw");
                FileWriter wf2 = new FileWriter(header);
                BufferedWriter bf2 = new BufferedWriter(wf2);
                ra.seek(availist.dequeue());
                ra.writeBytes(temp);
                ra.close();
                numReg++;
                bf2.write(String.valueOf(numReg));
                bf2.flush();
                bf2.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void agregar(Perfil persona) {
        try {

        } catch (Exception e) {
        }
    }

    public void leer() {
        try {
            ArrayList<String> lid = new ArrayList<>();
            Scanner reader = new Scanner(archivo);
            reader.useDelimiter(String.valueOf(delimR));
            int i = 0;
            if (!reader.hasNext()) {
                return;
            }
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
            if (pos > numReg) {
                return;
            }
            FileWriter fw = new FileWriter(elim);
            BufferedWriter bf = new BufferedWriter(fw);
            RandomAccessFile wf = new RandomAccessFile(archivo, "rw");
            Scanner reader = new Scanner(archivo);
            reader.useDelimiter(String.valueOf(delimR));
            int cont = 0, longd = 0;
            String tmp;
            if (!reader.hasNext()) {
                return;
            }
            while (reader.hasNext() && cont < pos) {
                longd += reader.next().length();
                cont++;
            }
            longd += cont;
            availist.insert(longd, reader.next().length());
            for (int i = 1; i <= availist.size(); i++) {
                bf.write(availist.get(i).toString() + "#");
            }
            wf.seek(longd);
            wf.writeByte(42);
            numReg--;
            FileWriter wff = new FileWriter(header);
            BufferedWriter bf2 = new BufferedWriter(wff);
            bf2.write(String.valueOf(numReg));
            bf2.flush();
            bf2.close();
            reader.close();
            bf.flush();
            bf.close();
            wf.close();
        } catch (Exception e) {
        }
    }

    public void delete() {
        elim.delete();
        header.delete();
        archivo.delete();
    }

    public void leerAvail() {
        int size = availist.size();
        for (int i = 0; i < size; i++) {
            System.out.println(availist.dequeue());
        }
    }
}
