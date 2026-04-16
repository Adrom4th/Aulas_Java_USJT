package aulasjava;
import java.util.Scanner;

public class Aula3_Cont02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int numero;
        int resultado;
        
        System.out.println("Digite um numero e direi sua tabuada completa: ");
            numero = scanner.nextInt();
            
        for (resultado =1; resultado <=10; resultado += 1) {
            System.out.println(numero+"x"+resultado+"="+(numero*resultado));
        }        
    }
}
