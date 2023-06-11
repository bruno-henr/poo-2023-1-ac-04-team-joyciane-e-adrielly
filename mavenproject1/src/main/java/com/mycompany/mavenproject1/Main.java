package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade;

        System.out.println("Informe a idade da pessoa: ");
        idade = ler.nextInt();

        if (idade < 16) {
            System.out.println("\nNao eleitor.\n");
        } else if ((idade >= 18) && (idade <= 65)) {
            System.out.println("\nEleitor obrigatorio.\n");
        } else {
            System.out.println("\nEleitor facultativo.\n");
        }
        
    }
}
