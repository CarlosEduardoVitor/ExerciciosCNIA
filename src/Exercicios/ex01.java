package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex01 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int soma = 0;

        System.out.println("Digite um número para que a conta seja feita: (apenas números inteiros)");
        int num1 = ler.nextInt();

        List<Integer> lista = new ArrayList(num1);

        for (int i = num1; i > 0; i--) {
            lista.add(i);
            soma += i;
        }

        System.out.println(soma);
        System.out.println(lista);
    }
}
