package aulasjava;

import java.util.Scanner; 

public class Aula4_Cont06 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            
            int[][] vetor = new int[3][3];
            
            System.out.println("Digite os valores de cada linha da matriz:");
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("Linha "+ (i+1)+" valor "+(j+1)+": ");
                    vetor[i][j] = scanner.nextInt();
                }
            }
            
            for (int i = 0; i < 3; i++) {
                int soma = 0;
                for (int j = 0; j < 3; j++) {
                    soma += vetor[i][j];
                }
                System.out.println("Soma da linha "+(i+1)+": "+soma);
            }
            
            scanner.close();
    }
    
}
