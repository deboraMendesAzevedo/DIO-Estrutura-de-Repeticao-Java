package Repeticao.While;

import java.util.Scanner;

public class nota {
    /*

******************************************************
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*******************************************************
*/
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int nota = 0;
        System.out.println("Digite uma nota entre 0 a 10 : ");
        nota = scan.nextInt();

        while(true){
            if (nota >= 0 && nota <=10){
                break;
            }
            else {
                System.out.println("Valor inválido");
                System.out.println("Digite uma nota entre 0 a 10 : ");
                nota = scan.nextInt();
            }

        }

    }

}
