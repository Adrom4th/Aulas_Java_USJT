package testes;

import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int num1, num2, intervalo;
        
        System.out.println("Digite 2 numeros inteiros e direi os que estao entre eles.");
        System.out.println("Valor1: ");
        num1 = scanner.nextInt();
        
        do {
            System.out.println("Valor2: ");
            num2 = scanner.nextInt();
            
            if (num2 <= num1) {
                System.out.println("Invalido! O numero 2 deve ser maior e diferente do numero 1. Digite novamente.");
            }
        }while (num2 <= num1);
        
        System.out.println("Valores entre "+num1+" e "+num2);
        
        for (intervalo = num1 + 1; intervalo < num2; intervalo++) {
            System.out.println(intervalo);
        }
    }  
}
