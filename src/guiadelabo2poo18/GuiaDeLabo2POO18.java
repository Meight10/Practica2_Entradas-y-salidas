/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiadelabo2poo18;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class GuiaDeLabo2POO18 {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("*********MENU*********");
        System.out.println("BIenvenido, este es un programa para solucionar ecuaciones cuadraticas");
        
        double a, b, c, discriminante;
        
        
        //COLOCAMOS PRINT EN VEZ DE PRINTLN PORQUE QUEREMOS QUE EL USUARIO ESCRIB A LA PAR DE LO QUE SE LE PIDE
        //PEDIMOS A, B, C PARA PODER APLICAR LA FORMULA
        System.out.print("Ingrese a: ");
        a = input.nextDouble();
        
        System.out.print("Ingrese b: ");
        b = input.nextDouble();
        
        System.out.print("Ingrese c: ");
        c = input.nextDouble();
        
        discriminante = pow(b,2)-4*a*c; //PRIMERO SACAMOS EL DISCRIMINANTE PARA COMPROBAR QUE HAY UNA RESPUESTA REAL
        
        if(discriminante > 0){ 
            
            double x1 = (sqrt(discriminante)-b)/2*a; //COMPLETAMOS LAS FORMULAS
            double x2 = (-sqrt(discriminante)-b)/2*a;
            
            //CONCATENAMOS LAS RESPUESTAS Y LAS CADENAS PARA DAR UNA SOLA REPUESTA
            System.out.println("El valor de x1 es: " + x1 + "y el valor de x2 es: " + x2);
        }else{
            System.out.println("El discriminante es negativo, por lo tanto no pertenece a los numeros reales");
        }
    }
    
}



/*int varInt = 10;
        String varString = "Es tu nota";
        
        System.out.println("Con println()");
        System.out.println(varInt);
        System.out.println(varString);
        
        System.out.println("Con print()");
        System.out.print(varInt);
        System.out.print(varString);*/

/*int precioProducto=300;
        double IVA=0.13;
        
        System.out.println("Informacion del producto");
 
        System.out.println("El precio del producto sin IVA es: "+precioProducto);
 
        System.out.println("El precio del producto con IVA, es: "+(precioProducto+(precioProducto*IVA)));*/

/*Scanner input = new Scanner(System.in);
        
        System.out.println("Escribe un numero entero: ");
        int num = input.nextInt();
        System.out.println("El numero entero escrito ha sido "+num);
 
        System.out.println("Escribe un numero decimal: ");
        double numDouble = input.nextDouble();
        System.out.println("El numero decimal escrito ha sido "+numDouble);
 
        System.out.println("Escribe una cadena: ");
        String cadena = input.nextLine();
        System.out.println("El numero decimal escrito ha sido "+cadena);
 
        System.out.println("Escribe un booleano: ");
        boolean booleano = input.nextBoolean();
        System.out.println("El booleano escrito es "+booleano);*/