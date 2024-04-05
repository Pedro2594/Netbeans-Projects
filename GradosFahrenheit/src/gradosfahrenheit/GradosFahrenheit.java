/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradosfahrenheit;
import java.util.Scanner;
import java.math.*;
/**
 *
 * @author user
 */
public class GradosFahrenheit {
        static Scanner lector = new Scanner (System.in);

    static double C;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("El siguiente programa transformara grados Celsius a Fahrenheit");
      System.out.println("Por favor ingrese los grados Celsius a convertir");
      C=lector.nextDouble();
      double F=(9*C/5)+32;
      System.out.println("La conversion es igual a= "+F+"° Fahrenheit");
    }
    
}
