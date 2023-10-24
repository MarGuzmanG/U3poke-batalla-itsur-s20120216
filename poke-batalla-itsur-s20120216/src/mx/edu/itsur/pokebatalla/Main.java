/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.pokemons.Blastoise;
import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;
import mx.edu.itsur.pokebatalla.model.pokemons.Squirtle;
import mx.edu.itsur.pokebatalla.model.pokemons.Jigglypuff;

/**
 *
 * @author s20120216
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander() ;
        
        //Realizar la captura del pikachu salvaje
        pikachuSalvaje.setNombre("Pedro");     
        Pikachu miPikachu = pikachuSalvaje;
        
        miPikachu.atacar(charmanderSalvaje);
        
        miPikachu.atacar(charmanderSalvaje, "ATACKTRUENO");
        
        Blastoise blastoiseSalvaje = new Blastoise();
        Jigglypuff poliwagSalvaje = new Jigglypuff();
        Squirtle magikarpSalvaje = new Squirtle();
        
        Blastoise miBlastoise=blastoiseSalvaje;
        miBlastoise.setNombre("CHETTO");
        
        Squirtle miMagikarp=magikarpSalvaje;
        miMagikarp.setNombre("CHARLIE");
        
        miBlastoise.atacar(poliwagSalvaje);
        miBlastoise.atacar(poliwagSalvaje, "HYDROBOMBA");
        
        miMagikarp.atacar(charmanderSalvaje);
        miMagikarp.atacar(charmanderSalvaje,"PLACAJE");
        
    }
    
}
