/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedionotas;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class PromedioNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int cali1,cali2,cali3;
double promedio;
Scanner lector=new Scanner(System.in);
System.out.println("El siguiente programa calculara el promedio de nota de un alumno");
System.out.println("Ingrese la primer calificacion");
cali1=lector.nextInt();
System.out.println("Ingrese la segunda calificacion");
cali2=lector.nextInt();
System.out.println("Ingrese la tercera calificacion");
cali3=lector.nextInt();
promedio=(cali1+cali2+cali3)/3;
System.out.println("El promedio es:"+promedio);
if(promedio>=70){
    System.out.println("El Alumno esta aprobado");
}
if(promedio>=40&&promedio<70){
    System.out.println("El alumno esta reprobado pero con derecho a recuperacion");
}else{
    if(promedio<40){
        System.out.println("El alumno esta reprobado");
    }
    }
    
}
}
