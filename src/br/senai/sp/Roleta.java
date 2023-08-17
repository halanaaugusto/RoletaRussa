package br.senai.sp;

import java.util.Random;
import java.util.Scanner;

/**
 * Roleta Russa
 * Data: 17/08/2023
 * Autor: Halana Augusto
 */

public class Roleta {
    public static void main(String[] args) {
        /** Declarar as variáveis */
        int userNumber, numberRandom;
        String nome;
        boolean continuar = true;

        /** Instanciar Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Instanciar Random */
        Random random = new Random();

        while (continuar) {

            /** Coletar Dados */
            System.out.println("========================================================");
            System.out.println("------------------ Bem Vindo ------------------");
            System.out.print("Qual é o seu nome: ");
            nome = teclado.next();
            System.out.print("Olá, " + nome + " Digite seu número da sorte [1-10]: ");
            userNumber = teclado.nextInt();
            System.out.println("========================================================");

            /** Lógica do Jogo */

            numberRandom = random.nextInt(3) + 1;

            if (userNumber == numberRandom) {
                continuar = false;
                System.out.println("Game Over!");
            } else {
                System.out.println("Parabéns!! Você ganhou!");
            }

        }


    }
}
