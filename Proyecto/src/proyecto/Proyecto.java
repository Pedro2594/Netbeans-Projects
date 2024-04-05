
package proyecto;
import java.util.Scanner;

public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int eq=1;
    int ver=2;
    int in=3;    
    double cosa;
    double cosb;
    System.out.println("Buenos dias acontinuacion se le solicitara informacion para que el programa calcule acontinuacion lo siguiente");
    System.out.println("Busca calcular: ");
    System.out.println("1_Equinoccio");
    System.out.println("2_Solsticio de verano");
    System.out.println("3_Solsticio de invierno");
    System.out.println(" ");
    int op=sc.nextInt();
    if (eq==op ){
        System.out.println("Se calculara el equinoccio");
        System.out.println("Ingrese la altura de la montaña");
        double h=sc.nextDouble();
        System.out.println("Ingrese la latitud del pais");
        double lat;
        lat = sc.nextDouble();
        
        double d=0;
        
        double num1=Math.toRadians(h);
        double num2=Math.toRadians(lat);
        double num3=0;
        
        cosa=(num3-Math.sin(num2)*Math.sin(num1))/(Math.cos(num1)*Math.cos(num2));
        cosb=Math.acos(cosa);
        double z=Math.toDegrees(cosb);
        System.out.println("El acimut es de : "+z+"º");
    }else{
        if(op==ver){
            System.out.println("Se calculara el equinoccio");
            System.out.println("Ingrese la altura de la montaña");
            double h=sc.nextDouble();
            System.out.println("Ingrese la latitud del pais");
            double lat=sc.nextDouble();
            
            double s=23.5;
            
            double num1=Math.toRadians(h);
            double num2=Math.toRadians(lat);
            double num3=Math.toRadians(s);
            
            cosa=(Math.cos(num3)-Math.sin(num2)*Math.sin(num1))/(Math.cos(num1)*Math.cos(num2));
            cosb=Math.acos(cosa);
            double z=Math.toDegrees(cosb);
            System.out.println("El acimut es de : "+z+"º");
        }else{
            if (op==in){
                System.out.println("Se calculara el equinoccio");
                System.out.println("Ingrese la altura de la montaña");
                double h=sc.nextDouble();
                System.out.println("Ingrese la latitud del pais");
                double lat=sc.nextDouble();
                
                double i=-23.5;
                
                double num1=Math.toRadians(h);
                double num2=Math.toRadians(lat);
                double num3=Math.toRadians(i);
                
                cosa=(Math.cos(num3)-Math.sin(num2)*Math.sin(num1))/(Math.cos(num1)*Math.cos(num2));
                cosb=Math.acos(cosa);
                double z=Math.toDegrees(cosb);
                System.out.println("El acimut es de : "+z+"º");
            }
        }
    }
    }
}

