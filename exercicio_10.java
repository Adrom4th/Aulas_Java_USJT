package aulasjava;

import java.util.Scanner;

public class Aula4_Cont09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];
        
        System.out.println("Digite os valores para duas matrizes.");
        System.out.println("Matriz A: ");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Linha "+(i+1)+" Valor "+(j+1)+": ");
                A[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Matriz B: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Linha "+(i+1)+" Valor "+(j+1)+": ");
                B[i][j] = scanner.nextInt();
            }
        }
        
       for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
       }
       
        System.out.println("Soma das matrizes A e B: ");
        
        for (int i = 0; i < 2; i++) {
            System.out.print("|");
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j]+" ");
            }
            System.out.println("|");
        }       
        scanner.close();
    }
 
}
