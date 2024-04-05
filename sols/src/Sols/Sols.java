package Sols;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
public class Sols {

    private static Object entrada;
    private static double dec;
    private double alt;
   private void trigonometria ()
   {      Scanner sc = new Scanner(System.in);
          System.out.println("         BIENVENIDO AL PROGRMA ");
           System.out.println(" ¿QUE DESEA CALCULAR? ");
           Scanner read=new Scanner(System.in);
           System.out.println("1.SOLSTICIO DE VERANO ");
           System.out.println("2.SOLSTICIO DE INVIERNO ");
           
           int opc = sc.nextInt();
            if (opc==1)
            {
                System.out.println("Vamos a calcular solsticio de verano");
                System.out.println("Ingrese la latitud");
                double lat = sc.nextDouble();//latitud
                System.out.println("Ingrese la altura");
                 double alt = sc.nextDouble();//altura
                 double res = 0;//resultado
                 dec=23.5;
                  System.out.println("El solsticio de verano es: "+res +"°");
                
            }
       double res;
       string funcion;
        double lat = 0;
       res = (Math.sin(dec))- (Math.sin(lat))*((Math.sin(alt)))/(Math.cos(lat))*((Math.cos(alt)));
               
   }
   
    public static void main(String[] args)
            
    {          Scanner read=new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
          System.out.println("         BIENVENIDO AL PROGRMA ");
           System.out.println(" ¿QUE DESEA CALCULAR? ");
         
           System.out.println("1.SOLSTICIO DE VERANO ");
           System.out.println("2.SOLSTICIO DE INVIERNO ");
            
           int opc = sc.nextInt();
            if (opc==1)
            {
                System.out.println("Vamos a calcular solsticio de verano");
                System.out.println("Ingrese la latitud");
                double lat = sc.nextDouble();//latitud
                System.out.println("Ingrese la altura");
                 double alt = sc.nextDouble();//altura
                 double resu ;//resultado
                 double num;
                 double deno;
                 double tot;
                 
                 dec=0;
                 num=Math.sin(dec)-(Math.sin(lat)*Math.sin(alt));
                 deno=Math.cos(alt)*Math.cos(lat);
                 tot=(num/deno);
                 double f=1/Math.cos(tot);
                 resu=f;
                  System.out.println("El solsticio de verano es: "+resu +"°");
                
            } else if(opc==2){
                 System.out.println("Vamos a calcular solsticio de invierno");
                 System.out.println("Ingrese la latitud");
                double lat = sc.nextDouble();//latitud
                System.out.println("Ingrese la altura"); 
                double alt = sc.nextDouble();
                dec= -23.5;
                double t;
               t= (Math.sin(dec))- (Math.sin(lat))*((Math.sin(alt)));
        double to = t/(Math.cos(lat))*((Math.cos(alt)));
         System.out.println("El solsticio de invierno es: "+ to +"°");
                
            }
            
            
    }             

  
    
}
