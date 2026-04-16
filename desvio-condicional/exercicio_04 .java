package aulasjava;

import java.util.Scanner;


public class Aula2_Cont03 {
    
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    
    double num;
    
    System.out.println("Digite um numero e direi se ele e positivo, negativo ou nulo: ");
        num = scanner.nextDouble();
        
    if (num == 0) {
        System.out.println("Valor nulo!");
    }
    else if (num >0) {
        System.out.println("Valor positivo!");
    }
    else
            System.out.println("Valor negativo!");
    }
}
