/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dylan;

/**
 *
 * @author DELL
 */public class Agua extends TipoTerreno{

    //Devulve una figura azul que representa el agua

    String getCuadroColor() {
        return ANSI_YELLOW +cuadroAgua;
    }
}
