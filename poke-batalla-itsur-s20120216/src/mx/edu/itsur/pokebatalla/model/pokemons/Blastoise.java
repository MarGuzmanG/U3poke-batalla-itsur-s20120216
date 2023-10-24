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
public class Blastoise extends Pokemon{
    
    
    public Blastoise() {
        this.tipo = "AGUA";
        this.hp = 89;
        this.ataque = 83;
        this.defensa = 100;
        this.nivel = 36;
        this.precision = 3;
        //....
    }    
    
    //Constructor alterno 1
    public Blastoise(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("HYDROBOMBA")){
            //Logica del daño por HYDROBOMBA
            System.out.println("Realizando HYDROBOMBA");
        }else if(habilidad.equals("AQUA COLA")){
            //Logica del daño por AQUA COLA
            System.out.println("Realizando AQUA COLA");            
        }
        //TODO: otras habilidades...
    }
}
