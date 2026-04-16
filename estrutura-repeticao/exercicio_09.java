package testes;

import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int numero; 
        int contador;
        String decisor;
        
        System.out.println("Digite um numero inteiro positivo e mostrarei sua tabuada.");
            
        do {
            do {
                System.out.println("Digite: ");
                numero = scanner.nextInt();
                scanner.nextLine();
            
                if (numero <= 0) {
                System.out.println("Numero invalido! Digite novamente.");
            }
            }while (numero <= 0);
        
            System.out.println("Tabuada do "+numero+": ");
                        
            for (contador = 1; contador <= 10; contador++) {
            System.out.println(numero+"x"+contador+" = "+(numero*contador));
        }
            System.out.println("Deseja realizar outra tabuada? ");
            decisor = scanner.nextLine();
        }while (decisor.equalsIgnoreCase("sim"));
        
        System.out.println("Ok. Finalizado!");
    }
  
}
