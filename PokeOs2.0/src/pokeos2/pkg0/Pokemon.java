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
        if (tipo1 == "Fairy") {
            x2 = "Poison,Steel";
        }else if (tipo1 == "Steel") {
            x2 = "Fire,Fighting,Ground";
        }else if (tipo1 == "Dark") {
            x2 = "Fighting,Bug,Fairy";
        }else if (tipo1 == "Dragon") {
            x2 = "Ice,Dragon,Fairy";
        }else if (tipo1 == "Ghost") {
            x2 = "Ghost,Dark";
        }else if (tipo1 == "Rock") {
            x2 = "Water,Grass,Fighting,Ground,Steel";
        }else if (tipo1 == "Bug") {
            x2 = "Fire,Flying,Rock";
        }else if (tipo1 == "Psychc") {
            x2 = "Bug,Ghost,Dark";
        }else if (tipo1 == "Flying") {
            x2 = "Electric,Ice,Rock";
        }else if (tipo1 == "Ground") {
            x2 = "Water,Grass,ice";
        }else if (tipo1 == "Poison") {
            x2 = "Ground,Psychc";
        }else if (tipo1 == "Fighting") {
            x2 = "Flying,Psychc,Fairy";
        }else if (tipo1 == "Ice") {
            x2 = "Fire,Fighting,Rock,Steel";
        }else if (tipo1 == "Grass") {
            x2 = "Fire,Ice,Poison,Flying,Bug";
        }else if (tipo1 == "Electric") {
            x2 = "Ground";
        }else if (tipo1 == "Water") {
            x2 = "Electric,Grass";
        }else if (tipo1 == "Fire") {
            x2 = "Water,Rock,Ground";
        }else if (tipo1 == "Normal") {
            x2 = "Fighting";
        }
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
        }else if(tipo1 == "Rock" && tipo2 == "Bug"){
            x2 = "Water,Rock,Steel";
            x4 = "";
        }else if(tipo1 == "Rock" && tipo2 == "Psychc"){
            x2 = "Water,Grass,Ground,Bug,Ghost,Dark,Steel";
            x4 = "";
        }else if(tipo1 == "Rock" && tipo2 == "Flying"){
            x2 = "Water,Electric,Ice,Rock,Steel";
            x4 = "";
        }else if(tipo1 == "Rock" && tipo2 == "Ground"){
            x2 = "Ice,Fighting,Ground,Steel";
            x4 = "Water,Grass";
        }else if(tipo1 == "Rock" && tipo2 == "Poison"){
            x2 = "Water,Psychc,Steel";
            x4 = "Ground";
        }else if(tipo1 == "Rock" && tipo2 == "Fighting"){
            x2 = "Water,Grass,Fighting,Ground,Psychc,Steel,Fairy";
            x4 = "";
        }else if(tipo1 == "Rock" && tipo2 == "Ice"){
            x2 = "Water,Grass,Ground,Rock";
            x4 = "Fighting,Steel";
        }else if(tipo1 == "Rock" && tipo2 == "Grass"){
            x2 = "Ice,Fighting,Bug,Steel";
            x4 = "";
        }else if(tipo1 == "Rock" && tipo2 == "Electric"){
            x2 = "Water,Grass,Fighting";
            x4 = "Ground";
        }else if(tipo1 == "Rock" && tipo2 == "Water"){
            x2 = "Electric,Fighting,Ground";
            x4 = "Grass";
        }else if(tipo1 == "Rock" && tipo2 == "Fire"){
            x2 = "Fighting,Rock";
            x4 = "Water,Ground";
        }else if(tipo1 == "Rock" && tipo2 == "Normal"){
            x2 = "Water,Grass,Ground,Steel";
            x4 = "Fighting";
        }else if(tipo1 == "Bug" && tipo2 == "Psychc"){
            x2 = "Fire,Flying,Bug,Rock,Ghost,Dark";
            x4 = "";
        }else if(tipo1 == "Bug" && tipo2 == "Flying"){
            x2 = "Fire,Electric,Ice,Flying";
            x4 = "Rock";
        }else if(tipo1 == "Bug" && tipo2 == "Ground"){
            x2 = "Fire,Water,Ice,Flying";
            x4 = "";
        }else if(tipo1 == "Bug" && tipo2 == "Poison"){
            x2 = "Fire,Flying,Psychc,Rock";
            x4 = "";
        }else if(tipo1 == "Bug" && tipo2 == "Fighting"){
            x2 = "Fire,Psychc,Fairy";
            x4 = "Flying";
        }else if(tipo1 == "Bug" && tipo2 == "Ice"){
            x2 = "Flying,Steel";
            x4 = "Fire,Rock";
        }else if(tipo1 == "Bug" && tipo2 == "Grass"){
            x2 = "Ice,Poison,Bug,Rock";
            x4 = "Fire,Flying";
        }else if(tipo1 == "Bug" && tipo2 == "Electric"){
            x2 = "Fire,Rock";
            x4 = "";
        }else if(tipo1 == "Bug" && tipo2 == "Water"){
            x2 = "Electric,Flying,Rock";
            x4 = "";
        }else if(tipo1 == "Bug" && tipo2 == "Fire"){
            x2 = "Water,Flying";
            x4 = "Rock";
        }else if(tipo1 == "Bug" && tipo2 == "Normal"){
            x2 = "Fire,Flying,Rock";
            x4 = "";
        }else if(tipo1 == "Psychc" && tipo2 == "Flying"){
            x2 = "Electric,Ice,Rock,Ghost,Dark";
            x4 = "";
        }else if(tipo1 == "Psychc" && tipo2 == "Ground"){
            x2 = "Water,Grass,Ice,Bug,Ghost,Dark";
            x4 = "";
        }else if(tipo1 == "Psychc" && tipo2 == "Poison"){
            x2 = "Ground,Ghost,Dark";
            x4 = "";
        }else if(tipo1 == "Psychc" && tipo2 == "Fighting"){
            x2 = "Flying,Ghost,Fairy";
            x4 = "";
        }else if(tipo1 == "Psychc" && tipo2 == "Ice"){
            x2 = "Fire,Bug,Rock,Ghost,Dark,Steel";
            x4 = "";
        }else if(tipo1 == "Psychc" && tipo2 == "Grass"){
            x2 = "Fire,Ice,Poison,Flying,Ghost,Dark";
            x4 = "Bug";
        }else if(tipo1 == "Psychc" && tipo2 == "Electric"){
            x2 = "Ground,Dark,Bug,Ghost,Bug";
            x4 = "";
        }else if(tipo1 == "Psychc" && tipo2 == "Water"){
            x2 = "Electric,Grass,Bug,Ghost,Dark";
            x4 = "";
        }else if(tipo1 == "Psychc" && tipo2 == "Fire"){
            x2 = "Water,Ground,Rock,Ghost,Dark";
            x4 = "";
        }else if(tipo1 == "Psychc" && tipo2 == "Normal"){
            x2 = "Bug,Dark";
            x4 = "";
        }else if(tipo1 == "Flying" && tipo2 == "Ground"){
            x2 = "Water";
            x4 = "Ice";
        }else if(tipo1 == "Flying" && tipo2 == "Poison"){
            x2 = "Electric,Ice,Psychc,Rock";
            x4 = "";
        }else if(tipo1 == "Flying" && tipo2 == "Fighting"){
            x2 = "Electric,Ice,Flying,Psychc,Fairy";
            x4 = "";
        }else if(tipo1 == "Flying" && tipo2 == "Ice"){
            x2 = "Fire,Electric,Steel";
            x4 = "Rock";
        }else if(tipo1 == "Flying" && tipo2 == "Grass"){
            x2 = "Fire,Poison,Flying,Rock";
            x4 = "Ice";
        }else if(tipo1 == "Flying" && tipo2 == "Electric"){
            x2 = "Ice,Rock";
            x4 = "";
        }else if(tipo1 == "Flying" && tipo2 == "Water"){
            x2 = "Rock";
            x4 = "Electric";
        }else if(tipo1 == "Flying" && tipo2 == "Fire"){
            x2 = "Water,Electric";
            x4 = "Rock";
        }else if(tipo1 == "Flying" && tipo2 == "Normal"){
            x2 = "Electric,Ice";
            x4 = "Rock";
        }else if(tipo1 == "Ground" && tipo2 == "Poison"){
            x2 = "Water,Ice,Ground,Psychc";
            x4 = "";
        }else if(tipo1 == "Ground" && tipo2 == "Fighting"){
            x2 = "Water,Grass,Ice,Flying,Psychc,Fairy";
            x4 = "";
        }else if(tipo1 == "Ground" && tipo2 == "Ice"){
            x2 = "Fire,Water,Grass,Fighting,Steel";
            x4 = "";
        }else if(tipo1 == "Ground" && tipo2 == "Grass"){
            x2 = "Flying,Fire,Bug";
            x4 = "Ice";
        }else if(tipo1 == "Ground" && tipo2 == "Electric"){
            x2 = "Water,Grass,Ice,Ground";
            x4 = "";
        }else if(tipo1 == "Ground" && tipo2 == "Water"){
            x2 = "";
            x4 = "Grass";
        }else if(tipo1 == "Ground" && tipo2 == "Fire"){
            x2 = "Ground";
            x4 = "Water";
        }else if(tipo1 == "Ground" && tipo2 == "Normal"){
            x2 = "Water,Grass,Ice,Fighting";
            x4 = "";
        }else if(tipo1 == "Poison" && tipo2 == "Fighting"){
            x2 = "Ground,Flying";
            x4 = "Psychc";
        }else if(tipo1 == "Poison" && tipo2 == "Ice"){
            x2 = "Fire,Ground,Psychc,Rock,Steel";
            x4 = "";
        }else if(tipo1 == "Poison" && tipo2 == "Grass"){
            x2 = "Fire,Ice,Flying,Psychc";
            x4 = "";
        }else if(tipo1 == "Poison" && tipo2 == "Electric"){
            x2 = "Psychc";
            x4 = "Ground";
        }else if(tipo1 == "Poison" && tipo2 == "Water"){
            x2 = "Electric,Ground,Psychc";
            x4 = "";
        }else if(tipo1 == "Poison" && tipo2 == "Fire"){
            x2 = "Water,Psychc,Rock";
            x4 = "Ground";
        }else if(tipo1 == "Poison" && tipo2 == "Normal"){
            x2 = "Ground,Psychc";
            x4 = "";
        }else if(tipo1 == "Fighting" && tipo2 == "Ice"){
            x2 = "Fire,Fighting,Flying,Psychc,Steel,Fairy";
            x4 = "";
        }else if(tipo1 == "Fighting" && tipo2 == "Grass"){
            x2 = "Fire,Ice,Poison,Psychc,Fairy";
            x4 = "Flying";
        }else if(tipo1 == "Fighting" && tipo2 == "Electric"){
            x2 = "Ground,Psychc,Fairy";
            x4 = "";
        }else if(tipo1 == "Fighting" && tipo2 == "Water"){
            x2 = "Electric,Grass,Flying,Psychc,Fairy";
            x4 = "";
        }else if(tipo1 == "Fighting" && tipo2 == "Fire"){
            x2 = "Water,Ground,Flying,Psychc";
            x4 = "";
        }else if(tipo1 == "Fighting" && tipo2 == "Normal"){
            x2 = "";
            x4 = "";
        }else if(tipo1 == "Ice" && tipo2 == "Grass"){
            x2 = "Fighting,Poison,Flying,Bug,Rock,Steel";
            x4 = "Fire";
        }else if(tipo1 == "Ice" && tipo2 == "Electric"){
            x2 = "Fire,Fighting,Ground,Rock";
            x4 = "";
        }else if(tipo1 == "Ice" && tipo2 == "Water"){
            x2 = "Electric,Grass,Fighting,Rock";
            x4 = "";
        }else if(tipo1 == "Ice" && tipo2 == "Fire"){
            x2 = "Water,Fighting,Ground";
            x4 = "Rock";
        }else if(tipo1 == "Ice" && tipo2 == "Normal"){
            x2 = "Fire,Rock,Steel";
            x4 = "Fighting";
        }else if(tipo1 == "Grass" && tipo2 == "Electric"){
            x2 = "Fire,Ice,Poison,Bug";
            x4 = "";
        }else if(tipo1 == "Grass" && tipo2 == "Water"){
            x2 = "Poison,Flying,Bug";
            x4 = "";
        }else if(tipo1 == "Grass" && tipo2 == "Fire"){
            x2 = "Poison,Flying,Rock";
            x4 = "";
        }else if(tipo1 == "Grass" && tipo2 == "Normal"){
            x2 = "Fire,Ice,Fighting,Poison,Flying,Bug";
            x4 = "";
        }else if(tipo1 == "Electric" && tipo2 == "Water"){
            x2 = "Grass,Ground";
            x4 = "";
        }else if(tipo1 == "Electric" && tipo2 == "Fire"){
            x2 = "Water,Rock";
            x4 = "Ground";
        }else if(tipo1 == "Electric" && tipo2 == "Normal"){
            x2 = "Fighting,Ground";
            x4 = "";
        }else if(tipo1 == "Water" && tipo2 == "Fire"){
            x2 = "Electric,Ground,Rock";
            x4 = "";
        }else if(tipo1 == "Water" && tipo2 == "Normal"){
            x2 = "Electric,Grass,Fighting";
            x4 = "";
        }else if(tipo1 == "Fire" && tipo2 == "Normal"){
            x2 = "Water,Ground,Fighting,Rock";
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
