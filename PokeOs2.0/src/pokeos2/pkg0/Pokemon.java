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
    String tipos;
    String x2;
    String x4;
    Stats stat;   
    ArrayList<Pokemon> evoluciones = new ArrayList();
    String imagen;

    public Pokemon(String nombre, String apodo, String descripcion, String altura, String categoria, String peso, String habilidades, String genero, String tipo, Stats stat, ArrayList<Pokemon> evoluciones, String imagen) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.descripcion = descripcion;
        this.altura = Double.valueOf(altura);
        this.categoria = categoria;
        this.peso = Double.valueOf(peso);
        this.habilidades = habilidades;
        this.tipos = tipo;
        this.genero = genero;
        this.stat = stat;
        this.evoluciones = evoluciones;
        this.imagen = imagen;
        setDebilidades();
    }

    public ArrayList<Pokemon> getEvoluciones() {
        return evoluciones;
    }

    public void addEvoluciones(Pokemon evolucion) {
        evoluciones.add(evolucion);
    }

    public void setEvoluciones(ArrayList<Pokemon> evoluciones) {
        this.evoluciones = evoluciones;
    }
    
    
    
    

    public Pokemon(String nombre) {
        this.nombre = nombre;
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

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipo) {
        tipos = tipo;
    }

    public String getX2() {
        return x2;
    }

    public void setX2(String x2) {
        this.x2 = x2;
    }

    public String getX4() {
        return x4;
    }

    public void setX4(String x4) {
        this.x4 = x4;
    }
    

    public final void setDebilidades() {
        if (tipos.contains("Fairy")) {
            x2 = "Poison,Steel";
        }else if (tipos.contains("Steel")) {
            x2 = "Fire,Fighting,Ground";
        }else if (tipos.contains("Dark")) {
            x2 = "Fighting,Bug,Fairy";
        }else if (tipos.contains("Dragon")) {
            x2 = "Ice,Dragon,Fairy";
        }else if (tipos.contains("Ghost")) {
            x2 = "Ghost,Dark";
        }else if (tipos.contains("Rock")) {
            x2 = "Water,Grass,Fighting,Ground,Steel";
        }else if (tipos.contains("Bug")) {
            x2 = "Fire,Flying,Rock";
        }else if (tipos.contains("Psychc")) {
            x2 = "Bug,Ghost,Dark";
        }else if (tipos.contains("Flying")) {
            x2 = "Electric,Ice,Rock";
        }else if (tipos.contains("Ground")) {
            x2 = "Water,Grass,ice";
        }else if (tipos.contains("Poison")) {
            x2 = "Ground,Psychc";
        }else if (tipos.contains("Fighting")) {
            x2 = "Flying,Psychc,Fairy";
        }else if (tipos.contains("Ice")) {
            x2 = "Fire,Fighting,Rock,Steel";
        }else if (tipos.contains("Grass")) {
            x2 = "Fire,Ice,Poison,Flying,Bug";
        }else if (tipos.contains("Electric")) {
            x2 = "Ground";
        }else if (tipos.contains("Water")) {
            x2 = "Electric,Grass";
        }else if (tipos.contains("Fire")) {
            x2 = "Water,Rock,Ground";
        }else if (tipos.contains("Normal")) {
            x2 = "Fighting";
        }
        if (tipos.contains("Fairy") && tipos.contains("Steel")) {
            x2 = "Fire,Ground";
        }else if(tipos.contains("Fairy") && tipos.contains("Dark")){
            x2 = "Poison,Steel,Fairy";
        }else if(tipos.contains("Fairy") && tipos.contains("Dragon")){
            x2 = "Poison,Steel,Fairy,Ice";
        }else if(tipos.contains("Fairy") && tipos.contains("Ghost")){
            x2 = "Ghost,Steel";
        }else if(tipos.contains("Fairy") && tipos.contains("Rock")){
            x2 = "Water,Grass,Ground";
            x4 = "Steel";
        }else if(tipos.contains("Fairy") && tipos.contains("Bug")){
            x2 = "Poison,Steel,Fire,Flying,Rock";
        }else if(tipos.contains("Fairy") && tipos.contains("Psychc")){
            x2 = "Poison,Steel,Ghost";
        }else if(tipos.contains("Fairy") && tipos.contains("Flying")){
            x2 = "Poison,Steel,Electric,Ice,Rock";
        }else if(tipos.contains("Fairy") && tipos.contains("Ground")){
            x2 = "Water,Grass,Ice,Steel";
        }else if(tipos.contains("Fairy") && tipos.contains("Poison")){
            x2 = "Steel,Ground,Psychc";
        }else if(tipos.contains("Fairy") && tipos.contains("Fighting")){
            x2 = "Poison,Steel,Fairy,Psychc,Flying";
        }else if(tipos.contains("Fairy") && tipos.contains("Ice")){
            x2 = "Fire,Posion,Rock";
            x4 = "Steel";
        }else if(tipos.contains("Fairy") && tipos.contains("Grass")){
            x2 = "Fire,Steel,Ice,Flying";
            x4 = "Poison";
        }else if(tipos.contains("Fairy") && tipos.contains("Electric")){
            x2 = "Poison,Ground";
        }else if(tipos.contains("Fairy") && tipos.contains("Water")){
            x2 = "Poison,Grass,Electric";
        }else if(tipos.contains("Fairy") && tipos.contains("Fire")){
            x2 = "Poison,Water,Ground,Rock";
        }else if(tipos.contains("Fairy") && tipos.contains("Normal")){
            x2 = "Poison,Steel";
        }else if(tipos.contains("Steel") && tipos.contains("Dark")){
            x2 = "Fire,Ground";
            x4 = "Fighting";
        }else if(tipos.contains("Steel") && tipos.contains("Dragon")){
            x2 = "Fighting,Ground";
            x4 = "";
        }else if(tipos.contains("Steel") && tipos.contains("Ghost")){
            x2 = "Fire,Ground,Ghost,Dark";
            x4 = "";
        }else if(tipos.contains("Steel") && tipos.contains("Rock")){
            x2 = "Water";
            x4 = "Fighting,Ground";
        }else if(tipos.contains("Steel") && tipos.contains("Bug")){
            x2 = "";
            x4 = "Fire";
        }else if(tipos.contains("Steel") && tipos.contains("Psychc")){
            x2 = "Fire,Ground,Ghost,Dark";
            x4 = "";
        }else if(tipos.contains("Steel") && tipos.contains("Flying")){
            x2 = "Fire,Electric";
            x4 = "";
        }else if(tipos.contains("Steel") && tipos.contains("Ground")){
            x2 = "Fire,Water,Fighting,Ground";
            x4 = "";
        }else if(tipos.contains("Steel") && tipos.contains("Poison")){
            x2 = "Fire";
            x4 = "Ground";
        }else if(tipos.contains("Steel") && tipos.contains("Fighting")){
            x2 = "Fire,Fighting,Ground";
            x4 = "";
        }else if(tipos.contains("Steel") && tipos.contains("Ice")){
            x2 = "Ground";
            x4 = "Fire,Fighting";
        }else if(tipos.contains("Steel") && tipos.contains("Grass")){
            x2 = "Fighting";
            x4 = "Fire";
        }else if(tipos.contains("Steel") && tipos.contains("Electric")){
            x2 = "Fire,Fighting";
            x4 = "Ground";
        }else if(tipos.contains("Steel") && tipos.contains("Water")){
            x2 = "Electric,Figthing,Ground";
            x4 = "";
        }else if(tipos.contains("Steel") && tipos.contains("Fire")){
            x2 = "Water,Fighting";
            x4 = "Ground";
        }else if(tipos.contains("Steel") && tipos.contains("Dark")){
            x2 = "Fire,Ground";
            x4 = "Fighting";
        }else if(tipos.contains("Dark") && tipos.contains("Dragon")){
            x2 = "Ice,Bug,Fighting,Dragon";
            x4 = "Fairy";
        }else if(tipos.contains("Dark") && tipos.contains("Ghost")){
            x2 = "Fairy";
            x4 = "";
        }else if(tipos.contains("Dark") && tipos.contains("Rock")){
            x2 = "Water,Grass,Ground,Bug,Steel,Fairy";
            x4 = "Fighting";
        }else if(tipos.contains("Dark") && tipos.contains("Bug")){
            x2 = "Fire,Flying,Bug,Rock,Fairy";
            x4 = "";
        }else if(tipos.contains("Dark") && tipos.contains("Psychc")){
            x2 = "Fairy";
            x4 = "Bug";
        }else if(tipos.contains("Dark") && tipos.contains("Flying")){
            x2 = "Electric,Ice,Rock,Fairy";
            x4 = "";
        }else if(tipos.contains("Dark") && tipos.contains("Ground")){
            x2 = "Water,Grass,Ice,Fighting,Bug,Fairy";
            x4 = "";
        }else if(tipos.contains("Dark") && tipos.contains("Poison")){
            x2 = "Ground";
            x4 = "";
        }else if(tipos.contains("Dark") && tipos.contains("Fighting")){
            x2 = "Fighting,Flying";
            x4 = "Fairy";
        }else if(tipos.contains("Dark") && tipos.contains("Ice")){
            x2 = "Fire,Bug,Rock,Steel,Fairy";
            x4 = "Fighting";
        }else if(tipos.contains("Dark") && tipos.contains("Grass")){
            x2 = "Fire,Ice,Fighting,Poison,Flying,Fairy";
            x4 = "Bug";
        }else if(tipos.contains("Dark") && tipos.contains("Electric")){
            x2 = "Fighting,Ground,Bug,Fairy";
            x4 = "";
        }else if(tipos.contains("Dark") && tipos.contains("Water")){
            x2 = "Electric,Grass,Fighting,Bug,Fairy";
            x4 = "";
        }else if(tipos.contains("Dark") && tipos.contains("Fire")){
            x2 = "Water,Fighting,Ground,Rock";
            x4 = "";
        }else if(tipos.contains("Dark") && tipos.contains("Normal")){
            x2 = "Bug,Fairy";
            x4 = "Fighting";
        }else if(tipos.contains("Dragon") && tipos.contains("Ghost")){
            x2 = "Ice,Ghost,Dragon,Dark,Fairy";
            x4 = "";
        }else if(tipos.contains("Dragon") && tipos.contains("Rock")){
            x2 = "Ice,Fighting,Ground,Dragon,Steel,Fairy";
            x4 = "";
        }else if(tipos.contains("Dragon") && tipos.contains("Bug")){
            x2 = "Ice,Flying,Rock,Dragon,Fairy";
            x4 = "";
        }else if(tipos.contains("Dragon") && tipos.contains("Psychc")){
            x2 = "Ice,Bug,Ghost,Dragon,Dark,Fairy";
            x4 = "";
        }else if(tipos.contains("Dragon") && tipos.contains("Flying")){
            x2 = "Rock,Dragon,Fairy";
            x4 = "Ice";
        }else if(tipos.contains("Dragon") && tipos.contains("Ground")){
            x2 = "Dragon,Fairy";
            x4 = "Ice";
        }else if(tipos.contains("Dragon") && tipos.contains("Poison")){
            x2 = "Ice,Ground,Dragon,Psychc";
            x4 = "";
        }else if(tipos.contains("Dragon") && tipos.contains("Fighting")){
            x2 = "Ice,Flying,Psychc,Dragon";
            x4 = "Fairy";
        }else if(tipos.contains("Dragon") && tipos.contains("Ice")){
            x2 = "Fighting,Steel,Rock,Dragon,Fairy";
            x4 = "";
        }else if(tipos.contains("Dragon") && tipos.contains("Grass")){
            x2 = "Poison,Flying,Bug,Dragon,Fairy";
            x4 = "Ice";
        }else if(tipos.contains("Dragon") && tipos.contains("Electric")){
            x2 = "Ice,Ground,Dragon,Fairy";
            x4 = "";
        }else if(tipos.contains("Dragon") && tipos.contains("Water")){
            x2 = "Dragon,Fiary";
            x4 = "";
        }else if(tipos.contains("Dragon") && tipos.contains("Fire")){
            x2 = "Ground,Rock,Dragon";
            x4 = "";
        }else if(tipos.contains("Dragon") && tipos.contains("Normal")){
            x2 = "Ice,Fighting,Dragon,Fairy";
            x4 = "";
        }else if(tipos.contains("Ghost") && tipos.contains("Rock")){
            x2 = "Water,Grass,Ground,Ghost,Steel,Dark";
            x4 = "";
        }else if(tipos.contains("Ghost") && tipos.contains("Bug")){
            x2 = "Fire,Flying,Rock,Ghost,Dark";
            x4 = "";
        }else if(tipos.contains("Ghost") && tipos.contains("Psychc")){
            x2 = "";
            x4 = "Ghost,Dark";
        }else if(tipos.contains("Ghost") && tipos.contains("Flying")){
            x2 = "Electric,Ice,Rock,Ghost,Dark";
            x4 = "";
        }else if(tipos.contains("Ghost") && tipos.contains("Ground")){
            x2 = "Water,Grass,Ice,Ghost,Dark";
            x4 = "";
        }else if(tipos.contains("Ghost") && tipos.contains("Poison")){
            x2 = "Ground,Psychc,Ghost,Dark";
            x4 = "";
        }else if(tipos.contains("Ghost") && tipos.contains("Fighting")){
            x2 = "Flying,Psychc,Ghost,Fairy";
            x4 = "";
        }else if(tipos.contains("Ghost") && tipos.contains("Ice")){
            x2 = "Fire,Rock,Ghost,Dark,Steel";
            x4 = "";
        }else if(tipos.contains("Ghost") && tipos.contains("Grass")){
            x2 = "Fire,Ice,Flying,Ghost,Dark";
            x4 = "";
        }else if(tipos.contains("Ghost") && tipos.contains("Electric")){
            x2 = "Ground,Ghost,Dark";
            x4 = "";
        }else if(tipos.contains("Ghost") && tipos.contains("Water")){
            x2 = "Electric,Grass,Ghost,Dark";
            x4 = "";
        }else if(tipos.contains("Ghost") && tipos.contains("Fire")){
            x2 = "Water,Ground,Rock,Ghost,Dark";
            x4 = "";
        }else if(tipos.contains("Ghost") && tipos.contains("Normal")){
            x2 = "Dark";
            x4 = "";
        }else if(tipos.contains("Rock") && tipos.contains("Bug")){
            x2 = "Water,Rock,Steel";
            x4 = "";
        }else if(tipos.contains("Rock") && tipos.contains("Psychc")){
            x2 = "Water,Grass,Ground,Bug,Ghost,Dark,Steel";
            x4 = "";
        }else if(tipos.contains("Rock") && tipos.contains("Flying")){
            x2 = "Water,Electric,Ice,Rock,Steel";
            x4 = "";
        }else if(tipos.contains("Rock") && tipos.contains("Ground")){
            x2 = "Ice,Fighting,Ground,Steel";
            x4 = "Water,Grass";
        }else if(tipos.contains("Rock") && tipos.contains("Poison")){
            x2 = "Water,Psychc,Steel";
            x4 = "Ground";
        }else if(tipos.contains("Rock") && tipos.contains("Fighting")){
            x2 = "Water,Grass,Fighting,Ground,Psychc,Steel,Fairy";
            x4 = "";
        }else if(tipos.contains("Rock") && tipos.contains("Ice")){
            x2 = "Water,Grass,Ground,Rock";
            x4 = "Fighting,Steel";
        }else if(tipos.contains("Rock") && tipos.contains("Grass")){
            x2 = "Ice,Fighting,Bug,Steel";
            x4 = "";
        }else if(tipos.contains("Rock") && tipos.contains("Electric")){
            x2 = "Water,Grass,Fighting";
            x4 = "Ground";
        }else if(tipos.contains("Rock") && tipos.contains("Water")){
            x2 = "Electric,Fighting,Ground";
            x4 = "Grass";
        }else if(tipos.contains("Rock") && tipos.contains("Fire")){
            x2 = "Fighting,Rock";
            x4 = "Water,Ground";
        }else if(tipos.contains("Rock") && tipos.contains("Normal")){
            x2 = "Water,Grass,Ground,Steel";
            x4 = "Fighting";
        }else if(tipos.contains("Bug") && tipos.contains("Psychc")){
            x2 = "Fire,Flying,Bug,Rock,Ghost,Dark";
            x4 = "";
        }else if(tipos.contains("Bug") && tipos.contains("Flying")){
            x2 = "Fire,Electric,Ice,Flying";
            x4 = "Rock";
        }else if(tipos.contains("Bug") && tipos.contains("Ground")){
            x2 = "Fire,Water,Ice,Flying";
            x4 = "";
        }else if(tipos.contains("Bug") && tipos.contains("Poison")){
            x2 = "Fire,Flying,Psychc,Rock";
            x4 = "";
        }else if(tipos.contains("Bug") && tipos.contains("Fighting")){
            x2 = "Fire,Psychc,Fairy";
            x4 = "Flying";
        }else if(tipos.contains("Bug") && tipos.contains("Ice")){
            x2 = "Flying,Steel";
            x4 = "Fire,Rock";
        }else if(tipos.contains("Bug") && tipos.contains("Ice")){
            x2 = "Ice,Poison,Bug,Rock";
            x4 = "Fire,Flying";
        }else if(tipos.contains("Bug") && tipos.contains("Electric")){
            x2 = "Fire,Rock";
            x4 = "";
        }else if(tipos.contains("Bug") && tipos.contains("Water")){
            x2 = "Electric,Flying,Rock";
            x4 = "";
        }else if(tipos.contains("Bug") && tipos.contains("Fire")){
            x2 = "Water,Flying";
            x4 = "Rock";
        }else if(tipos.contains("Bug") && tipos.contains("Normal")){
            x2 = "Fire,Flying,Rock";
            x4 = "";
        }else if(tipos.contains("Psychc") && tipos.contains("Flying")){
            x2 = "Electric,Ice,Rock,Ghost,Dark";
            x4 = "";
        }else if(tipos.contains("Psychc") && tipos.contains("Ground")){
            x2 = "Water,Grass,Ice,Bug,Ghost,Dark";
            x4 = "";
        }else if(tipos.contains("Psychc") && tipos.contains("Poison")){
            x2 = "Ground,Ghost,Dark";
            x4 = "";
        }else if(tipos.contains("Psychc") && tipos.contains("Fighting")){
            x2 = "Flying,Ghost,Fairy";
            x4 = "";
        }else if(tipos.contains("Psychc") && tipos.contains("Ice")){
            x2 = "Fire,Bug,Rock,Ghost,Dark,Steel";
            x4 = "";
        }else if(tipos.contains("Psychc") && tipos.contains("Grass")){
            x2 = "Fire,Ice,Poison,Flying,Ghost,Dark";
            x4 = "Bug";
        }else if(tipos.contains("Psychc") && tipos.contains("Electric")){
            x2 = "Ground,Dark,Bug,Ghost,Bug";
            x4 = "";
        }else if(tipos.contains("Psychc") && tipos.contains("Water")){
            x2 = "Electric,Grass,Bug,Ghost,Dark";
            x4 = "";
        }else if(tipos.contains("Psychc") && tipos.contains("Fire")){
            x2 = "Water,Ground,Rock,Ghost,Dark";
            x4 = "";
        }else if(tipos.contains("Psychc") && tipos.contains("Normal")){
            x2 = "Bug,Dark";
            x4 = "";
        }else if(tipos.contains("Flying") && tipos.contains("Ground")){
            x2 = "Water";
            x4 = "Ice";
        }else if(tipos.contains("Flying") && tipos.contains("Poison")){
            x2 = "Electric,Ice,Psychc,Rock";
            x4 = "";
        }else if(tipos.contains("Flying") && tipos.contains("Fighting")){
            x2 = "Electric,Ice,Flying,Psychc,Fairy";
            x4 = "";
        }else if(tipos.contains("Flying") && tipos.contains("ice")){
            x2 = "Fire,Electric,Steel";
            x4 = "Rock";
        }else if(tipos.contains("Flying") && tipos.contains("Grass")){
            x2 = "Fire,Poison,Flying,Rock";
            x4 = "Ice";
        }else if(tipos.contains("Flying") && tipos.contains("Electric")){
            x2 = "Ice,Rock";
            x4 = "";
        }else if(tipos.contains("Flying") && tipos.contains("Water")){
            x2 = "Rock";
            x4 = "Electric";
        }else if(tipos.contains("Flying") && tipos.contains("Fire")){
            x2 = "Water,Electric";
            x4 = "Rock";
        }else if(tipos.contains("Flying") && tipos.contains("Normal")){
            x2 = "Electric,Ice";
            x4 = "Rock";
        }else if(tipos.contains("Ground") && tipos.contains("Poison")){
            x2 = "Water,Ice,Ground,Psychc";
            x4 = "";
        }else if(tipos.contains("Ground") && tipos.contains("Fighting")){
            x2 = "Water,Grass,Ice,Flying,Psychc,Fairy";
            x4 = "";
        }else if(tipos.contains("Ground") && tipos.contains("Ice")){
            x2 = "Fire,Water,Grass,Fighting,Steel";
            x4 = "";
        }else if(tipos.contains("Ground") && tipos.contains("Grass")){
            x2 = "Flying,Fire,Bug";
            x4 = "Ice";
        }else if(tipos.contains("Ground") && tipos.contains("Electric")){
            x2 = "Water,Grass,Ice,Ground";
            x4 = "";
        }else if(tipos.contains("Ground") && tipos.contains("Water")){
            x2 = "";
            x4 = "Grass";
        }else if(tipos.contains("Ground") && tipos.contains("Fire")){
            x2 = "Ground";
            x4 = "Water";
        }else if(tipos.contains("Ground") && tipos.contains("Normal")){
            x2 = "Water,Grass,Ice,Fighting";
            x4 = "";
        }else if(tipos.contains("Poison") && tipos.contains("Fighting")){
            x2 = "Ground,Flying";
            x4 = "Psychc";
        }else if(tipos.contains("Poison") && tipos.contains("Ice")){
            x2 = "Fire,Ground,Psychc,Rock,Steel";
            x4 = "";
        }else if(tipos.contains("Poison") && tipos.contains("Grass")){
            x2 = "Fire,Ice,Flying,Psychc";
            x4 = "";
        }else if(tipos.contains("Poison") && tipos.contains("Electric")){
            x2 = "Psychc";
            x4 = "Ground";
        }else if(tipos.contains("Poison") && tipos.contains("Water")){
            x2 = "Electric,Ground,Psychc";
            x4 = "";
        }else if(tipos.contains("Poison") && tipos.contains("Fire")){
            x2 = "Water,Psychc,Rock";
            x4 = "Ground";
        }else if(tipos.contains("Poison") && tipos.contains("Normal")){
            x2 = "Ground,Psychc";
            x4 = "";
        }else if(tipos.contains("Fighting") && tipos.contains("Ice")){
            x2 = "Fire,Fighting,Flying,Psychc,Steel,Fairy";
            x4 = "";
        }else if(tipos.contains("Fighting") && tipos.contains("Grass")){
            x2 = "Fire,Ice,Poison,Psychc,Fairy";
            x4 = "Flying";
        }else if(tipos.contains("Fighting") && tipos.contains("Electric")){
            x2 = "Ground,Psychc,Fairy";
            x4 = "";
        }else if(tipos.contains("Fighting") && tipos.contains("Water")){
            x2 = "Electric,Grass,Flying,Psychc,Fairy";
            x4 = "";
        }else if(tipos.contains("Fighting") && tipos.contains("Fire")){
            x2 = "Water,Ground,Flying,Psychc";
            x4 = "";
        }else if(tipos.contains("Fighting") && tipos.contains("Normal")){
            x2 = "";
            x4 = "";
        }else if(tipos.contains("Ice") && tipos.contains("Grass")){
            x2 = "Fighting,Poison,Flying,Bug,Rock,Steel";
            x4 = "Fire";
        }else if(tipos.contains("Ice") && tipos.contains("Electric")){
            x2 = "Fire,Fighting,Ground,Rock";
            x4 = "";
        }else if(tipos.contains("Ice") && tipos.contains("Water")){
            x2 = "Electric,Grass,Fighting,Rock";
            x4 = "";
        }else if(tipos.contains("Ice") && tipos.contains("Fire")){
            x2 = "Water,Fighting,Ground";
            x4 = "Rock";
        }else if(tipos.contains("Ice") && tipos.contains("Normal")){
            x2 = "Fire,Rock,Steel";
            x4 = "Fighting";
        }else if(tipos.contains("Grass") && tipos.contains("Electric")){
            x2 = "Fire,Ice,Poison,Bug";
            x4 = "";
        }else if(tipos.contains("Grass") && tipos.contains("Water")){
            x2 = "Poison,Flying,Bug";
            x4 = "";
        }else if(tipos.contains("Grass") && tipos.contains("Fire")){
            x2 = "Poison,Flying,Rock";
            x4 = "";
        }else if(tipos.contains("Grass") && tipos.contains("Normal")){
            x2 = "Fire,Ice,Fighting,Poison,Flying,Bug";
            x4 = "";
        }else if(tipos.contains("Electric") && tipos.contains("Water")){
            x2 = "Grass,Ground";
            x4 = "";
        }else if(tipos.contains("Electric") && tipos.contains("Fire")){
            x2 = "Water,Rock";
            x4 = "Ground";
        }else if(tipos.contains("Electric") && tipos.contains("Normal")){
            x2 = "Fighting,Ground";
            x4 = "";
        }else if(tipos.contains("Water") && tipos.contains("Fire")){
            x2 = "Electric,Ground,Rock";
            x4 = "";
        }else if(tipos.contains("Water") && tipos.contains("Normal")){
            x2 = "Electric,Grass,Fighting";
            x4 = "";
        }else if(tipos.contains("Fire") && tipos.contains("Normal")){
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    

}
