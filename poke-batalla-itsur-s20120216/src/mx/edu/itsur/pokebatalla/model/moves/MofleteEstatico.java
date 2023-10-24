/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Maria Guadalupe Guzman Gonzalez
 */
public class MofleteEstatico extends MovimientoFisico {
  public MofleteEstatico() {
        this.tipo = TiposDeMovimiento.ELECTRICO;
        this.potencia = 20;
        this.precision = 100;
        this.puntosPoder = 20;        
    } 
}
