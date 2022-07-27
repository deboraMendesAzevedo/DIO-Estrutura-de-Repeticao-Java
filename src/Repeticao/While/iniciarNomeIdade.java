package Repeticao.While;

import java.util.Scanner;
/*

**********************************************************************
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
************************************************************************
*/

public class iniciarNomeIdade {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       String nome;
       int idade = 0;

       while (true) {
           System.out.println("Digite o nome : ");
           nome = scan.next();
           if (nome.equals("0")) {
               System.out.println("Até mais ...");
               break;
           }
           while(true) {
               System.out.println("Digite a idade : ");
               idade = scan.nextInt();
               if(idade>= 0 && idade <= 120) {
                   break;
               }
               else {
                   System.out.println("Idade inválida! ");

               }
           }
       }
   }
}
