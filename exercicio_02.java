package aulasjava;

import java.util.Scanner;

public class Aula4_Cont01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        double[] notas = new double[6];
        double soma = 0;
        
        System.out.println("Digite as notas dos 6 alunos: ");
        
        for (int i = 0; i < 6; i++) {
        System.out.print("Aluno/nota "+(i+1)+": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        double media = soma/6;
        
        System.out.println("Media das notas: "+media);
    } 
}
