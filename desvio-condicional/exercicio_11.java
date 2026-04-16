package aulasjava;

import java.util.Scanner;

public class Aula2_Cont10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
       int dia;
        
        System.out.println("Digite um numero para saber o dia da semana correspondente: ");
            dia = scanner.nextInt();
            
        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-Feira");
            case 3 -> System.out.println("Terca-Feira");
            case 4 -> System.out.println("Quarta-Feira");
            case 5 -> System.out.println("Quinta-Feira");
            case 6 -> System.out.println("Sexta-Feira");
            case 7 -> System.out.println("Sabado");
           
        }
                           
    }
}
