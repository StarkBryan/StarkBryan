/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dylan;

import java.util.Scanner;

public class Terreno1 extends Escenario {
    Scanner lee = new Scanner(System.in);
    int x,y,ser;
    int estadoAnterior = 2;

    /*
    inicializa el campo ubicando enemigos y mi posicion inicial
     */
    public void inicializarCampo() {
        x=0;y=5;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                campoBatalla[i][j] = new Campo();
            }
        }
        campoBatalla[2][0] = new Agua();
        campoBatalla[2][1] = new Campo();
        campoBatalla[2][2] = new Cerros();
        campoBatalla[2][3] = new Cerros();
        campoBatalla[2][5] = new Cerros();
        campoBatalla[2][4] = new Campo();
        campoBatalla[2][6] = new Agua();
        campoBatalla[3][0] = new Agua();
        campoBatalla[3][1] = new Campo();
        campoBatalla[3][2] = new Cerros();
        campoBatalla[3][3] = new Agua();
        campoBatalla[3][4] = new Campo();
        campoBatalla[3][5] = new Agua();
        campoBatalla[3][6] = new Cerros();
        for (int i = 4; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                campoBatalla[i][j] = new Campo();
            }
        }
        //Enemigos
        campoBatalla[0][1] = new Enemigos();
        campoBatalla[0][4] = new Enemigos();

        //Usuario
        campoBatalla[5][0] = new Usuario();

        //Imprimir instrucciones
        Enemigos malo = new Enemigos();
        Usuario bueno = new Usuario();
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        System.out.println(bueno.colorBlanco+"Los enemigos son: "+malo.getEnemigos());
        System.out.println(bueno.colorBlanco+"El avion es: "+bueno.getAvion()+" y no puede pasar en las montañas rojas" +
                ", el tanque es: "+bueno.getTanque()+" y no puede pasar en el agua azul\n");
        rellenarCampo();
    }


    /*
    inicializa el campo ubicando enemigos pero sin mi ubicacion qeu me servira para inicizalizar mi cmapo depsues
    de cada movimiento
     */
    public void inicializarCampo2() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                campoBatalla[i][j] = new Campo();
            }
        }
        campoBatalla[2][0] = new Agua();
        campoBatalla[2][1] = new Campo();
        campoBatalla[2][2] = new Cerros();
        campoBatalla[2][3] = new Cerros();
        campoBatalla[2][5] = new Cerros();
        campoBatalla[2][4] = new Campo();
        campoBatalla[2][6] = new Agua();
        campoBatalla[3][0] = new Agua();
        campoBatalla[3][1] = new Campo();
        campoBatalla[3][2] = new Cerros();
        campoBatalla[3][3] = new Agua();
        campoBatalla[3][4] = new Campo();
        campoBatalla[3][5] = new Agua();
        campoBatalla[3][6] = new Cerros();
        for (int i = 4; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                campoBatalla[i][j] = new Campo();
            }
        }
        //Enemigos
        campoBatalla[0][1] = new Enemigos();
        campoBatalla[0][4] = new Enemigos();
    }

    /*
    lee cuantas posciones me quiero mover y analiza si es tanque o avion, si es tanque y quiere estar en agua, sobre un
    enemigo o salirse de la matriz no lo dejara, imprimira y preguntara de nuevo cuantas posiciones se quiere mover.
     */
    void moverUsuario(){
                System.out.println("Cuantas posiciones desea moverse?");
                int cantidadMov = lee.nextInt();
                System.out.println("6. Derecha\n4. Izquierda\n8. Arriba\n2. Abajo");
                int mov = lee.nextInt();
                System.out.println("Ud quiere ser 1. Tanque  o  2. Avion");
                ser = lee.nextInt();
                if(ser == 2) vehiculo = "avion";
                if(ser ==1)  vehiculo = "tanque";
                switch (mov) {
                    case 6:
                        for (int i = 1; i <= cantidadMov; i++)
                    {
                            x += 1;
                        if (x > 6) {
                            System.out.println("\n\033[30mUD. NO PUEDE EXCEDER EL NUMERO DE COLUMNAS");
                            x -= i;
                            i=cantidadMov;
                        }
                        if ((campoBatalla[y][x] instanceof Cerros && vehiculo.equals("avion")) || campoBatalla[y][x] instanceof Enemigos) {
                            System.out.println("\n\033[30mUN AVION NO PUEDE ESTAR EN LAS MONTAÑAS O SOBRE UN ENEMIGO");
                            x -= i;
                            ser = estadoAnterior;
                            i=cantidadMov;
                        }
                        if ((campoBatalla[y][x] instanceof Agua && vehiculo.equals("tanque")) || campoBatalla[y][x] instanceof Enemigos) {
                            System.out.println("\n\033[30mUN TANQUE NO PUEDE ESTAR EN AGUA O SOBRE UN ENEMIGO");
                            x -= i;
                            ser = estadoAnterior;
                            i=cantidadMov;
                        }
                    }
                        break;
                    case 4:
                        for (int i = 1; i <= cantidadMov; i++) {
                            x -= 1;
                            if (x < 0) {
                                System.out.println("\n\033[30mUD. NO PUEDE EXCEDER EL NUMERO DE COLUMNAS");
                                x += i;
                                i=cantidadMov;
                            }
                            if ((campoBatalla[y][x] instanceof Cerros && vehiculo.equals("avion")) || campoBatalla[y][x] instanceof Enemigos) {
                                System.out.println("\n\033[30mUN AVION NO PUEDE ESTAR EN LAS MONTAÑAS O SOBRE UN ENEMIGO");
                                x += i;
                                ser = estadoAnterior;
                                i=cantidadMov;
                            }
                            if ((campoBatalla[y][x] instanceof Agua && vehiculo.equals("tanque")) || campoBatalla[y][x] instanceof Enemigos) {
                                System.out.println("\n\033[30mUN TANQUE NO PUEDE ESTAR EN AGUA O SOBRE UN ENEMIGO");
                                x += i;
                                ser = estadoAnterior;
                                i=cantidadMov;
                            }
                        }
                        break;
                    case 8:
                        for (int i = 1; i <= cantidadMov; i++) {
                            y -= 1;
                            if (y < 0) {
                                System.out.println("\n\033[30mUD. NO PUEDE EXCEDER EL NUMERO DE FILAS");
                                y += i;
                                i=cantidadMov;
                            }
                            if ((campoBatalla[y][x] instanceof Cerros && vehiculo.equals("avion")) || campoBatalla[y][x] instanceof Enemigos) {
                                System.out.println("\n\033[30mUN AVION NO PUEDE ESTAR EN LAS MONTAÑAS O SOBRE UN ENEMIGO");
                                y += i;
                                ser = estadoAnterior;
                                i=cantidadMov;
                            }
                            if ((campoBatalla[y][x] instanceof Agua && vehiculo.equals("tanque")) || campoBatalla[y][x] instanceof Enemigos) {
                                System.out.println("\n\033[30mUN TANQUE NO PUEDE ESTAR EN AGUA O SOBRE UN ENEMIGO");
                                y += i;
                                ser = estadoAnterior;
                                i=cantidadMov;
                            }
                        }
                        break;
                    case 2:
                        for (int i = 1; i <= cantidadMov; i++) {
                            y += 1;
                            if (y > 5) {
                                System.out.println("\n\033[30mUD. NO PUEDE EXCEDER EL NUMERO DE FILAS");
                                y -= i;
                                i=cantidadMov;
                            }
                            if ((campoBatalla[y][x] instanceof Cerros && vehiculo.equals("avion")) || campoBatalla[y][x] instanceof Enemigos) {
                                System.out.println("\n\033[30mUN AVION NO PUEDE ESTAR EN LAS MONTAÑAS O SOBRE UN ENEMIGO");
                                y -= i;
                                ser = estadoAnterior;
                                i=cantidadMov;
                            }
                            if ((campoBatalla[y][x] instanceof Agua && vehiculo.equals("tanque")) || campoBatalla[y][x] instanceof Enemigos) {
                                System.out.println("\n\033[30mUN TANQUE NO PUEDE ESTAR EN AGUA O SOBRE UN ENEMIGO");
                                y -= i;
                                ser = estadoAnterior;
                                i=cantidadMov;
                            }
                        }
                        break;
                }
                System.out.println("\n");
                inicializarCampo2();
                campoBatalla[y][x] = new Usuario();
                rellenarCampo();
                if(ser == 2) estadoAnterior = 2;
                if(ser ==1)  estadoAnterior = 1;
                vehiculo = "";
    }

    //Imprime la matriz de acuerdo a la configuracion que se le haya puesto
    public void rellenarCampo() {
        for (int i =0; i<6; i++){
            for (int j=0; j<7;j++){
                if (campoBatalla[i][j] instanceof Usuario) {
                    if(ser == 2)
                        System.out.print("     " + campoBatalla[i][j].getUsuarioAvion() + "       ");
                    if(ser ==1)
                        System.out.print("     " + campoBatalla[i][j].getUsuarioTanque() + "       ");
                }
                else if(campoBatalla[i][j] instanceof Enemigos)
                    System.out.print("     "+campoBatalla[i][j].getEnemigo()+"       ");
                else System.out.print(campoBatalla[i][j].getSuperior() + " ");
            }
            System.out.println();
            for (int k=0; k<7;k++){
                if (campoBatalla[i][k] instanceof Usuario){
                    System.out.print("              ");}
                else if(campoBatalla[i][k] instanceof Enemigos)
                    System.out.print("              ");
                else {
                    System.out.print(campoBatalla[i][k].getInferior()+" ");
                }
            }
            System.out.println("\n");
        }
    }
}