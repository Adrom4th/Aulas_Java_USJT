package testes;

import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
     int nums;
     int Mvalor = Integer.MIN_VALUE;
     
        System.out.println("Digite 5 numeros inteiros e direi qual o maior.");
           
        for (int contador = 1; contador <= 5; contador++) {
           System.out.println("Numero "+contador+" : ");
           nums = scanner.nextInt(); 
           
           if (nums > Mvalor) {
               Mvalor = nums;
           }
        }
        System.out.println("Maior valor: "+Mvalor);
        
        scanner.close();
    }
}
