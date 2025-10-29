package Exercicios;

import java.util.Scanner;
import java.util.*;


public class ex04 {
    static Scanner ler = new Scanner(System.in);


    public static void main(String[] args) {

        String ingles;
        String traducao;
        String palavra;

        Map<String, String> mapa = new HashMap<>();


        do {

            System.out.println("Digite uma palavra em inglês: ");
            ingles = ler.nextLine().toLowerCase() ;
            if (!ingles.equals("sair")){
                System.out.println("Digite a tradução dessa palavra: ");
                traducao = ler.nextLine().toLowerCase();
                mapa.put(ingles, traducao);
            } else {
                while (!ingles.contains("sair"));

            }
        } while(!ingles.contains("sair"));

        mapa.remove("sair");

        System.out.println("Digite uma palavra em inglês para saber a tradução: ");
        palavra = ler.nextLine().toLowerCase();
        System.out.println("A tradução da palavra escrita é: "+ mapa.get(palavra));


    }


}
