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

public class Campo extends TipoTerreno {

    //Devuelve una figura de color verde qeu representa al campo
    @Override
    String getCuadroColor() {
        return ANSI_RED+cuadroCampo;
    }
}