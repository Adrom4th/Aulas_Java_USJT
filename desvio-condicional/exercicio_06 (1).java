package aulasjava;

import java.util.Scanner;

public class Aula2_Cont05 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        int idade;
        
        System.out.println("Digite sua idade e direi se e Crianca, Adolescente ou Adulto: ");
            idade = scanner.nextInt();
            
        if (idade <= 0) {
            System.out.println("Idade invalida!");
        }
        else if (idade < 12) {
            System.out.println("Voce e crianca.");
        }
        else if (idade >= 12 && idade <= 17) {
            System.out.println("Voce e adolescente.");
        }
        else {
            System.out.println("Voce e adulto");
        }
       
    }
}
