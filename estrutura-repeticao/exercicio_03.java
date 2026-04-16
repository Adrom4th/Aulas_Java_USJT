package aulasjava;

import java.util.Scanner;

public class Aula3_Cont03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int resultado;
        int valor1 = 1;
        
        System.out.println("Digite um numero e direi a soma dos valores anteriores: ");
            numero = scanner.nextInt();
            
        for (resultado = 1; resultado < numero; resultado += 1) {
                System.out.println(valor1+"+"+resultado+"="+(resultado+valor1));
        }
    }
}
