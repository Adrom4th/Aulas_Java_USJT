package aulasjava;

import java.util.Scanner;

public class Aula4_Cont10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[] nums = new int[8];
        int aux;
        
        System.out.println("Digite 8 valores inteiros. Nao se importe com a ordem, pois eu os organizarei.");
        
        for (int i = 0; i <nums.length; i++) {
            System.out.println("Valor "+(i+1)+": ");
            nums[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < (nums.length-1); j++) {
                if (nums[j] > nums[j+1]) {
                    aux = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = aux;
                }
            }
        }
        
        System.out.println("Valores ordenados: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    
}
