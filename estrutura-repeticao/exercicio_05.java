package aulasjava;
import java.util.Scanner;

public class Aula3_Cont05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int valores;
        int somador = 0;
        
        System.out.println("Digite quantos numeros inteiros quiser. Finalizarei a contagem quando for digitado 0.");
        
        do {
            System.out.println("Digite: ");
                valores = scanner.nextInt();
                somador += valores;
        }
        while (valores != 0);
                
        System.out.println("Sistema finalizado!");
        System.out.println("Soma dos valores digitados: "+somador);
    }
}
