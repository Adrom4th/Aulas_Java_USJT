package testes;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int numero;
        
        System.out.println("Digite um numero inteiro positivo e direi apenas seus antecessores pares.");
        
        do {
            System.out.println("Digite: ");
            numero = scanner.nextInt();
                
            if (numero <= 0) {
                System.out.println("Numero invalido! Digite novamente.");
            }
        }while (numero <= 0);
        
        System.out.println("Valores pares antes de "+numero+": ");
         
        for (int contador = 2; contador < numero; contador += 2) {
           
            System.out.println(contador);
        }
        
        scanner.close();
    }
}
