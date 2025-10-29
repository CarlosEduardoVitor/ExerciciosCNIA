package Exercicios;

import java.util.Scanner;

public class ex02 {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite uma frase: ");

        String frase = ler.nextLine().toLowerCase().trim().replace(" ", "");
        String fraseInvertida = new StringBuilder(frase).reverse().toString().toLowerCase();

        if (frase.equals(fraseInvertida)){
            System.out.println("A frase é um palíndromo: \n Frase original: " + frase + "\n Frase invertida: " + fraseInvertida);
        } else {
            System.out.println("A frase não é um palindromo");
        }
    }

}
