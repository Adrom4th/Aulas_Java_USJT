package testes;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int senha;
        int contador;
        
        System.out.println("Digite sua senha para entrar: ");
        
        for (contador = 1; contador <= 3; contador++){
            senha = scanner.nextInt();
            
            if(senha == 1234){
                System.out.println("Acesso permitido. Bem-vindo!");
                break;
            }         
            else if (contador < 3){
                System.out.println("Senha incorreta. Digite novamente: ");
            }            
            else {
                System.out.println("Acesso bloqueado. Tente novamente mais tarde.");
            }
        }
        
    }
}
