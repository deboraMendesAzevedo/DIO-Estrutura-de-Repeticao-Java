package Repeticao.DoWhile;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int contador =0;

        System.out.println("Digite um número a ser tabuada : ");
        numero = scan.nextInt();
        System.out.println("Tabuada de "+ numero + " : ");
        do{
            System.out.println(numero + " X " + contador + " = " + (numero * contador));
            contador = contador + 1;
        }while (contador <= 10);
    }
}
