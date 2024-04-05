/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio_do_while;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Promedio_Do_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner p= new Scanner (System.in);
      float acm=1;// variable de acumulador
       float calificaciones=0;
       System.out.println("Este programa calcula el promedio de calificaciones de un alumno ");
       System.out.println("Ingrese el numero de calificaciones que va a calcular");
        float cant;
        cant = p.nextFloat();// cantidad de calificaciones
       do
       {
           System.out.println("Ingrese la calificacion "+acm);
           float c = p.nextFloat();
           calificaciones+=c;
           acm++;
       }while (acm<=cant);
       {
    }
    float promedio=calificaciones/cant;
    System.out.println("El promedio es de= "+promedio);
    
    if(promedio>=70 ) {
        System.out.println("El estudiante esta aprobado");
    }else{
        System.out.println("El estudiante esta reprobado");
    }
    }
}
      
        
