/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculovoltaje;
import java.util.Scanner;
import java.math.*;
/**
 *
 * @author user
 */
public class CalculoVoltaje {
    static Scanner lector = new Scanner (System.in);

    static double I,R;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.println("El siguiente Programa calculara voltios,usando la ley de Ohm");
      //Amperios es la unidad de intensidad de corriente eléctrica//
      System.out.println("Por favor ingrese la cantidad de Amperios");
      I=lector.nextDouble();
      // es la unidad derivada de resistencia eléctrica//
      System.out.println("Por favor ingrese la cantidad de Ohmios");
      R=lector.nextDouble();
      double Voltios=I*R;
      System.out.println("La cantidad de voltios es= "+Voltios);
      
    }
    
}
