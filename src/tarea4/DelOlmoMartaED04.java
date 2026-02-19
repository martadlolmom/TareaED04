/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea4;

public class DelOlmoMartaED04 {

    public static void main(String[] args) {
        System.out.println("Febrero de 2026 tiene " + Uitlidades.diasEnMesArray(2, 2026) + " días");
        System.out.println("60mph son " + Uitlidades.kmhAms(Uitlidades.mphAKmh(60)) + " metros por segundo");
        System.out.println("Si el cateto A mide 3cm y el cateto B mide 4cm, entonces la hipotenusa mide "
                + Uitlidades.hipotenusa(3, 4) + "cm");
    }

}
