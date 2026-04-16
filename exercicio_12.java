package testes;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];
        
        System.out.println("Preencha os valores de duas matrizes 2x2.");
        
        System.out.println("Matriz A: ");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print("Linha "+(i+1)+ " Valor "+(j+1)+": ");
                a[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Matriz B: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Linha "+(i+1)+ " Valor "+(j+1)+": ");
                b[i][j] = scanner.nextInt();
            }
        }
        
        // Matriz c
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 2; k++) {  // variável que possibilita a multiplicação da linha matriz A com a coluna matriz B
                    c[i][j] += a[i][k] * b[k][j]; // operação
                }
            }
        }
        
        // visualizador
        
        System.out.println("Matriz A: "); 
        for (int i = 0; i < 2; i++){
            System.out.print("|");
           for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j]+" ");               
           }
           System.out.println("|");
        }
        
        System.out.println("Matriz B: "); 
        for (int i = 0; i < 2; i++){
            System.out.print("|");
           for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j]+" ");               
           }
           System.out.println("|");
        }
        
        System.out.println("Matriz resultante C (AxB): ");
        
        for (int i = 0; i < 2; i++){
            System.out.print("|");
           for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j]+" ");               
           }
           System.out.println("|");
        }
    }
}
