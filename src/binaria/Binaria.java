/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binaria;

import java.util.Scanner;

/**
 *
 * @author guada
 */
public class Binaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println(".        B I E N V E N I D O       .");  
          System.out.println("A   B U S Q U E D A   B I N A R I A");
          System.out.println("");
          System.out.println("......................................");
          System.out.println("");
        Scanner entra=new Scanner(System.in);
        int elemento[]=new int[8];
        System.out.println("Por favor, ingresar 8 numeros:");
        System.out.println("____________");
          System.out.println("");
        for(int i=0;i<8;i++){
            elemento[i]=entra.nextInt();
        }

        System.out.println("Ingresa tu numero a buscar");
        int numBuscar=entra.nextInt();

        int n=elemento.length, inf=0,centro=0;
        int sup=n-1;
        boolean bandera=false;
        while(inf<=sup){
            centro=(sup+inf)/2;
            if(elemento[centro]==numBuscar){
                bandera=true;
                break;
            }
            else if(numBuscar<elemento[centro]){
                sup=centro-1;
            }
            else{
                inf=centro+1;
            }
           
        }
        
            System.out.println("..................................");
             System.out.println("");
        if(bandera==true){
            System.out.println("Tu numero se encuetra en la posición "+(centro+1));
        }
          
        else{
            System.out.println("");
            System.out.println("Lo siento, tu numero no a sido encontrado");
        }
          System.out.println("");
          System.out.println("Vuelva pronto 😉");

    
    }
    
}
