/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interescompuesto;

import java.util.Scanner;
import java.math.*;
/**
 *
 * @author user
 */
public class InteresCompuesto { static Scanner lector = new Scanner (System.in);

    static double P,i,N;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      System.out.println("El siguiente Programa calculara el interes compuesto al pagar un prestamo");
      System.out.println("Porfavor ingrese el capital del prestamo");
      P=lector.nextDouble();
      System.out.println("Porfavor ingrese el porcentaje de interes");
      i=lector.nextDouble();
      System.out.println("Porfavor ingrese la cantidad de tiempo en años");
      N=lector.nextDouble();
      double F=P*Math.pow(1+(i/100),N);
      System.out.println("El total a pagar es de= "+F+" Lempiras");
    }
    
}
