/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dylan;

public abstract class TipoTerreno {
    protected final char cuadroAgua = (char)61;
    protected final char cuadroCampo = (char)35;
    protected final char cuadroCerro = (char)77;
    protected static final String ANSI_GREEN = "\u001B[32m";
  protected static final String ANSI_YELLOW = "\u001B[33m";
    protected static final String ANSI_RED = "\u001B[31m";

    /*
    Metodos para obtener los datos de todas las clases de donde se hara herencia
    por medio de los cuales vamos a llenar los espacios en la matriz
    */
    String getSuperior(){
        return getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+" ";
    }

    String getUsuarioAvion(){
        Usuario jugador = new Usuario();
        return jugador.getAvion()+" ";
    }

    String getUsuarioTanque(){
        Usuario jugador = new Usuario();
        return jugador.getTanque()+" ";
    }

    String getEnemigo(){
        return getCuadroColor()+" ";
    }

    String getInferior(){
        return getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+" ";
    }

    abstract String getCuadroColor();
}