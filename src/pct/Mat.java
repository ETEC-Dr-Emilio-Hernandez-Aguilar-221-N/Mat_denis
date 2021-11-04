/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author manager
 */
public class Mat {
    public static void main(String[] args) {        
        //Declaração de variáveis
        int op;        
        //Objeto de entrada 
        Scanner entrada = new Scanner(System.in);
        //Apresentação        
        System.out.println("\n\n\t\t\t -- Sistema Matemático --");
        // Menu
        System.out.println("\t[1]. Fatorial");
        System.out.println("\t[2]. Média");
        System.out.println("\t[3]. Sair"); 
        //Opção do usuário
        System.out.print("\tO que deseja? : ");
        op = entrada.nextInt();
        
        do{        
            switch (op){
                case 1:
                    int n;
                    double fat = 1;           
                    //Fatorial
                    System.out.println("\t\t\tFatorial\n");
                    
                    //Entrada
                    System.out.print("\t\tInforme um número: ");
                    n = entrada.nextInt();
                    for(int i = n; i >= 1; i--){
                        fat *= i;
                        //System.out.println(fat); Essa linha me mostra os valores acumulando
                    }
                    //Saída
                    System.out.println("\t\t" + n + "! = " + fat + "\n\n");                    
                    break;
                case 2:
                    //Média
                    System.out.println("\t\t\tMédia\n");
                    break;
                case 3:
                    //Sair
                    System.out.println("\t\t\tVocê escolheu sair ...\n");
                    break;
                default:
                    System.out.println("\t\t\tOpção " + op + " incorreta!");
            }
        }while (op!=3);        
    }    
}
