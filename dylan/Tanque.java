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
public class Tanque extends Usuario{
    //Crea un contructor vacio y un constructor donde define ya los atributos que tiene este tipo de vehiculo
    public Tanque (){}
    public Tanque (String nombre)
    {
        super(nombre,10,6,60);
    }
}
