/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dylan;

public class Usuario extends Combatientes{                                                                              //Atributos globales
    private String nombre;
    private int ataque;
    private int defensa;
    private int punteria;
    private int hp;
    private int pp;

    //Constructores
    public Usuario(){}
    public Usuario(String nombre, int ataque, int defensa, int punteria){
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.punteria = punteria;
    }

    // Setter y Getter
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getAtaque() {return ataque;}
    public void setAtaque(int ataque) {this.ataque = ataque;}
    public int getDefensa() {return defensa;}
    public void setDefensa(int defensa) {this.defensa = defensa;}
    public int getPunteria() {return punteria;}
    public void setPunteria(int punteria) {this.punteria = punteria;}
    public int getHp() {return hp;}
    public void setHp(int hp) {this.hp = hp;}
    public int getPp() {return pp;}
    public void setPp(int pp) {this.pp = pp;}

    //metodos para obtener figuras con colores
    String getAvion(){
        return colorBlanco+Avion;
    }
    String getTanque(){
        return colorBlanco+Tanque;
    }




}