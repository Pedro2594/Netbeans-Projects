/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenadivinarnumero;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExamenAdivinarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,NUM,ADI,CONT;
        
        ADI=(int) (Math.random()*100);
        
        
        System.out.println("hola el juego consiste en adivinar un número secreto del 1 al 100");
        System.out.println("Tienes 5 intentos. Escribe un número entre 1 y 100: ");
        NUM = sc.nextInt();
        
        for (i=0; i<=4; i++) { 

    // Primero se evalúa si se ha acertado.
    
    if (ADI == NUM) {  
      System.out.println("¡Felicidades Adivinaste!"); 
      break; }
    else if (i == 4) { 
      System.out.println("Lo siento: ¡has perdido!. El número era el: " + ADI); 
      break; } 
        
    else if (ADI > NUM) 
      System.out.println("El número secreto es MAYOR que " + NUM);
    else if (ADI < NUM)
      System.out.println("El número secreto es MENOR que " + NUM);
    
    if (i <=1) { 
     System.out.println("Otro intento: "); 
     NUM = sc.nextInt(); } 
    else if (i ==2) { 
    int x = (int) (ADI/10);
    System.out.println("Una pista, la primera cifra es " + x);
    System.out.println("Inténtalo de nuevo: ");
    NUM = sc.nextInt(); } 
   else if (i >= 3) {
   System.out.println("Oh, oh... ÚLTIMO intento: ");
   NUM = sc.nextInt(); }
    
    
    }
    
}
}
