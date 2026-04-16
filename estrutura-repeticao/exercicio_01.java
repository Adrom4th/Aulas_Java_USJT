package aulasjava;

public class Aula3 {
    public static void main(String[] args) {
        
        int numero = 1;
        
        System.out.println("Comando While");
        
        while(numero <=10) {
        System.out.println("Numero "+numero);
            numero += 1;   // = numero = numero + 1
        }
        
        numero = 1;
        System.out.println("Comando Do While");
        
        do {
            System.out.println("Numero "+numero);
                numero ++;  // = numero = numero + 1
        }
        while (numero <=10);
        
        
        System.out.println("Comando For");
        
        // ValorInicial; Condição; Passos
        for (numero = 1; numero<=10; numero = numero + 1){
            System.out.println("Numero "+numero);
        }
    }  
}
