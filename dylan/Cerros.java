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

public class Cerros extends TipoTerreno{

    //Retorna una figura roja qeu representa una montaña
    @Override
    String getCuadroColor() {
        return ANSI_GREEN+cuadroCerro;
    }

}
