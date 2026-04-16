package aulasjava;

import java.util.Scanner;

public class Aula4_Cont07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        double[][] notas = new double[2][4];
        
        System.out.println("Digite as notas de dois alunos.");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Aluno "+(i+1)+" nota "+(j+1)+": ");
                notas[i][j] = scanner.nextDouble();
            }
        }
        
        for (int i = 0; i < 2; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) { 
                soma += notas[i][j];
            }
            double media = soma/4;
            System.out.println("Media aluno "+(i+1)+": "+media);
        }
        
        scanner.close();
    }
 
}
