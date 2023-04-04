

/* Nome do Aluno: Rafael Rascado da Silva
* RA:
* Nome do Programa: Atividade 01
* Data: 04/04/2023
Faça um programa que leia dois números A e B e imprima o maior
deles.
*/

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {

    System.out.println("Digite o número A: ");
    Scanner teclado = new Scanner(System.in);
   
    double numeroA = teclado.nextDouble();
    System.out.println("Digite o número B: ");
    Scanner tecladoB = new Scanner(System.in);
    
    double numeroB = tecladoB.nextDouble();

    if(numeroA > numeroB){
      System.out.println("O maior número é o A no valor de: " + numeroA);
    } else if(numeroA < numeroB) {
      System.out.println("O maior número é o B no valor de: " + numeroB);
    } else {
      System.out.println("Os número são iguais no valor de: " + numeroA);
    }
  }
}