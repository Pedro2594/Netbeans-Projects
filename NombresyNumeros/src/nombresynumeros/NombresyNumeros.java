/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombresynumeros;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class NombresyNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
          String[] Nombres= new String[10];
        String[] NumerosTelefonos= new String[10];
               
               Nombres[0]="Carlos";
               Nombres[1]="Juan";
               Nombres[2]="David";
               Nombres[3]="Mario";
               Nombres[4]="Roberto";
               Nombres[5]="Silvia";
               Nombres[6]="Bertha";
               Nombres[7]="Scarleth";
               Nombres[8]="Maria";
               Nombres[9]="Martha";
               
               NumerosTelefonos[0]="99280403";
               NumerosTelefonos[1]="88741236";
               NumerosTelefonos[2]="96785512";
               NumerosTelefonos[3]="96551787";
               NumerosTelefonos[4]="32123696";
               NumerosTelefonos[5]="33219663";
               NumerosTelefonos[6]="97142020";
               NumerosTelefonos[7]="89985445";
               NumerosTelefonos[8]="22452741";
               NumerosTelefonos[9]="33159080";
               
               for(int i=0;i<10;i++){
               System.out.println(i+" "+Nombres[i]);
               }
               
               
               
               
               
               Scanner entrada= new Scanner(System.in);
               
               int nom;
      
         System.out.println("Digite el numero de nombre que desea ver y se le mostrara tambien su numero de telefono");
        nom= entrada.nextInt();      
                
                switch(nom){
                    case 0: System.out.println("El Nombre es = "+Nombres[0]+" Y su numero de telefono es el= "+NumerosTelefonos[0]);
                    break;
                    case 1: System.out.println("El Nombre es = "+Nombres[1]+" Y su numero de telefono es el= "+NumerosTelefonos[1]);
                    break;
                    case 2: System.out.println("El Nombre es = "+Nombres[2]+" Y su numero de telefono es el= "+NumerosTelefonos[2]);
                    break;
                    case 3: System.out.println("El Nombre es = "+Nombres[3]+" Y su numero de telefono es el= "+NumerosTelefonos[3]);
                    break;
                    case 4: System.out.println("El Nombre es = "+Nombres[4]+" Y su numero de telefono es el= "+NumerosTelefonos[4]);
                    break;
                    case 5: System.out.println("El Nombre es = "+Nombres[5]+" Y su numero de telefono es el= "+NumerosTelefonos[5]);
                    break;
                    case 6: System.out.println("El Nombre es = "+Nombres[6]+" Y su numero de telefono es el= "+NumerosTelefonos[6]);
                    break;
                    case 7: System.out.println("El Nombre es = "+Nombres[7]+" Y su numero de telefono es el= "+NumerosTelefonos[7]);
                    break;
                    case 8: System.out.println("El Nombre es = "+Nombres[8]+" Y su numero de telefono es el= "+NumerosTelefonos[8]);
                    break;
                    case 9: System.out.println("El Nombre es = "+Nombres[9]+" Y su numero de telefono es el= "+NumerosTelefonos[9]);
                    break;
                    default: System.out.println("La opcion no es valida");
                    
                }
            }
        } 


    


