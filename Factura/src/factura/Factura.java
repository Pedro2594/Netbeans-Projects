/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

import java.util.Scanner;
 
/**
 *
 * @author user
 */
public class Factura {
     public static Integer intTryParse(String num){
      try{
            return Integer.parseInt(num);
}catch (NumberFormatException e){
    return 0;
}
     }
     static Scanner lector = new Scanner (System.in);

    static double Des;
    /**
     * @return 
     */
     @SuppressWarnings("empty-statement")
    public static boolean finprograma() {
        boolean continuar=true;
        while(continuar){
           Scanner read= new Scanner(System.in);
           System.out.println("Desea Continuar?/ 1 - Si / 2 - No/ :>");
           String reader= read.next();
           int opcion= intTryParse(reader);
           if(opcion==1){
               continuar=true;
               System.out.println("Detalles de la factura : ");
               Scanner sc= new Scanner(System.in);
               System.out.println("cantidad de productos que lleva");
               int cant = sc.nextInt();
               System.out.println("Mencione el costo del producto");
               double cost = sc.nextInt();
               double SUBTOT = cant*cost;
                  if(cant>10){
                       Des=(18*SUBTOT)/100;
                  }else if(cant<10){
                  Des=0;};
                  
               double totalgast=SUBTOT-Des;
               double isv= (totalgast*15)/100;
               double totalfinal=totalgast+isv;
               
               System.out.println("SubTotal: "+SUBTOT);
               System.out.println("Descuento: "+ Des);
               System.out.println("I.S.V: "+isv);
               System.out.println("Total: "+totalfinal);
               System.out.println("");
           } else if(opcion==2){
               continuar=false;
               break;
           }
        }
        return continuar;
    }
    
    public static void main(String[] args){
        boolean continuar=true;
        while(continuar){
            System.out.println("Bienvenidos a MasterPlay su tienda de juegos favorita");
            break;
            } if(!(finprograma())){
                System.out.println("Muchas gracias lo esperamos la proxima ");
        }
        
    }
    
    }

    

