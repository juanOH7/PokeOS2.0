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

    @Override
    public String toString() {
        return "Perfil " + nombre;
    }
}
