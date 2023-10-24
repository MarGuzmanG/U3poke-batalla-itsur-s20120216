/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author Maria Guadalupe Guzman Gonzalez
 */
public class Rayo extends MovimientoEspecial{
    public Rayo() {
        this.tipo = TiposDeMovimiento.ELECTRICO;
        this.potencia = 90;
        this.precision = 100;
        this.puntosPoder = 15;
    }
}
