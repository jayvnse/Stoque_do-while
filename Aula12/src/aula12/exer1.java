
package aula12;
import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        /* Faça um programa que peça uma nota, entre zero e dez. Mostre uma
        mensagem caso o valor seja inválido e continue pedindo até que o
        usuário informe um valor válido. */
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com uma nota");
        double nota = scan.nextDouble();
        
        while (nota < 0 || nota > 10){
            System.out.println("Você digitou uma nota inválida, tente novamente");
            System.out.println("Entre com uma nota");
            nota = scan.nextDouble();
        }       
            
            
            
        /*boolean notaValida = false;
        
        do {
            System.out.println("Entre com uma nota");
            double nota = scan.nextDouble();

            if(nota >= 0 && nota <= 10){
                notaValida = true;
            } else {
                System.out.println("Você digitou uma nota inválida, tente novamente");
            }
        } while (!notaValida);*/
        
        scan.close();
    }
}

