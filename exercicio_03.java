package aulasjava;

import java.util.Scanner;

public class Aula2_Cont02 {
    
    public static void main(String[] args) {
        
        double nota;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite sua nota de 0 a 10: ");
            nota = scanner.nextDouble();
            
        if (nota >10) {
            System.out.println("Insira uma nota valida!");
        }
        else if (nota >= 7) {
            System.out.println("Aprovado!");   
        }
        else {
            System.out.println("Reprovado!");
        }        
    }
}
