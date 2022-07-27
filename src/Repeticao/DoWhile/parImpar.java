package Repeticao.DoWhile;

/*
********************************************
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
**********************************************
*/

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadePar = 0;
        int quantiadeImpar = 0;
        int quantidadeNumero;
        int contador = 0;
        int numero;

        System.out.println("Digite a quantidade de número que será digitada : ");
        quantidadeNumero = scan.nextInt();

        do{
            System.out.println("Digite o " + (contador +1) + "° número : " );
            numero = scan.nextInt();
            if(numero % 2 == 0){
                quantidadePar = quantidadePar + 1;
            }
            else {
                quantiadeImpar = quantiadeImpar + 1;
            }
            contador = contador + 1;
        }while (contador < quantidadeNumero);

        System.out.println("A quantidade de números pares é de : "+ quantidadePar);
        System.out.println("A quantidade de núero ímpares é de : " + quantiadeImpar);



    }
}
