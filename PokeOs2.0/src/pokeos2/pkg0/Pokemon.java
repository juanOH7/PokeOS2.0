/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeos2.pkg0;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Pokemon {

    String nombre;
    String apodo;
    String descripcion;
    double altura;
    String categoria;//forma en vida real
    double peso;
    String habilidades;//drizzle, dry skin, drought, etc.
    String genero;
    String[] tipos = new String[2];
    String debilidades;
    Stats stat;   
    Pokemon evoluciones;
    Object imagen;

    public Pokemon(String nombre, String apodo, String descripcion, double altura, String categoria, double peso, String habilidades, String genero, Stats stat, Pokemon evoluciones, Object imagen) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.descripcion = descripcion;
        this.altura = altura;
        this.categoria = categoria;
        this.peso = peso;
        this.habilidades = habilidades;
        this.genero = genero;
        this.stat = stat;
        this.evoluciones = evoluciones;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String tipo1, String tipo2) {
        tipos[0] = tipo1;
        tipos[1] = tipo2;
    }

    public String getDebilidades() {
        return debilidades;
    }

    public void setDebilidades() {
        String tipo1 = tipos[0];
        String tipo2 = tipos[1];
        String x4 = "";
        String x2 = "";
        if (tipo1 == "Fairy" && tipo2 == "Steel") {
            x2 = "Fire,Ground";
        }else if(tipo1 == "Fairy" && tipo2 == "Dark"){
            x2 = "Poison,Steel,Fairy";
        }else if(tipo1 == "Fairy" && tipo2 == "Dragon"){
            x2 = "Poison,Steel,Fairy,Ice";
        }else if(tipo1 == "Fairy" && tipo2 == "Ghost"){
            x2 = "Ghost,Steel";
        }else if(tipo1 == "Fairy" && tipo2 == "Rock"){
            x2 = "Water,Grass,Ground";
            x4 = "Steel";
        }else if(tipo1 == "Fairy" && tipo2 == "Bug"){
            x2 = "Poison,Steel,Fire,Flying,Rock";
        }else if(tipo1 == "Fairy" && tipo2 == "Psychc"){
            x2 = "Poison,Steel,Ghost";
        }else if(tipo1 == "Fairy" && tipo2 == "Flying"){
            x2 = "Poison,Steel,Electric,Ice,Rock";
        }else if(tipo1 == "Fairy" && tipo2 == "Ground"){
            x2 = "Water,Grass,Ice,Steel";
        }else if(tipo1 == "Fairy" && tipo2 == "Poison"){
            x2 = "Steel,Ground,Psychc";
        }else if(tipo1 == "Fairy" && tipo2 == "Fight"){
            x2 = "Poison,Steel,Fairy,Psychc,Flying";
        }else if(tipo1 == "Fairy" && tipo2 == "Ice"){
            x2 = "Fire,Posion,Rock";
            x4 = "Steel";
        }else if(tipo1 == "Fairy" && tipo2 == "Grass"){
            x2 = "Fire,Steel,Ice,Flying";
            x4 = "Poison";
        }else if(tipo1 == "Fairy" && tipo2 == "Electric"){
            x2 = "Poison,Ground";
        }else if(tipo1 == "Fairy" && tipo2 == "Water"){
            x2 = "Poison,Grass,Electric";
        }else if(tipo1 == "Fairy" && tipo2 == "Fire"){
            x2 = "Poison,Water,Ground,Rock";
        }else if(tipo1 == "Fairy" && tipo2 == "Normal"){
            x2 = "Poison,Steel";
        }else if(tipo1 == "Steel" && tipo2 == "Dark"){
            x2 = "Fire,Ground";
            x4 = "Fighting";
        }else if(tipo1 == "Steel" && tipo2 == "Dragon"){
            x2 = "Fighting,Ground";
            x4 = "";
        }else if(tipo1 == "Steel" && tipo2 == "Ghost"){
            x2 = "Fire,Ground,Ghost,Dark";
            x4 = "";
        }else if(tipo1 == "Steel" && tipo2 == "Rock"){
            x2 = "Water";
            x4 = "Fighting,Ground";
        }else if(tipo1 == "Steel" && tipo2 == "Bug"){
            x2 = "";
            x4 = "Fire";
        }else if(tipo1 == "Steel" && tipo2 == "Psychc"){
            x2 = "Fire,Ground,Ghost,Dark";
            x4 = "";
        }else if(tipo1 == "Steel" && tipo2 == "Flying"){
            x2 = "Fire,Electric";
            x4 = "";
        }else if(tipo1 == "Steel" && tipo2 == "Ground"){
            x2 = "Fire,Water,Fighting,Ground";
            x4 = "";
        }else if(tipo1 == "Steel" && tipo2 == "Poison"){
            x2 = "Fire";
            x4 = "Ground";
        }else if(tipo1 == "Steel" && tipo2 == "Fighting"){
            x2 = "Fire,Fighting,Ground";
            x4 = "";
        }else if(tipo1 == "Steel" && tipo2 == "Ice"){
            x2 = "Ground";
            x4 = "Fire,Fighting";
        }else if(tipo1 == "Steel" && tipo2 == "Grass"){
            x2 = "Fighting";
            x4 = "Fire";
        }else if(tipo1 == "Steel" && tipo2 == "Electric"){
            x2 = "Fire,Fighting";
            x4 = "Ground";
        }else if(tipo1 == "Steel" && tipo2 == "Water"){
            x2 = "Electric,Figthing,Ground";
            x4 = "";
        }else if(tipo1 == "Steel" && tipo2 == "Fire"){
            x2 = "Water,Fighting";
            x4 = "Ground";
        }else if(tipo1 == "Steel" && tipo2 == "Normal"){
            x2 = "Fire,Ground";
            x4 = "Fighting";
        }else if(tipo1 == "Dark" && tipo2 == "Dragon"){
            x2 = "Ice,Bug,Fighting,Dragon";
            x4 = "Fairy";
        }else if(tipo1 == "Dark" && tipo2 == "Ghost"){
            x2 = "Fairy";
            x4 = "";
        }else if(tipo1 == "Dark" && tipo2 == "Rock"){
            x2 = "Water,Grass,Ground,Bug,Steel,Fairy";
            x4 = "Fighting";
        }else if(tipo1 == "Dark" && tipo2 == "Bug"){
            x2 = "Fire,Flying,Bug,Rock,Fairy";
            x4 = "";
        }else if(tipo1 == "Dark" && tipo2 == "Psychc"){
            x2 = "Fairy";
            x4 = "Bug";
        }else if(tipo1 == "Dark" && tipo2 == "Flying"){
            x2 = "Electric,Ice,Rock,Fairy";
            x4 = "";
        }else if(tipo1 == "Dark" && tipo2 == "Ground"){
            x2 = "Water,Grass,Ice,Fighting,Bug,Fairy";
            x4 = "";
        }else if(tipo1 == "Dark" && tipo2 == "Poison"){
            x2 = "Ground";
            x4 = "";
        }else if(tipo1 == "Dark" && tipo2 == "Fighting"){
            x2 = "Fighting,Flying";
            x4 = "Fairy";
        }else if(tipo1 == "Dark" && tipo2 == "Ice"){
            x2 = "Fire,Bug,Rock,Steel,Fairy";
            x4 = "Fighting";
        }else if(tipo1 == "Dark" && tipo2 == "Grass"){
            x2 = "Fire,Ice,Fighting,Poison,Flying,Fairy";
            x4 = "Bug";
        }else if(tipo1 == "Dark" && tipo2 == "Electric"){
            x2 = "Fighting,Ground,Bug,Fairy";
            x4 = "";
        }else if(tipo1 == "Dark" && tipo2 == "Water"){
            x2 = "Electric,Grass,Fighting,Bug,Fairy";
            x4 = "";
        }else if(tipo1 == "Dark" && tipo2 == "Fire"){
            x2 = "Water,Fighting,Ground,Rock";
            x4 = "";
        }else if(tipo1 == "Dark" && tipo2 == "Normal"){
            x2 = "Bug,Fairy";
            x4 = "Fighting";
        }else if(tipo1 == "Dragon" && tipo2 == "Ghost"){
            x2 = "Ice,Ghost,Dragon,Dark,Fairy";
            x4 = "";
        }else if(tipo1 == "Dragon" && tipo2 == "Rock"){
            x2 = "Ice,Fighting,Ground,Dragon,Steel,Fairy";
            x4 = "";
        }else if(tipo1 == "Dragon" && tipo2 == "Bug"){
            x2 = "Ice,Flying,Rock,Dragon,Fairy";
            x4 = "";
        }else if(tipo1 == "Dragon" && tipo2 == "Psychc"){
            x2 = "Ice,Bug,Ghost,Dragon,Dark,Fairy";
            x4 = "";
        }else if(tipo1 == "Dragon" && tipo2 == "Flying"){
            x2 = "Rock,Dragon,Fairy";
            x4 = "Ice";
        }else if(tipo1 == "Dragon" && tipo2 == "Ground"){
            x2 = "Dragon,Fairy";
            x4 = "Ice";
        }else if(tipo1 == "Dragon" && tipo2 == "Poison"){
            x2 = "Ice,Ground,Dragon,Psychc";
            x4 = "";
        }else if(tipo1 == "Dragon" && tipo2 == "Fighting"){
            x2 = "Ice,Flying,Psychc,Dragon";
            x4 = "Fairy";
        }else if(tipo1 == "Dragon" && tipo2 == "Ice"){
            x2 = "Fighting,Steel,Rock,Dragon,Fairy";
            x4 = "";
        }else if(tipo1 == "Dragon" && tipo2 == "Grass"){
            x2 = "Poison,Flying,Bug,Dragon,Fairy";
            x4 = "Ice";
        }else if(tipo1 == "Dragon" && tipo2 == "Electric"){
            x2 = "Ice,Ground,Dragon,Fairy";
            x4 = "";
        }else if(tipo1 == "Dragon" && tipo2 == "Water"){
            x2 = "Dragon,Fiary";
            x4 = "";
        }else if(tipo1 == "Dragon" && tipo2 == "Fire"){
            x2 = "Ground,Rock,Dragon";
            x4 = "";
        }else if(tipo1 == "Dragon" && tipo2 == "Normal"){
            x2 = "Ice,Fighting,Dragon,Fairy";
            x4 = "";
        }else if(tipo1 == "Ghost" && tipo2 == "Rock"){
            x2 = "Water,Grass,Ground,Ghost,Steel,Dark";
            x4 = "";
        }else if(tipo1 == "Ghost" && tipo2 == "Bug"){
            x2 = "Fire,Flying,Rock,Ghost,Dark";
            x4 = "";
        }else if(tipo1 == "Ghost" && tipo2 == "Psychc"){
            x2 = "";
            x4 = "Ghost,Dark";
        }else if(tipo1 == "Ghost" && tipo2 == "Flying"){
            x2 = "Electric,Ice,Rock,Ghost,Dark";
            x4 = "";
        }else if(tipo1 == "Ghost" && tipo2 == "Ground"){
            x2 = "Water,Grass,Ice,Ghost,Dark";
            x4 = "";
        }else if(tipo1 == "Ghost" && tipo2 == "Poison"){
            x2 = "Ground,Psychc,Ghost,Dark";
            x4 = "";
        }else if(tipo1 == "Ghost" && tipo2 == "Fighting"){
            x2 = "Flying,Psychc,Ghost,Fairy";
            x4 = "";
        }else if(tipo1 == "Ghost" && tipo2 == "Ice"){
            x2 = "Fire,Rock,Ghost,Dark,Steel";
            x4 = "";
        }else if(tipo1 == "Ghost" && tipo2 == "Grass"){
            x2 = "Fire,Ice,Flying,Ghost,Dark";
            x4 = "";
        }else if(tipo1 == "Ghost" && tipo2 == "Electric"){
            x2 = "Ground,Ghost,Dark";
            x4 = "";
        }else if(tipo1 == "Ghost" && tipo2 == "Water"){
            x2 = "Electric,Grass,Ghost,Dark";
            x4 = "";
        }else if(tipo1 == "Ghost" && tipo2 == "Fire"){
            x2 = "Water,Ground,Rock,Ghost,Dark";
            x4 = "";
        }else if(tipo1 == "Ghost" && tipo2 == "Normal"){
            x2 = "Dark";
            x4 = "";
        }
    }

    public Stats getStat() {
        return stat;
    }

    public void setStat(Stats stat) {
        this.stat = stat;
    }

    public Pokemon getEvoluciones() {
        return evoluciones;
    }

    public void setEvoluciones(Pokemon evoluciones) {
        this.evoluciones = evoluciones;
    }

    public Object getImagen() {
        return imagen;
    }

    public void setImagen(Object imagen) {
        this.imagen = imagen;
    }
    
    
}
