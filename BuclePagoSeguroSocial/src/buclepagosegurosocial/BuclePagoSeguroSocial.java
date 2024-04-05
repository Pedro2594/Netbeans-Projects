/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclepagosegurosocial;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class BuclePagoSeguroSocial {
static Scanner lector = new Scanner (System.in);

    static double Salario;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int TechoSalarial;
        TechoSalarial = 7000;
      System.out.println("El siguiente Programa calcula el pago de seguro social y sueldo neto de un empleado");
    Scanner entrada= new Scanner(System.in);
    int Empleados;
    System.out.println("Digite el numero de empleados a realizar el calculo");
    Empleados= entrada.nextInt();
    for(int i=1;i<=Empleados;i++){
        System.out.println("");
        System.out.println("Por favor ingrese el salario del empleado :"+i);
      Salario=lector.nextDouble();
        if(Salario>=TechoSalarial) {
          System.out.println("El salario es mayor al Techo Salarial");
          double SueldoNeto=Salario-(Salario*0.035);
          double SeguroSocial=Salario-SueldoNeto;
          System.out.println("El pago de Seguro Social es : "+SeguroSocial+" Lempiras");
          System.out.println("El Sueldo Neto es : "+SueldoNeto+" Lempiras");
      }
      if(Salario<TechoSalarial) {
           System.out.println("El salario es menor al Techo Salarial");
          double SueldoNeto=Salario-(Salario*0.035);
          double SeguroSocial=Salario-SueldoNeto;
          System.out.println("El pago de Seguro Social es : "+SeguroSocial+" Lempiras");
          System.out.println("El Sueldo Neto es : "+SueldoNeto+" Lempiras");
      }
    }
}
}
