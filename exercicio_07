package testes;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        double nota;
        
        System.out.println("Avalie-nos com uma nota de 0 a 10.");
        
        do {
            System.out.println("Sua nota: ");
                nota = scanner.nextDouble();
                
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota invalida! Digite novamente.");
                }
        }while (nota < 0 || nota > 10);
        
        System.out.println("Nota valida. Obrigado pela sua avaliacao!");
        
        scanner.close();
    }
}
