package aulasjava;

import java.util.Scanner;

public class Aula2_Cont07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        double peso, altura, resultado;
        
        System.out.println("Vamos calcular seu IMC e verificar sua situacao.");
        System.out.println("Primeiro, digite seu peso: ");
            peso = scanner.nextDouble();
        System.out.println("Agora, sua altura: ");
            altura = scanner.nextDouble();
            
            resultado = (peso / (altura*altura));
            
        if (resultado < 18.5) {
            System.out.println("Seu IMC e "+resultado+ ". Voce esta abaixo do peso!");
        }
        else if (resultado >= 18.5 && resultado <= 24.9) {
            System.out.println("Seu IMC e "+resultado+ ". Voce esta com peso ideal!");
        }
        else if (resultado >= 25 && resultado <=29.9) {
            System.out.println("Seu IMC e "+resultado+ ". Voce esta acima do peso!");
        }
        else
                System.out.println("Seu IMC e "+resultado+ ". Voce esta obeso!");
    }
}
