package aulasjava;

import java.util.Scanner;

public class Aula3_Cont04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int valores;
        int contador = 0;
        
        System.out.println("Digite quantos numeros inteiros quiser. Finalizarei a contagem quando for digitado 0.");
            
        do {
                System.out.println("Digite: ");
                   valores = scanner.nextInt();
                   if (valores != 0) {
                       contador += 1;
                   }
        }
            while (valores != 0);
            System.out.println("Sistema finalizado!");
            System.out.println("Quantidade de numeros digitados: "+contador);
    }    
}
