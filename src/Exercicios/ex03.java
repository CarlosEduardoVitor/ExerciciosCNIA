package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<String> nomes = new ArrayList<>();
        do {
            System.out.println("Digite uma frase: ");
            nomes.add(ler.nextLine().toLowerCase()) ;
        }  while(!nomes.contains("parar"));

        nomes.remove("parar");

        System.out.println("Digite a letra para os nomes aparecerem: ");
        String letra = ler.nextLine().toLowerCase();

        nomes.sort(String::compareToIgnoreCase);

        for (String nome : nomes) {
            if (nome.contains(letra)){
                System.out.println(nome);
            }
        }
    }

}
