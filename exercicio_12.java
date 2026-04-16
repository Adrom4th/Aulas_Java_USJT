package testes;

import java.util.Scanner;

public class ExercicioTreze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        double notas;
        double soma = 0;
        
        System.out.println("Digite a nota de 5 alunos de 0 a 10 que eu calcularei a media entre elas.");
        
        for (int contador = 1; contador <= 5; contador++){
            do {
                System.out.println("Nota "+contador+": ");
                notas = scanner.nextDouble();
                
                if (notas < 0 || notas > 10) {
                    System.out.println("Nota invalida! Digite novamente");
                }
            }while (notas < 0 || notas > 10);
            
            soma += notas;
        }
        double media = soma/5;
        
        System.out.println("Media entre as notas = "+media);
    }  
}
