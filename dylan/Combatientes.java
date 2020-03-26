/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dylan;

/**
 *
 * @author DELL
 */
public class Combatientes extends TipoTerreno{

        //Declara los colores y figruas qeu me srivaran para desarrollar el juego

        protected char Enemigo = '▼';
        protected char Avion = '✈';
        protected char Tanque = '卐';
        protected String colorBlanco = "\033[30m";
        protected String colorMagenta = "\033[35m";

   
        String getCuadroColor() {
                return colorMagenta+Enemigo;
        }
}