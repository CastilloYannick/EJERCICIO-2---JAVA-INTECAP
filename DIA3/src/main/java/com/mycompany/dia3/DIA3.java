

package com.mycompany.dia3;
import java.util.Scanner;
public class DIA3 {

    public static void main(String[] args) {
        
        System.out.println("ELIJA UNO DE LOS SIGUIENTES PROGRAMAS:");
        System.out.println("1. COMPARACION DE NUMEROS IGUALES ");
        System.out.println("2. NUMEROS POSITIVOS O NEGATIVOS");
        System.out.println("3. ORDENACION DE NUMEROS DESCENDENTE");
        System.out.println("4. ORDENACION DE NUMEROS ");
        System.out.println("5. CALENDARIO ");
        int naa;
        Scanner scan=new Scanner(System.in);
        System.out.println("ESCOJA UNA OPCION:"); // GET DATA FOR SWITCH
        naa=scan.nextInt();
        switch (naa)     // START SWITCH
        {
            case 1: 
                int  num1,num2; // PRIMER EJERCICIO 
        Scanner sca=new Scanner(System.in);

        System.out.println("INGRESE EL PRIMER NUMERO:");
        num1= sca.nextInt();
         System.out.println("INGRESE EL SEGUNDO NUMERO:");
        num2= sca.nextInt();
         if  (num1 == num2){
             System.out.println("INGRESO NUMEROS IGUALES");
         }
         else {
            System.out.println("LOS NUMEROS NO COINCIDEN");
         }
         break; // ENDS CASE 1
            case 2: 
        int  nume1; // NUMEROS POCITVOS O NEGATIVOS
        Scanner sca1=new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO POSITIVO O NEGATIVO:");
        nume1=sca1.nextInt();
                if (nume1>=+1) {
                    
                    System.out.println("El numero ingresado es positivo");
                }
                else if (nume1<=1) { 
                    System.out.println("El numero ingresado es negativo");
                }
                else
                System.out.println("TEXTO INGRESADO ES ERRONEO");
                break;// ENDS CASE 2
                
            case 3: 
                int valor1, valor2;
               Scanner sca2=new Scanner(System.in);
                System.out.println("INGRESE EL PRIMER NUMERO");
                valor1=sca2.nextInt();
                 System.out.println("INGRESE EL SEGUNDO NUMERO");
                valor2=sca2.nextInt();
                
                if (valor1>valor2) {
                    System.out.println(""+(valor1)+"y"+(valor2));
                }
                else if (valor2>valor1){
                System.out.println(""+(valor2)+"y"+(valor1));
                        }
                else
                System.out.println("TEXTO INGRESADO ES ERRONEO");
                break;// ENDS CASE 3
               
            case 4: 
                int valr1,valr2,valor3,mayor, men, midd;
               Scanner sca3=new Scanner(System.in);
                System.out.println("INGRESE EL PRIMER NUMERO");
                valr1=sca3.nextInt();
                 System.out.println("INGRESE EL SEGUNDO NUMERO");
                valr2=sca3.nextInt();
                System.out.println("INGRESE EL TERCER NUMERO");
                valor3=sca3.nextInt();
                
                if (valr1>valr2 && valr1>valor3) {
                    mayor=valr1;
                }else if (valr2>valr1 && valr2>valor3){
                   mayor=valr2;
                }
                else mayor=valor3;
                
                  if (valr1<valr2 && valr1<valor3) {
                    men=valr1;
                }else if (valr2<valr1 && valr2<valor3){
                   men=valr2;
                }
                else{ men=valor3;
                }
                midd=(valr1+valr2+valor3)-(mayor+men);
                System.out.println("El orden de los numeros es:");
                System.out.println(mayor+" "+ midd+ " "+ men);
                
                break;// ENDS CASE 4
               
                
                
                default:
            System.out.println("ESCOJA UNA OPCION VALIDA ");
        }// ENDS SWITCH 
         
        }  
    
    
}
