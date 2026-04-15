package aulasjava;

import java.util.Scanner;

public class Aula2_Cont11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        double valor, resultado;
        
        System.out.println("Digite o valor da compra: ");
            valor = scanner.nextDouble();
            
            resultado = valor;
            
            if (valor <= 0) {
                System.out.println("Valor invalido!");
            }
            else if (valor > 500) {
                System.out.println("Desconto de 15% aplicado. Valor total final: "+resultado*0.85);
            }
            else if (valor >= 200 && valor <= 500) {
                System.out.println("Desconto de 10% aplicado. Valor total fianl: "+resultado*0.90);
            }
            else
                System.out.println("Desconto de 5% aplicado. Valor total final: "+resultado*0.95);
    }
}
