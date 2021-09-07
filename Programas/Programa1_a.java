
package Programas;

import java.util.Random;
import java.util.Scanner;

public class Programa1_a {
    
    public static void main(String[] args) {

          Scanner sc=new Scanner (System.in);
          
          System.out.println("Ingrese el tamaño de columnas de la matriz: ");
          
          int n=sc.nextInt();
          
          System.out.println("Ingrese el tamaño de filas de la matriz: ");
          
          int m=sc.nextInt();
          
          Random randon = new Random();
		
		int [][] matriz = new int [n][m];
                
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
                            
                            matriz[i][j] = randon.nextInt(100);
			}
		}
		
                System.out.println("MATRIZ " + n + "x" + m + " DE NUMEROS ALEATORIOS \n");
                
                String imprimir = "";
                
                for (int i=0; i<n; i++)
                {
                    for (int j=0; j<m; j++)
                {    

                 imprimir = imprimir +"| " + matriz[i][j];
                 
                }
                    imprimir = imprimir+"|\n";
                }
                    System.out.println(imprimir);
    }
}