package aulasjava;

import java.util.Scanner;


public class Aula2_Cont04 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double num;
        
        System.out.println("Digite um numero e direi se ele e par ou impar: ");
            num = scanner.nextDouble();
        
        if (num == 0) {
            System.out.println("Numero invalido!");
        }
        else if (num % 2 == 0) {
            System.out.println("Numero Par");
        }
        else {
            System.out.println("Numero impar");
        }
    }
}
