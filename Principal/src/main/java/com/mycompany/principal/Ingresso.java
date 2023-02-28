/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author emers
 */
public class Ingresso {
    private String nome;
    private String nomeEvento;
    private String cpf;
    private double categoria;
    private Evento evento;

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getCategoria() {
        return categoria;
    }

    public void setCategoria(double categoria) {
        this.categoria = categoria;
    }

   

   public double calcularIngresso(){
       return evento.getValor_un() * categoria;
   }
    
   public Ingresso(String nomeEvento, String nome, String cpf,double categoria){
        this.nomeEvento = nomeEvento;
        this.nome = nome;
        this.cpf = cpf;
        this.categoria = categoria;
    }
   
   public String toString(){
        String result;
        
        result = String.format("Nome do Evento: %s\n", nomeEvento) +
                String.format("Nome do Comprador: %s\n", nome)+
                String.format("Cpf do Comprador: %s\n", cpf)+
                String.format("Categoria %f\n",  categoria);
               
        
        return(result);
       
    }
    
   
}
