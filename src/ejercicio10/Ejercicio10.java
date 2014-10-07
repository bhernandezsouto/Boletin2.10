/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;
import java.util.Scanner;
/**
 *
 * @author bhernandezsouto
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero,d500,m500,d100,m100,d50,m50,d20,m20,d10,m10,d5,m5,d1;
        System.out.println("Introduzca numero");
        Scanner ab = new Scanner (System.in);
        numero = ab.nextInt();
        d500 = numero/500;
        m500 = numero%500;
        d100 = m500/100;
        m100 = m500%100;
        d50 = m100/50;
        m50 = m100%50;
        d20 = m100/20;
        m20 = m100%20;
        d10 = m20/10;
        m10 = m20%10;
        d5 = m10/5;
        m5 = m10%5;
        d1 = m5;
        System.out.println("La cantidad es " + numero + "\nEn billetes de 500: " 
                + d500 + "\nEn billetes de 100: " + d100 + "\nEn billetes de 50: " 
                + d50 + "\nEn billetes de 20: " + d20 + "\nEn billetes de 10: "
                + d10 + "\nEn billetes de 5: " + d5 + "\nEn monedas de 1: "+ d1);        
    }
    
}
