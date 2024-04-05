/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplificar_numeros;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Simplificar_numeros {

public static Scanner sc= new Scanner(System.in);
    
    public static void main(String[] args) {
       System.out.println("Por favor ingrese el numerador");
       int a=sc.nextInt();
       int b=180;
       
    int Nume = a/mcd(a,b);
    int deno = b/mcd(a,b);
       System.out.println("Numerador es "+Nume);
       System.out.println("denominador es "+deno);
    }
    public static int mcd(int a , int b){
       if(b==0){
           return a;
       }
       int r;
       while (b != 0){
          r = a % b;
          a = b;
          b = r;
     }
     return a;
       }
    }

