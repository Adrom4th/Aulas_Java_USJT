package aulasjava;

import java.util.Scanner;

public class Aula4_Cont02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int Mvalor = Integer.MIN_VALUE;
        int[] nums = new int[5];
        
        System.out.println("Digite 5 numeros e direi o maior valor. ");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor "+(i+1)+": ");
                nums[i] = scanner.nextInt();
                
            if (nums[i] > Mvalor) {
                Mvalor = nums[i];
            }
        }
        
        System.out.println("Maior valor = "+Mvalor);
    }
}
