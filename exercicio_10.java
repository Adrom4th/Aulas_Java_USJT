package aulasjava;

import java.util.Scanner;

public class Aula2_Cont09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int ano;
        
        System.out.println("Digite um ano e direi se ele e Bissexto: ");
            ano = scanner.nextInt();
            
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano Bissexto!");
        }
        else {
            System.out.println("Ano Comum!");
        }   
    }
}
