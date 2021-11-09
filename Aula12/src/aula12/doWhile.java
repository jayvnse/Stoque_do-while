
package aula12;


public class doWhile {
    public static void main(String[] args) {
        // DO WHILE (faça enquanto)  - Executa o bloco de cógdigo e depois ele checa a expressão. O bloco de código só deixa de ser executado se a expressão for falsa.
        
        int i = 1;
        int maximo = 15;
        
        do {
            System.out.println("Valor de i: " + i);
            i++;
        } while (i < maximo);
        System.out.println(i);
    } 
}

