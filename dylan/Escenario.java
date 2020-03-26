/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dylan;
import java.util.Random;
import java.util.Scanner;


public class Escenario {
    //Crea la matriz donde se va a jugar y las varibables globales qeu seran utilizadas
    TipoTerreno[][] campoBatalla= new TipoTerreno[6][7];
    Scanner lee = new Scanner(System.in);
    String vehiculo;
    Enemigos enemigo1 = new Enemigos();
    Armas pistola = new Armas();
    Random ale = new Random(System.nanoTime());


    public void ususario(){
        Avion avion1 = new Avion();
        Avion avion2 = new Avion();
        Avion avion3 = new Avion();
        Tanque tanque1 = new Tanque();
        Tanque tanque2 = new Tanque();
        Tanque tanque3 = new Tanque();

        System.out.print("Bienvenido a su nuevo juego, por favor ingrese un apodo: ");
        String nombre = lee.next();                                                                                     //lee el nombre del ususario
        System.out.println("Hola "+nombre+" por favor elija 3 vehiculos");
        System.out.println("\nExisten dos tipos de vehiculo que puede elegir:" +
                "\n1. Avion\n2. Tanque");
        int opcion1 = lee.nextInt();
        switch (opcion1){                                                                                               //Menu para elegir entre avion y tanque
            case 1:
                System.out.println("Escriba el nombre de su avion");
                String nombAvion = lee.next();                                                                          //variable para leer el nombre desde consola
                avion1 = new Avion(nombAvion);                                                                          //Llena al constructor de aviones con el nombre
                pistola.elegirPistola();
                break;
            case 2:
                System.out.println("Escriba el nombre de su tanque");
                String nombTanque = lee.next();
                tanque1 = new Tanque(nombTanque);
                pistola.elegirPistola();
                break;
        }

        System.out.println("\nExisten dos tipos de vehiculo que puede elegir:" +
                "\n1. Avion\n2. Tanque");
        int opcion2 = lee.nextInt();
        switch (opcion2){                                                                                               //Menu para elegir entre avion y tanque
            case 1:
                System.out.println("Escriba el nombre de su avion");
                String nombAvion = lee.next();                                                                          //variable para leer el nombre desde consola
                avion2 = new Avion(nombAvion);                                                                          //Llena al constructor de aviones con el nombre
                pistola.elegirPistola2();
                break;
            case 2:
                System.out.println("Escriba el nombre de su tanque");
                String nombTanque = lee.next();
                tanque2 = new Tanque(nombTanque);
                pistola.elegirPistola2();
                break;
        }

        System.out.println("\nExisten dos tipos de vehiculo que puede elegir:" +
                "\n1. Avion\n2. Tanque");
        int opcion3 = lee.nextInt();
        switch (opcion3){                                                                                               //Menu para elegir entre avion y tanque
            case 1:
                System.out.println("Escriba el nombre de su avion");
                String nombAvion = lee.next();                                                                          //variable para leer el nombre desde consola
                avion3 = new Avion(nombAvion);                                                                          //Llena al constructor de aviones con el nombre
                pistola.elegirPistola3();
                break;
            case 2:
                System.out.println("Escriba el nombre de su tanque");
                String nombTanque = lee.next();
                tanque3 = new Tanque(nombTanque);
                pistola.elegirPistola3();
                break;
        }

        if(opcion1 == 1) {                                                                                              //Verifica si elijieron avion o tanque
            System.out.println("\nSu avion ha sido creado con el nombre de " + avion1.getNombre()                         //Imprime el nombre y atributos del primer avion
                    + ", tiene un ataque de: " + avion1.getAtaque() +
                    " y tiene una punteria de: " + avion1.getPunteria());
            pistola.imprimirEleccion();
        }else {
            System.out.println("\nSu tanque  ha sido creado con el nombre de " + tanque1.getNombre()                      //Imprime el nombre y atributos del primer tanque
                    + ", tiene un ataque de: " + tanque1.getAtaque() +
                    " y tiene una punteria de: " + tanque1.getPunteria());
            pistola.imprimirEleccion();
        }
        if(opcion2 == 1) {
            System.out.println("\nSu avion ha sido creado con el nombre de " + avion2.getNombre()
                    + ", tiene un ataque de: " + avion2.getAtaque() +
                    " y tiene una punteria de: " + avion2.getPunteria());
            pistola.imprimirEleccion2();
        }else {
            System.out.println("\nSu tanque  ha sido creado con el nombre de " + tanque2.getNombre()
                    + ", tiene un ataque de: " + tanque2.getAtaque() +
                    " y tiene una punteria de: " + tanque2.getPunteria());
            pistola.imprimirEleccion2();
        }
        if(opcion3 == 1) {
            System.out.println("\nSu avion ha sido creado con el nombre de " + avion3.getNombre()
                    + ", tiene un ataque de: " + avion3.getAtaque() +
                    " y tiene una punteria de: " + avion3.getPunteria());
            pistola.imprimirEleccion3();
        }else {
            System.out.println("\nSu tanque  ha sido creado con el nombre de " + tanque3.getNombre()
                    + ", tiene un ataque de: " + tanque3.getAtaque() +
                    " y tiene una punteria de: " + tanque3.getPunteria());
            pistola.imprimirEleccion3();
        }
        menuPrincipal();
    }
    public void menuPrincipal(){
        System.out.println("\n\nUd desea\n1. Jugar\n2. Salirse");                                                 //El menu da la opcion para jugar o rendirse
    int opcion = lee.nextInt();
        switch (opcion){
        case 1:juego();
        case 2:System.exit(0);
    }
    }

    public void juego(){
        Scanner lee = new Scanner(System.in);
        //Se configura el campo de batalla
                Terreno1 t1 = new Terreno1();
                t1.inicializarCampo();
                boolean jugar=true;
        //Muestra las opciones para jugar
                while (jugar) {
                    System.out.println("\033[30mUd desea\n1. Moverse\n2. Disparar\n3. Rendirse");                       //Menu dentro del juego
                    int movDis = lee.nextInt();
                    switch (movDis) {
                        case 1:
                            t1.moverUsuario();
                            break;
                        case 2:
                            Atacar a1 = new Atacar();
                            a1.atacando();
                            break;
                        case 3:
                            menuPrincipal();
                            break;
                    }
                }
    }
    public void rellenarCampo() {                                                                                //Imprime la matriz de juego
        for (int i =0; i<6; i++){
            for (int j=0; j<7;j++){
                if (campoBatalla[i][j] instanceof Usuario)
                    System.out.print("     "+campoBatalla[i][j].getUsuarioAvion()+"       ");
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