/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dylan;

public class Enemigos extends Combatientes{

    protected int cantidadVida =300;

    //constructor
    public Enemigos(){}

    //Getter y Setter
    public int getCantidadVida() {
        return cantidadVida;
    }
    public void setCantidadVida(int cantidadVida) {
        this.cantidadVida = cantidadVida;
    }

    //Pinta de color magenta el simbolo que representa a los enemigos
    String getEnemigos()
    {
        return colorMagenta+Enemigo;
    }
}
