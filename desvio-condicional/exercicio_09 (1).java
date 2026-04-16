package aulasjava;

import java.util.Scanner;

public class Aula2_Cont08 {
    public static void main(String[] args) {
        
        double x, y;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite dois valores reais. Cada valor sera uma coordenada X e Y de um plano cartesiano. ");
        System.out.println("Assim que inseridos, direi em qual quadrante o ponto se encontra!");
        System.out.println("Valor de X: ");
            x = scanner.nextDouble();
        System.out.println("Valor de Y ");
            y = scanner.nextDouble();
            
        if (x == 0 || y == 0) {
            System.out.println("Pontos estao sobre o Eixo!");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Primeiro Quadrante. Ambos valores sao positivos!");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Segundo Quadrante. X e negativo e Y e positivo!");
        }
        else if (x < 0 && y <0) {
            System.out.println("Terceiro Quadrante. Ambos valores sao negativos!");
        }
        else {
            System.out.println("Quarto Quadrante. X e positivo e Y e negativo!");
        }
    }
}
