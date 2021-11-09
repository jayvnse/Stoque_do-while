
package aula12;

import java.util.Scanner;


public class exer2 {
    public static void main(String[] args) {
        /* Faça um programa que leia um nome de usuário e a sua senha e não
        aceite a senha igual ao nome do usuário, mostrando uma mensagem
        de erro e voltando a pedir as informações. */
        
        Scanner scan = new Scanner(System.in);
        
        boolean infoValida = false;
        
        do{        
            System.out.println("Entre com o nome de usuário");
            String userName = scan.next();

            System.out.println("Entre com a senha");
            String userPassword = scan.next();
            
            if (userPassword.equalsIgnoreCase(userName)){
                System.out.println("Senha igual ao usuário, tente novamente.");
            } else{
                infoValida = true;
            }
        } while (!infoValida);
    }
}
