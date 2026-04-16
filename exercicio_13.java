package aulasjava;

import java.util.Scanner;

public class Aula2_Cont12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        double valor1, valor2;
        int operacao;
        System.out.println("Digite um numero para: 1-somar, 2-Subtrair, 3-Multiplicar, 4-Dividir: ");
            operacao = scanner.nextInt();
            
            if (operacao == 0) {
                System.out.println("Operacao invalida!");
            }
            else{
            System.out.println("Agora digite dois numeros: ");
            System.out.println("Primeiro numero: ");
                valor1 = scanner.nextInt();
            System.out.println("Segundo numero: ");
                valor2 = scanner.nextInt();
                
                if (operacao == 4 && valor2 <= 0) {
                    System.out.println("Nao ha como dividir um numero por 0!");
                }
                else {
                    switch (operacao) {
                    case 1 -> System.out.println("Resultado: "+(valor1+valor2));
                    case 2 -> System.out.println("Resultado: "+(valor1-valor2));
                    case 3 -> System.out.println("Resultado: "+(valor1*valor2));
                    case 4 -> System.out.println("Resultado: "+(valor1/valor2));
                    }
                }
            }
    }
}
