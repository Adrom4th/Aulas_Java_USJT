package aulasjava;

import java.util.Scanner;

public class Aula4_Cont03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[] nums = new int[10];
        System.out.println("Digite apenas numeros pares ate 20.");
        
        for (int i = 0; i < 10; i++) {
        do{
            System.out.println("Numero "+(i+1)+": ");
                nums[i] = scanner.nextInt();
                
            if (nums[i] % 2 !=0 || nums[i] > 20) {
                System.out.println("Numero invalido. Digite novamente: ");
            }
        }while (nums[i] % 2 !=0 || nums[i] > 20);
    }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero "+(i+1)+": "+nums[i]);
        }        
    }
}
