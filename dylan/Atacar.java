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

import java.util.Random;
import java.util.Scanner;

public class Atacar extends Terreno1{
    Scanner lee = new Scanner(System.in);
    Random ale = new Random();

    public void atacando(){
        x = 1;
        y = 5;
        System.out.println("¿Hacia donde desea atacar?\n8.Arriba\n2.Abajo\n6.Derecha\n4.Izquierda");
        int donde = lee.nextInt();
        switch (donde){
            case 8:
                int disparo = ale.nextInt(100);
                System.out.println("El aleatori fue"+disparo);
                if (disparo < 60)
                {
                    for (int i = y; i > 0; i--) {
                        System.out.println("Su posicion en y es: "+y);
                        y -= 1;
                        System.out.println("Ahora la bala va en: "+y+", "+x);
                        if (campoBatalla[y][x] instanceof Enemigos) {
                            System.out.println("Su vida inicial es de: " + enemigo1.getCantidadVida());
                            int vidaNueva = enemigo1.getCantidadVida() - 10;
                            enemigo1.setCantidadVida(vidaNueva);
                            System.out.println("Su vida ahora es de: " + enemigo1.getCantidadVida());
                            rellenarCampo();
                        }
                    }
                }
                else System.out.println("NO hay enemigos");
                break;
            case 2:
                disparo = ale.nextInt(100);
                System.out.println("El aleatori fue"+disparo);
                if (disparo < 60)
                {
                    for (int i = y; i > 0; i--) {
                        System.out.println("Su posicion en y es: "+y);
                        y -= 1;
                        System.out.println("Ahora la bala va en: "+y+", "+x);
                        if (campoBatalla[y][x] instanceof Enemigos) {
                            System.out.println("Su vida inicial es de: " + enemigo1.getCantidadVida());
                            int vidaNueva = enemigo1.getCantidadVida() - 10;
                            enemigo1.setCantidadVida(vidaNueva);
                            System.out.println("Su vida ahora es de: " + enemigo1.getCantidadVida());
                            rellenarCampo();
                        }
                    }
                }
                break;
            case 6:
                disparo = ale.nextInt(100);
                System.out.println("El aleatori fue"+disparo);
                if (disparo < 60)
                {
                    for (int i = x; i > 0; i--) {
                        System.out.println("Su posicion en y es: "+y);
                        y -= 1;
                        System.out.println("Ahora la bala va en: "+y+", "+x);
                        if (campoBatalla[y][x] instanceof Enemigos) {
                            System.out.println("Su vida inicial es de: " + enemigo1.getCantidadVida());
                            int vidaNueva = enemigo1.getCantidadVida() - 10;
                            enemigo1.setCantidadVida(vidaNueva);
                            System.out.println("Su vida ahora es de: " + enemigo1.getCantidadVida());
                            rellenarCampo();
                        }
                    }
                }
                break;
            case 4:
                disparo = ale.nextInt(100);
                System.out.println("El aleatori fue"+disparo);
                if (disparo < 60)
                {
                    for (int i = x; i > 0; i++) {
                        System.out.println("Su posicion en y es: "+y);
                        y -= 1;
                        System.out.println("Ahora la bala va en: "+y+", "+x);
                        if (campoBatalla[y][x] instanceof Enemigos) {
                            System.out.println("Su vida inicial es de: " + enemigo1.getCantidadVida());
                            int vidaNueva = enemigo1.getCantidadVida() - 10;
                            enemigo1.setCantidadVida(vidaNueva);
                            System.out.println("Su vida ahora es de: " + enemigo1.getCantidadVida());
                            rellenarCampo();
                        }
                    }
                }
                break;
        }
    }
}
