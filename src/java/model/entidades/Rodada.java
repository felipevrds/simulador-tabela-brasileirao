/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades;

/**
 *
 * @author Valdeir
 */
public class Rodada {
    
    private int id_rodada = 0;
    private String descricao = "";
    
    public Rodada(){
        
    }

    public int getId_rodada() {
        return id_rodada;
    }

    public void setId_rodada(int id_rodada) {
        this.id_rodada = id_rodada;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }      
}
