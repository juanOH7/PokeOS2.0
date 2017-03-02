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
                reader2.useDelimiter("#");
                String f[] = new String[2];
                if (reader2.hasNext()) {
                    availist = new PrioQueue();
                    String temp = reader2.next();
                    StringBuilder temp2 = new StringBuilder(temp);
                    temp2.deleteCharAt(temp.length() - 1);
                    temp = String.valueOf(temp2);
                    f = temp.split("-");
                    int pos = Integer.valueOf(f[0]), tam = Integer.valueOf(f[1]);
                    availist.insert(pos, tam);
                } else {
                    System.out.println("creado vacio");
                    availist = new PrioQueue();
                }
            } else {
                System.out.println("creado no existe");
                availist = new PrioQueue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            temp += (registro.tipos + delimC);
            temp += (String.valueOf(registro.stat.hp) + delimC);
            temp += (String.valueOf(registro.stat.atk) + delimC);
            temp += (String.valueOf(registro.stat.Def) + delimC);
            temp += (String.valueOf(registro.stat.spcatk) + delimC);
            temp += (String.valueOf(registro.stat.spcdef) + delimC);
            temp += (String.valueOf(registro.stat.speed) + delimC);
            if (registro.getEvoluciones() != null) {
                for (int i = 0; i < registro.getEvoluciones().size(); i++) {
                    if (registro.evoluciones != null) {
                        temp += (registro.evoluciones.get(i).nombre + delimC);
                    } else {
                        temp += ("null" + delimC);
                    }
                }
            }
            if (registro.imagen != null) {
                temp += (registro.imagen + delimC);
            } else {
                temp += ("null" + delimC);

            }
            System.out.println(registro.nombre);
            temp += (String.valueOf(delimR));
            boolean Space;
            int tam = temp.length() - 1;
            System.out.println(tam);
            System.out.println(availist.peekTam());
            Space = tam > availist.peekTam();
            System.out.println(Space + "fff");
            if (availist.isEmpty()) {
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
            } else if (Space) {
                System.out.println("entra" + registro.nombre);
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
                FileWriter fw3 = new FileWriter(elim);
                BufferedWriter bw3 = new BufferedWriter(fw3);
                int PosEscr = availist.peek();
                PrioQueue.node tempd = availist.dequeue();
                int sobra = tempd.getPriority() - temp.length();
                if (sobra > 0) {
                    int posNue = PosEscr + temp.length();
                    availist.insert(posNue, sobra);
                    for (int i = 1; i <= availist.size(); i++) {
                        bw3.write(availist.get(i).toString() + "#");
                    }
                }
                ra.seek(PosEscr);
                ra.writeBytes(temp);
                ra.close();
                numReg++;
                bw3.flush();
                bw3.close();
                bf2.write(String.valueOf(numReg));
                bf2.flush();
                bf2.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList leer() {
        ArrayList<Pokemon> ret = new ArrayList<>();
        try {
            Scanner reader = new Scanner(archivo);
            reader.useDelimiter(String.valueOf(delimR));
            int i = 0;
            if (!reader.hasNext()) {
                return null;
            }
            while (reader.hasNext()) {
                //lid.add(reader.next());
                String temp = reader.next();
                String ds[] = new String[20];
                if (!temp.contains("*") && temp.length() > 10) {
                    ds = temp.split("\\|");
                    Pokemon tmp = new Pokemon(ds[0], ds[1], ds[2],
                            ds[3], ds[4], ds[5], ds[6],
                            ds[7], ds[8],
                            new Stats(ds[9], ds[10], ds[11], ds[12], ds[13], ds[14]), null, ds[15]);
                    ret.add(tmp);
                }
            }
            reader.close();
        } catch (Exception e) {
        }
        return ret;
    }

    public void erase(String target) {
        try {
            System.out.println("Prin");
            System.out.println(target);
            boolean found = false;
            FileWriter fw = new FileWriter(elim);
            BufferedWriter bf = new BufferedWriter(fw);
            RandomAccessFile wf = new RandomAccessFile(archivo, "rw");
            Scanner reader = new Scanner(archivo);
            reader.useDelimiter(String.valueOf(delimR));
            int cont = 0, longd = 0;
            if (!reader.hasNext()) {
                return;
            }
            String temp = "";
            while (reader.hasNext() && !found) {
                temp = reader.next();
                if (temp.contains(target)) {
                    found = true;
                }
                if (!found) {
                    longd += temp.length();
                    cont++;
                }
            }
            if (found) {
                System.out.println(found + "22");
                longd += cont;
                System.out.println(availist.isEmpty() + "list");
                availist.insert(longd, temp.length());
                System.out.println(availist.isEmpty() + "list");
                for (int i = 1; i <= availist.size(); i++) {
                    System.out.println("insert");
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
            }
            reader.close();
            bf.flush();
            bf.close();
            wf.close();
            System.out.println("Fin");
        } catch (Exception e) {
            e.printStackTrace();
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
