/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.util.ArrayList;

/**
 *
 * @author Maria Guadalupe Guzman Gonzalez
 */
public class Jigglypuff extends Pokemon{
    
    public Jigglypuff() {
        this.tipo = "HADA";
        this.hp = 95;
        this.ataque = 80;
        this.defensa = 41;
        this.nivel = 1;
        this.precision = 4;
        //....
    }    
    
    //Constructor alterno 1
    public Jigglypuff(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("GRAN ENCANTO")){
            //Logica del daño por GRAN ENCANTO
            System.out.println("Realizando GRAN ENCANTO");
        }else if(habilidad.equals("TENACIDAD")){
            //Logica del daño por TENACIDAD
            System.out.println("Realizando TENACIDAD");            
        }
        //TODO: otras habilidades...
    }
}

