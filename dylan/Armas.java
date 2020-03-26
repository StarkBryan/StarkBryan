/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dylan;

/**
 *
 * @author DELL
 */import java.util.Random;

public class Armas {
    //Genera las variables globales y declaro un vector de 3 posiciones
    private String nombre;
    private int municiones;
    private Armas[] pistolaBasica;
    Random ale = new Random(System.nanoTime());
    int[] tipo = new int[3];

    //Constructores
    public Armas(){}
    public Armas(String nombre, int municiones) {
        this.municiones = municiones;
        this.nombre = nombre;
    }

    //Setter y Getters
    public void setNombre(String nombre){this.nombre = nombre;}
    public String getNombre (){return nombre;}
    public int getMuniciones() {
        return municiones; }
    public void setMuniciones(int municiones) {
        this.municiones = municiones; }

    //armas basicas
    public void Pistolas () {
        pistolaBasica = new Armas[10];
        pistolaBasica[0] = new Armas("Walther", 15);
        pistolaBasica[1] = new Armas("Wesson", 17);
        pistolaBasica[2] = new Armas("H&K",12);
        pistolaBasica[3] = new Armas("SP-01",10);
        pistolaBasica[4] = new Armas("P-07",10);
        pistolaBasica[5] = new Armas("Jericho",12);
        pistolaBasica[6] = new Armas("CZ-75B",15);
        pistolaBasica[7] = new Armas("Glock",15);
        pistolaBasica[8] = new Armas("Sig-Sauner",17);
        pistolaBasica[9] = new Armas("Beretta",10);
    }

    /*
    Metodos para elejir el tipo de pistola con Randoms que seran agregadas a los vehiculos
    y tambien imprime qeu tipo de pistola y con cuantas municones se le asignaron
     */
    public void elegirPistola (){
        Pistolas();
        Random ale = new Random(System.nanoTime());
        tipo[0] = ale.nextInt(9);
    }
    public void imprimirEleccion(){
        System.out.println("Su arma inicial es: "+pistolaBasica[tipo[0]].getNombre()+" y contiene "+pistolaBasica[tipo[0]].getMuniciones()+" municones");
    }

    public void elegirPistola2(){
        Pistolas();
        tipo[1] = ale.nextInt(9);
    }
    public void imprimirEleccion2(){
        System.out.println("Su arma inicial es: "+pistolaBasica[tipo[1]].getNombre()+" y contiene "+pistolaBasica[tipo[1]].getMuniciones()+" municones");
    }

    public void elegirPistola3(){
        Pistolas();
        Random ale = new Random(System.nanoTime());
        tipo[2] = ale.nextInt(9);
    }
    public void imprimirEleccion3(){
        System.out.println("Su arma inicial es: "+pistolaBasica[tipo[2]].getNombre()+" y contiene "+pistolaBasica[tipo[2]].getMuniciones()+" municones");
    }
}
