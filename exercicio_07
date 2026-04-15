package aulasjava;

import java.util.Scanner;

public class Aula2_Cont06 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int valor1, valor2, valor3;
        
        System.out.println("Vamos descubrir se 3 valores formam um triangulo.");
        System.out.println("Tambem direi se o triangulo e Equilatero, Isosceles ou Escaleno");
        System.out.println("Digite o primeiro valor: ");
            valor1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
            valor2 = scanner.nextInt();
        System.out.println("Digite o terceiro valor: ");
            valor3 = scanner.nextInt();
            
        if (valor1 + valor2 > valor3) {
            System.out.println("Valores formam um triangulo!");
       
        if (valor1 == valor2 && valor2 == valor3) {
            System.out.println("O triangulo e Equilatero.");
        }
        else if (valor1 == valor2 || valor2 == valor3 || valor3 == valor1){
            System.out.println("O triangulo e Isosceles.");
        }
        else if (valor1 != valor2 && valor2 != valor3) {
            System.out.println("O triangulo e Escaleno.");
        }
        } else {
            System.out.println("Valores invalidos! Nao formam um triangulo");
        }
        
    }
}
