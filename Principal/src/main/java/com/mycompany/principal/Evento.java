/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

import java.util.ArrayList;

/**
 *
 * @author emers
 */
public class Evento {
    private String nome;
    private String data;
    private double valor_un;
    private int capacidade;
    private double valor_arrecadado;
    ArrayList<Ingresso> listaIngresso = new ArrayList();

    

    public double getValor_arrecadado() {
        return valor_arrecadado;
    }

    public void setValor_arrecadado(double valor_arrecadado) {
        this.valor_arrecadado = valor_arrecadado;
    }

    public ArrayList<Ingresso> getListaIngresso() {
        return listaIngresso;
    }

    public void setListaIngresso(ArrayList<Ingresso> listaIngresso) {
        this.listaIngresso = listaIngresso;
    }
    
    public Evento(String nome, String data, double valor_un, int capacidade){
        this.nome = nome;
        this.data = data;
        this.valor_un = valor_un;
        this.capacidade = capacidade;
    }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor_un() {
        return valor_un;
    }

    public void setValor_un(double valor_un) {
        this.valor_un = valor_un;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    
    
    public String toString(){
        String result;
        
        result = String.format("Nome: %s\n", nome) +
                String.format("Data: %s\n", data)+
                String.format("Valor do Ingresso Pista %f\n", valor_un)+
                String.format("Valor do Ingresso Vip: %f\n", valor_un * 1.3)+
                String.format("Valor do Ingresso Camarote: %f\n", valor_un * 1.6)+
                String.format("Capacidade maxima: %d\n", capacidade);
        
        return(result);
       
    }
    
    public String nomeevento(){
        String result;
        
        result = String.format("<1> %s\n", nome);
                
        
        return(result);
       
    }

   
}
