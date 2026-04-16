package aulasjava;

import java.util.Scanner;

public class Aula4_Cont04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        double[] vendas = new double[5];
        double soma = 0;
        
        System.out.println("Digite o valor das 5 vendas do mes.");
        
        for (int i = 0; i < 5; i++) {
            do{
                System.out.println("Venda "+(i + 1)+": ");
                vendas[i] = scanner.nextDouble();
                
                
                if (vendas[i] <= 0) {
                    System.out.println("Valor da venda deve ser superior a 0! Digite novamente.");
                }
            }while (vendas[i] <= 0);
            
            soma += vendas[i];
        }
        
        double media = soma/5;
        
        System.out.println("Valor total de vendas: "+soma);
        System.out.println("Media das vendas: "+media);
    } 
}
