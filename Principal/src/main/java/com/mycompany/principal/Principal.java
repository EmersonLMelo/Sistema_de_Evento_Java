/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author emers
 */
public class Principal {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc, i;
        String w, x, v, r;
        double y;
        int z, q, e;
        ArrayList<Evento> listaEvento = new ArrayList();
        ArrayList<Ingresso> listaIngresso = new ArrayList();
        
        do{
        System.out.println("-------VENDAS DE INGRESSO-------\n <1> Cadastrar evento \n <2> Listar eventos \n <3> Vender Ingressos \n <4> Listar Ingressos Vendidos \n <5> Arrecadações Dos Eventos \n <0> Sair");
        opc = entrada.nextInt();
            switch (opc) {
                case 1: 
                    System.out.println("Digite o nome do evento: \n");
                    w = entrada.next();
                    System.out.println("Digite a data do evento:(xx/xx/xxxx) \n");
                    x = entrada.next();
                    System.out.println("Digite o valor do ingresso: \n");
                    y = entrada.nextDouble();
                    System.out.println("Digite a capacidade do evento: \n");
                    z = entrada.nextInt();
                    listaEvento.add(new Evento(w, x, y, z));
                    break;
                case 2: 
                    mostrar(listaEvento);
                    break;
                case 3: 
                    System.out.println("Digite o nome do evento: \n");
                    mostrarevento(listaEvento);
                    v = entrada.next();
                    System.out.println("Digite o nome do comprador: \n");
                    w = entrada.next();
                    System.out.println("Digite o CPF:(000.000.000-00) \n");
                    x = entrada.next();
                    System.out.println("Qual tipo de ingresso:\n <1> Pista \n <2> Vip \n <3> Camarote \n");
                    y = entrada.nextInt();
                    if(y == 1){
                        y = 1;
                    }else if(y == 2){
                        y = 1.3;
                    }else if(y == 3){
                        y = 1.6;
                    }
                    listaIngresso.add(new Ingresso(v, w, x, y));
                    
            
                    
                    break;
                case 4:
                    mostrarIngressos(listaIngresso);
                    break;
                case 5:
                    
                    break;
                default:
                    break;
            }

        }while(opc != 0);
    }
    public static void mostrar(ArrayList<Evento> lista){
        for(Evento item: lista){
            System.out.println(item.toString());
        }
    }
        public static void mostrarevento(ArrayList<Evento> lista){
        for(Evento item: lista){
            System.out.println( item.nomeevento());
        }
    }
        public static void mostrarIngressos(ArrayList<Ingresso> lista){
        for(Ingresso item: lista){
            System.out.println(item.toString());
        }
    }
       
}


