
package Programas;

import java.util.Random;
import java.util.Scanner;

public class Programa2_a {
    
    public static void main(String[] args) {
        
          Scanner sc=new Scanner (System.in);
          
          System.out.println("Ingrese el tamaño del vector: ");
          
          int tam=sc.nextInt();
          
          Random randon = new Random();
		
		int [][] matriz = new int [tam][tam];
                
		for(int i = 0; i < tam; i++) {
			for(int j = 0; j < tam; j++) {
                            
                            int aleatorio=(int)(Math.random()*(200-100+1)+100);
                            matriz[i][j] = aleatorio;
			}
		}
		
                System.out.println("\nVECTOR DE " + tam + "x" + tam + " DE NUMEROS ALEATORIOS \n");
                
                String imprimir = "";
                
                for (int i=0; i<tam; i++) 
                {
                    for (int j=0; j<tam; j++)
                  
                {    

                 imprimir = imprimir +"| " + matriz[i][j];
                 
                }
                    imprimir = imprimir+"|\n";
                }
                    System.out.println(imprimir);     
    } 
}