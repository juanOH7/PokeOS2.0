/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeos2.pkg0;

import java.util.ArrayList;

/**
 *
 * @author Juan O'Hara
 */
public class Perfil {
    private String nombre;
    private String password;
 //   private Pokemon[] pokemons;

    public Perfil(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    @Override
    public String toString() {
        return "Perfil " + nombre;
    }
}
